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


        self.setWindowTitle("My first pyqt5 program")
        self.setGeometry(0,0,screen_width,screen_height)
        self.setWindowIcon(QIcon("cool.png"))
        self.button = QPushButton("Click me!",self)
        self.label = QLabel("Hello, I am Ridika!!",self)
        self.initUI()

    def initUI(self):
        self.button.setGeometry(850,400,200,100)
        self.button.setStyleSheet("font-size : 30px;")
        self.button.clicked.connect(self.onclick)
        self.label.setGeometry(800,500,500,500)
        self.label.setStyleSheet("font-size : 40px;")

    def onclick(self):
        self.label.setText("Nice to meet you!!")

def main():
    app = QApplication(sys.argv)
    window = mainwindow()
    window.show()
    sys.exit(app.exec_()) # execution method

if __name__ == "__main__":
    main()