class bleach_spirites:

    def __init__(self,name):
        self.name = name

    def non_human(self):
        print(f"{self.name} is not human")

class shinigami(bleach_spirites):
    def zanpakuto(self):
        print(f"{self.name} has zanpakuto")

class quincy(bleach_spirites):
    def cross(self):
        print(f"{self.name} has cross")

class isshin(shinigami):
    pass

class ichigo(shinigami,quincy):
    pass

class ichida(quincy):
    pass

class masaki(quincy):
    pass

class rukia(shinigami):
    pass

ichigo = ichigo("kurosaki ichigo")
ichigo.cross()
ichigo.zanpakuto()

rukia = rukia("kuchiki rukia")
rukia.zanpakuto()

masaki = masaki("kurosaki masaki")
masaki.non_human()