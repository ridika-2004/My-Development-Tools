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

        self.label = QLabel("Select One Of Them I'll Give You A Movie", self)
        self.label.setGeometry(0,0,screen_width,200)

        self.radio1 = QRadioButton("Quentin Tarantino", self)
        self.radio2 = QRadioButton("Martin Scorsese", self)
        self.radio3 = QRadioButton("Stanley Kubrick", self)
        self.radio4 = QRadioButton("David Fincher", self)
        self.radio5 = QRadioButton("Francis Ford Coppola", self)

        self.button_group = QButtonGroup(self)
        self.initUI()

    def initUI(self):
        self.radio1.setGeometry(750,300,500,50)
        self.radio2.setGeometry(750,360,500,50)
        self.radio3.setGeometry(750,420,500,50)
        self.radio4.setGeometry(750,480,500,50)
        self.radio5.setGeometry(750,540,500,50)

        self.setStyleSheet("QRadioButton{font-size : 32px; padding : 5px;}")

        self.label.setFont(QFont("Arial",20))
        self.label.setAlignment(Qt.AlignVCenter | Qt.AlignHCenter) # center
        self.label.setStyleSheet("font-weight : bold;")

        self.button_group.addButton(self.radio1)
        self.button_group.addButton(self.radio2)
        self.button_group.addButton(self.radio3)
        self.button_group.addButton(self.radio4)
        self.button_group.addButton(self.radio5)

        self.radio1.toggled.connect(self.button_changed)
        self.radio2.toggled.connect(self.button_changed)
        self.radio3.toggled.connect(self.button_changed)
        self.radio4.toggled.connect(self.button_changed)
        self.radio5.toggled.connect(self.button_changed)

    def button_changed(self):
        radio_button = self.sender()
        if radio_button.isChecked():
            if radio_button == self.radio1:
                self.label.setText("Pulp Fiction")
            elif radio_button == self.radio2:
                self.label.setText("Shutter Island")
            elif radio_button == self.radio3:
                self.label.setText("The Shining")
            elif radio_button == self.radio4:
                self.label.setText("Fight Club")
            elif radio_button == self.radio5:
                self.label.setText("Bram Stoker's Dracula")
    

if __name__ == "__main__":
    app = QApplication(sys.argv)
    window = mainwindow()
    window.show()
    sys.exit(app.exec_()) # execution method