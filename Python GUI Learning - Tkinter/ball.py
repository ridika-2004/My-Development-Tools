class ball:
    def __init__(self,canvas,x,y,diameter,velocityx,velocityy,color):
        self.canvas = canvas
        self.velocityx = velocityx
        self.velocityy = velocityy
        self.image = canvas.create_oval(x,y,diameter,diameter,fill=color)

    def move(self):
        coordinates = self.canvas.coords(self.image)
        # print(coordinates)
        if(coordinates[2]>=(self.canvas.winfo_width()) or coordinates[0]<0):
            self.velocityx = -self.velocityx

        if(coordinates[3]>=(self.canvas.winfo_height()) or coordinates[1]<0):
            self.velocityy = -self.velocityy

        self.canvas.move(self.image,self.velocityx,self.velocityy)
