from flask import Flask, redirect, url_for, render_template

# create an instance of flask
app = Flask(__name__)

@app.route("/") 
# function will return what to be displayed
def home():
    # return "<h1>Hello, Flask!<h1>"
    return render_template("excercise.html")

@app.route("/walk")
def walking():
    return render_template("walking.html", time="30", calories="150")

# @app.route("/<name>")
# def user(name):
#     return f"<h2>Hello, {name}!<h2>"

# @app.route("/admin")
# def admin():
#     return redirect(url_for("user", name = "Admin"))

if __name__ == "__main__":
    app.run(debug=True)