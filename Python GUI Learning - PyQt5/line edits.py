import sys
from PyQt5.QtWidgets import *
from PyQt5.QtGui import *
from PyQt5.QtCore import *

class mainwindow(QMainWindow):
    def __init__(self):
        super().__init__()

        screen = QDesktopWidget().screenGeometry()
        screen_width = screen.width()
        screen_height = screen.height()


        self.setWindowTitle("Line edits in pyqt5 program")
        self.setGeometry(0,0,screen_width,screen_height)
        self.setWindowIcon(QIcon("cool.png"))
        self.setStyleSheet("background-color : #191c27")

        self.label = QLabel("Enter your name", self)
        self.label.setGeometry(100,50,1700,100)

        self.line_edit = QLineEdit(self)
        self.button = QPushButton("Submit",self)


        self.initUI()

    def initUI(self):
        self.line_edit.setGeometry(100,350,340,70)
        self.line_edit.setStyleSheet("background-color : #ffffff; font-size : 30px")
        self.label.setStyleSheet("font-size : 70px; color : #ffffff; font-family : Arial; font-weight : bold;")

        self.button.setGeometry(450,350,100,70)
        self.button.setStyleSheet("background-color : #b2cded;")
        self.button.clicked.connect(self.submit)

    def submit(self):
        name = self.line_edit.text()
        self.label.setText("Hello "+name+"! Hope you become happy in your life")

    

if __name__ == "__main__":
    app = QApplication(sys.argv)
    window = mainwindow()
    window.show()
    sys.exit(app.exec_()) # execution method