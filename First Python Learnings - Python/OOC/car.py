class car:
    def __init__(self, model, year, color, for_sale):  # constructor
        self.model = model
        self.year = year
        self.color = color
        self.for_sale = for_sale

    def drive(self):
        print(f"Driving a {self.color} {self.model}")

    def stop(self):
        print(f"Stop this {self.color} {self.model}")