class uchiha:
    strong = True

class madara(uchiha):
    def power(self):
        print("I,Madara, declare you as the best coder!!")

class sasuke(uchiha):
    def power(self):
        print("Jamatelu saske uchiwwa")

class obito(uchiha):
    def power(self):
        print("Rin...")

class itachi(uchiha):
    def power(self):
        print("Sasuke...")

class kakashi:

    Strong = True;
    def power(self):
        print("I also have susano")

uchihas = [madara(),sasuke(),obito(),itachi()]

for x in uchihas:
    x.power()
    print(x.strong)