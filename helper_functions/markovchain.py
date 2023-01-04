import csv

transitions = ["00", "01", "02", "03", "10", "11", "12", "13", "20","21","22","23","30","31","32","33"]
count = [0]*16
numoftrans = 0

mydict = {}

with open('labels.csv') as csvfile:
	reader = csv.reader(csvfile, delimiter=',')
	
	for row in reader:
		if len(row) != 2:
			continue
		mydict[row[0]] = row[1]

i = 0
previous = None
while i < len(mydict):
	current = mydict[str(i)+".png"]
	if previous == None:
		previous = current
		continue
	c = str(previous) + str(current)
	ii = transitions.index(c)
	count[ii] += 1
	previous = current
	i+=1
		
transof = [count[0]+count[1]+count[2]+count[3], count[4]+count[5]+count[6]+count[7], count[8]+count[9]+count[10]+count[11], count[12]+count[13]+count[14]+count[15]]

ind = 0
for i,t in enumerate(transitions):
	print(t, count[i]*100/transof[ind], "%")
	if i == 3 or i==7 or i==11:
		ind += 1
		print("-----------")
		

