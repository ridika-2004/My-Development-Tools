from fastapi import FastAPI, Path
from typing import Optional
from pydantic import BaseModel
# Pydantic model used in FastAPI to define the shape of data

app = FastAPI() # instance

student = {
    1 : {
    "name": "John",
    "age": 20,
    "courses": ["Math", "Physics"]
    }, 
    2 : {
    "name": "Jane",
    "age": 22,
    "courses": ["Biology", "Chemistry"]
    },
    3 : {
    "name": "herok",
    "age": 30,
    "courses": [
    "server programming", "algorithm" ]
    }
    
}

class Student(BaseModel): # class for request body
    name : str
    age : int
    courses : list

class updateStudent(BaseModel): # class for updating student
    name : Optional[str] = None
    age : Optional[int] = None
    courses : Optional[list] = None

@app.get("/") # routing

def index():
    return {"hello"}

@app.get("/get-student/{id}") # path parameter
def get_student(id : int = Path(description="The ID of the student you want to view", gt=0, lt=10)):
    return student[id]["name"]

@app.get("/get-by-name") # query parameter
def get_student_by_name(*, age : int, name : Optional[str]= None): # asterisk means all following parameters are keyword only
    for id in student:
        if student[id]["age"] == age:
            return student[id]
        else:
            if student[id]["name"] == name:
                return student[id]
    
    return {"blank"}
        
@app.post("/create-student/{id}") # post request with path parameter
def create_student(id : int, data : Student):
    if id in student:
        return {"student already exists"}
    else :
        student[id] = data
        return student[id]

@app.put("/update-student/{id}") # put request with path parameter
def update_student(id : int, data : updateStudent):
    if id not in student:
        return {"student does not exist"}
    else :
        if data.name != None:
            student[id]["name"] = data.name
        if data.age != None:
            student[id]["age"] = data.age
        if data.courses != None:
            student[id]["courses"] = data.courses
        return student[id]
    
@app.delete("/delete-student/{id}") # delete request with path parameter
def delete_student(id : int):
    if id not in student:
        return {"student does not exist"}
    else :
        del student[id]
        return {"student deleted"}