class student:

    village = "konoha"
    teacher = "hiruzen"
    num_of_student = 0;
    def __init__(self,name,age):
        self.name = name
        self.age = age
        student.num_of_student+=1;

student1 = student("naruto", 17)
student2 = student("sasuke",18)

print(student1.name)
print(student1.age)
print(student1.village)

print(student.teacher)
print(student.num_of_student)
