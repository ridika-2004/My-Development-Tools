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
        self.setStyleSheet("background-color : #f6e0b5")
        self.setWindowIcon(QIcon("cool.png"))
        self.checkBox = QCheckBox("Do you love anime?", self)
        self.label = QLabel(self)
        self.initUI()

    def initUI(self):
        self.checkBox.setGeometry(750,100,500,500)
        self.checkBox.setStyleSheet("font-size : 50px; font-family : Ink Free;")
        self.label.setGeometry(800,400,500,200)
        self.label.setStyleSheet("font-size : 40px; font-family : Ink Free;")
        self.checkBox.setChecked(False)
        self.checkBox.stateChanged.connect(self.checkboxchecked)

    def checkboxchecked(self,state):
        if state==Qt.Checked:
            self.label.setText("Let's be friends!!")
        else :
            self.label.setText("Oh no!")
    

if __name__ == "__main__":
    app = QApplication(sys.argv)
    window = mainwindow()
    window.show()
    sys.exit(app.exec_()) # execution method