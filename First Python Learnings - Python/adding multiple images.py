import cv2 
import numpy

# Read First Image 
img1 = cv2.imread('cold.png') 

# Read Second Image 
img2 = cv2.imread('hot.png') 


# concatenate image Horizontally 
Hori = numpy.concatenate((img1, img2), axis=1) 
# concatenate image Vertically 
Verti = numpy.concatenate((img1, img2), axis=0) 

cv2.imshow('HORIZONTAL', Hori) 
# cv2.imshow('VERTICAL', Verti) 

cv2.waitKey(0) 
cv2.destroyAllWindows() 
