const prompt = require('prompt-sync')();
let firstNameArray = [];
let secondNameArray = [];
let phoneNumberArray = [];

let menu = `
Choose Your Options
1 -> Add Contact
2 -> Remove Contact
3 -> Find Contact By Phone Number
4 -> Find Contact By Last Name
5 -> Exit
`;
console.log(menu);
let userInput = prompt("WELCOME TO OUR PHONE APP: ");
switch(userInput) {
    case '1':
        console.log("WELCOME TO ADDING OF CONTACTS");
        do {
            let firstName = prompt("Enter the first name you wish to save: ");
            firstNameArray.push(firstName);
            let lastName = prompt("Enter the last name you wish to save: ");
            secondNameArray.push(lastName);
            let phoneNumber;
            do {
                phoneNumber = prompt("Enter the phone number you wish to save: ");
                if (phoneNumber.length != 11) {
                    console.log("The phone number you want to save must be 11 digits.");
                }
            } while (phoneNumber.length != 11);
            phoneNumberArray.push(phoneNumber);
            console.log("Contacts added successfully");
            let userResponse = prompt("Do you still wish to add more (yes or no): ");
        } while (userResponse.toLowerCase() === 'yes');
        break;
    case '2':
        console.log("Remove Contact selected");
        break;
    case '3':
        console.log("Find Contact By Phone Number selected");
        break;
    case '4':
        console.log("Find Contact By Last Name selected");
        break;
    case '5':
        console.log("Exit selected");
        break;
    default:
        console.log("Invalid option selected");
}
