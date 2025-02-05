import sys
from PyQt5.QtWidgets import QApplication,QMainWindow
from PyQt5.QtGui import QIcon

class mainwindow(QMainWindow):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("My first pyqt5 program")
        self.setGeometry(700,300,500,500) # putting them center of my screen, 500x500 is the geometry
        self.setWindowIcon(QIcon("cool.png"))

def main():
    app = QApplication(sys.argv)
    window = mainwindow()
    window.show()
    sys.exit(app.exec_()) # execution method

if __name__ == "__main__":
    main()