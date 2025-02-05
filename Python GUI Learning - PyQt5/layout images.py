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
        self.initUI()

    def initUI(self):
        central_widget = QWidget()
        self.setCentralWidget(central_widget)

        label1 = QLabel("The", self)
        label2 = QLabel("Layers", self)
        label3 = QLabel("Of", self)
        label4 = QLabel("Ocean", self)
        label5 = QLabel("Water", self)

        label1.setStyleSheet("background-color : #b3cde0; color : #011f4b")
        label2.setStyleSheet("background-color : #6497b1; color : #03396c")
        label3.setStyleSheet("background-color : #005b96; color : #ffffff;")
        label4.setStyleSheet("background-color : #03396c; color : #6497b1;")
        label5.setStyleSheet("background-color : #011f4b; color : #b3cde0;")

        label1.setAlignment(Qt.AlignVCenter | Qt.AlignHCenter)
        label2.setAlignment(Qt.AlignVCenter | Qt.AlignHCenter)
        label3.setAlignment(Qt.AlignVCenter | Qt.AlignHCenter)
        label4.setAlignment(Qt.AlignVCenter | Qt.AlignHCenter)
        label5.setAlignment(Qt.AlignVCenter | Qt.AlignHCenter)

        vbox = QVBoxLayout()

        vbox.addWidget(label1)
        vbox.addWidget(label2)
        vbox.addWidget(label3)
        vbox.addWidget(label4)
        vbox.addWidget(label5)

        central_widget.setLayout(vbox)

        # hbox = QHBoxLayout()

        # hbox.addWidget(label1)
        # hbox.addWidget(label2)
        # hbox.addWidget(label3)
        # hbox.addWidget(label4)
        # hbox.addWidget(label5)

        # central_widget.setLayout(hbox)

        # grid = QGridLayout()

        # grid.addWidget(label1,0,1)
        # grid.addWidget(label2,0,2)
        # grid.addWidget(label3,1,0)
        # grid.addWidget(label4,1,1)
        # grid.addWidget(label5,1,2)

        # central_widget.setLayout(grid)

def main():
    app = QApplication(sys.argv)
    window = mainwindow()
    window.show()
    sys.exit(app.exec_()) # execution method

if __name__ == "__main__":
    main()