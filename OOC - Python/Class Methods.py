class shinigami:
        count =0
        def __init__(self,name,is_strong):
            self.name = name
            self.is_strong = is_strong
            shinigami.count+=1

        def details(self):
            print(f"It is {self.is_strong} that {self.name} is very strong")

        @classmethod
        def get_count(cls):
             print(f"total shinigamis you created : {cls.count}")

shinigami1 = shinigami("ichigo",True)
shinigami1.details()
shinigami2 = shinigami("soi-fon",False)
shinigami2.details()
shinigami.get_count()