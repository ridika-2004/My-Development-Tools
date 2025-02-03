class shinigami:
        def __init__(self,name,is_strong):
            self.name = name
            self.is_strong = is_strong

        def details(self):
            print(f"It is {self.is_strong} that {self.name} is very strong")

        @staticmethod
        def is_a_captain(name):
             captains= ["yamamoto","shunsui","zaraki","unohana","soi-fon","byakuya","aizen","mayuri","ukitake","urahara","hitsugaya","tosen","doge"]
             return name in captains    

print(shinigami.is_a_captain("ichigo"))

shinigami1 = shinigami("ichigo",True)
shinigami2 = shinigami("lisa",False)
shinigami3 = shinigami("zaraki",True)

shinigami1.details()
shinigami2.details()
shinigami3.details()