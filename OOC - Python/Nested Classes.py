class soul_society:
    class quincy:
        def __init__(self,name,is_strong):
            self.name = name
            self.is_strong = is_strong

        def details(self):
            print(f"It is {self.is_strong} that {self.name} is very strong")

    def __init__(self,has_bowarrow,reishi):
        self.has_bowarrow = has_bowarrow
        self.reishi = reishi
        self.quincies =[]

    def add_quincies(self,name,is_strong):
        new_quincy = self.quincy(name,is_strong)
        self.quincies.append(new_quincy)

    def list_quincies(self):
        for x in self.quincies:
            x.details()

quincy = soul_society(False,"Huge")
quincy.add_quincies("yhwach",True)
quincy.add_quincies("ichigo",True)
quincy.add_quincies("ishida",True)
quincy.add_quincies("masaki",False)

# print(quincy.reishi)

quincy.list_quincies()