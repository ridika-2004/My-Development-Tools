from abc import ABC,abstractmethod

class village(ABC):

    @abstractmethod
    def kage(self):
        pass

class hidden_leaf(village):
    def kage(self):
        print("The hokage is Naruto Uzumaki")

class hidden_cloud(village):
    def kage(self):
        print("The raikage is Darui")

konohagakure = hidden_leaf()
konohagakure.kage()

kumogakure = hidden_cloud()
kumogakure.kage()



