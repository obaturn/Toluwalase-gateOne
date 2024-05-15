const prompt = require("prompt-sync")();

const MyArray = ["firstNameArray" , "secondNameArray" , "phoneNumberArray"]

String prompt = """
1 -> Add Contact
2 -> Remove Contact
3 -> Find Contact By Phone Number
4 -> Find Contact By Last Name
5 -> Edit  Contact
	""";
console.log(prompt);
userInput = prompt("select any of the options you see")();