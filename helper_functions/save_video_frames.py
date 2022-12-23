import cv2

# Opens the Video file
cap= cv2.VideoCapture('video.mp4')
i=0
frames_captured = 0
while(cap.isOpened()):
    ret, frame = cap.read()
    if ret == False:
        break
    # start at 16 seconds, end at 166 seconds, take 2 frames per second
    if i > 1000 and i < 10000 and i % 15 == 0:
    	cv2.imwrite("images/"+str(frames_captured)+'.png',frame)
    	frames_captured+=1
    i+=1
    if i > 10000:
    	break
    

cap.release()
cv2.destroyAllWindows()
