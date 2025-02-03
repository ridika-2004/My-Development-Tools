class kurama:
    def __init__(self,tail):
        self.tail = tail

class rasengaan:
    def __init__(self,size):
        self.size = size

class shinobi:
    def __init__(self,name,clan,tail,rasengaan_size):
        self.name = name
        self.clan = clan
        self.tail = kurama(tail)
        self.rasengaan_size = rasengaan(rasengaan_size)

    def display(self):
        print(f"This is {self.name} {self.clan}")
        print(f"From {self.clan} clan")
        print(f"Owner of a {self.tail.tail} tail-zinchuriki")
        print(f"Rasengaan size is {self.rasengaan_size.size}")

naruto = shinobi("naruto","uzumaki",9,"big")
naruto.display()


