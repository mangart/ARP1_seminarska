import os
import glob
import csv
import cv2

path = "./images"
save_file = open("labels.csv", "w")
writer = csv.writer(save_file)


images = os.listdir(path)

for path_img in images:
	print(path_img)
	img = cv2.imread(path +"/"+path_img)
	cv2.namedWindow("image", cv2.WINDOW_NORMAL)
	cv2.setWindowProperty("image to label", cv2.WND_PROP_FULLSCREEN, cv2.WINDOW_FULLSCREEN)
	
	cv2.imshow("image", img)
	
	id = None
	
	while(True):
		k = cv2.waitKey(33)
		if k == 48:
			id = 0
			print("0")
			break
		if k == 49:
			id = 1
			print("1")
			break
		if k == 50:
			id = 2
			print("2")
			break
		if k == 51:
			id = 3
			print("3")
			break
		if k == -1:
			continue
		print("dont know this key, try again", k)
	
	writer.writerow([path_img, id])
		
save_file.close()
	
