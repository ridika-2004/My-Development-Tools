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

        label = QLabel("Hello Guys", self)
        label.setFont(QFont("Arial",30))
        label.setGeometry(0,0,screen_width,200)
        label.setStyleSheet("color : #005b96;"
                            # "background-color : #b3cde0;"
                            "font-weight : bold;"
                            # "font-style : italic;"
                            # "text-decoration : underline;"
                            )
        
        # label.setAlignment(Qt.AlignTop) # vertically top
        # label.setAlignment(Qt.AlignBottom) # vertically bottom
        # label.setAlignment(Qt.AlignVCenter) # vertically center
        # label.setAlignment(Qt.AlignRight) # horizontally right
        # label.setAlignment(Qt.AlignLeft) # horizontally left
        # label.setAlignment(Qt.AlignHCenter) # horizontally center

        label.setAlignment(Qt.AlignVCenter | Qt.AlignHCenter) # center

        imagelabel = QLabel(self)
        imagelabel.setGeometry(750,250,400,400)

        pixmap = QPixmap("cool.png")
        imagelabel.setPixmap(pixmap)
        imagelabel.setScaledContents(True)

        label2 = QLabel("I am cool right?", self)
        label2.setFont(QFont("Arial",30))
        label2.setGeometry(0,700,screen_width,200)
        label2.setStyleSheet("color : #005b96;"
                            # "background-color : #b3cde0;"
                            "font-weight : bold;"
                            # "font-style : italic;"
                            # "text-decoration : underline;"
                            )
        label2.setAlignment(Qt.AlignVCenter | Qt.AlignHCenter)

def main():
    app = QApplication(sys.argv)
    window = mainwindow()
    window.show()
    sys.exit(app.exec_()) # execution method

if __name__ == "__main__":
    main()