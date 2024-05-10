user_name = str(input("what is your name"))
words = [9]
for word in range(0 ,3):
	for letters in range(0 ,3):
		user_input = str(input("enter the alphabet x or o"))
		
	if user_input == "x" and user_input == "o":
		words[word][letters] = user_input
	else:
		print('invalid input pls put in the correct own')
		words[word][letters] = user_input

for word in range(0 ,3):
	for letters in range(0 ,3):
		print(number[word][letters])