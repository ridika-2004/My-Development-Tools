class shinigami:
    def __init__(self,name,division):
        self.name = name
        self.division = division
        self.zanpakutos = []

    def add_zanpakuto(self,zanpakuto):
        self.zanpakutos.append(zanpakuto)

    def show_zanpakuto(self):
        for x in self.zanpakutos:
            print(f"Shikai is {x.shikai} and bankai is {x.bankai}")

class zanpakuto:
    def __init__(self,shikai,bankai):
        self.shikai = shikai
        self.bankai = bankai

ichigo = shinigami("kurosaki ichigo","sepcial")
zangetsu = zanpakuto("getsuga tensho", "tensa zangetsu")

ichigo.add_zanpakuto(zangetsu)

print(ichigo.name)
ichigo.show_zanpakuto()
