class villains:
    def __init__(self,name,origin,lost_to):
        self.name = name
        self.origin = origin
        self.lost_to = lost_to

    def description(self):
        print(f"villain {self.name} from {self.origin} lost to {self.lost_to}")


class madara(villains):
    pass

class aizen(villains):
    def isdead(self):
        print(f"{self.name} isn't dead yet")

madara = madara("madara uchiha","naruto","hidden leaf ninjas")
madara.description()

aizen = aizen("aizen sosuke", "bleach", "kurosaki ichigo")
aizen.isdead()