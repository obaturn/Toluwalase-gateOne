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
5 -> Edit Contact
6 -> Exit
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
        console.log("WELCOME TO REMOVE CONTACT");
        if(firstNameArray.length > 0) {
            let userWish = prompt("Press 1 to remove by first name or 2 to remove by last name: ");
            switch(userWish) {
                case '1': 
                    let firstNameRemove = prompt("Enter the first name you wish to remove: ");
                    let indexCheck = firstNameArray.indexOf(firstNameRemove);
                    if(indexCheck != -1) {
                        firstNameArray.splice(indexCheck, 1);
                        console.log("Contact deleted successfully");
                    } else {
                        console.log("Contact not found");
                    }
                    break;
                case '2':
                    if(secondNameArray.length > 0) {
                        let lastNameRemove = prompt("Enter the last name you want to remove: ");
                        let indexCheckTwo = secondNameArray.indexOf(lastNameRemove);
                        if(indexCheckTwo != -1) {
                            secondNameArray.splice(indexCheckTwo, 1);
                            console.log("Last name removed successfully");
                        } else {
                            console.log("The contact you are trying to remove does not exist in the list");
                        }
                    } else {
                        console.log("Second name array is empty");
                    }
                    break;
                default:
                    console.log("Invalid option");
            }
        } else {
            console.log("First name array is empty");
        }
        break;
    case '3':
        console.log("WELCOME TO FIND CONTACT BY PHONE NUMBER");
        if(phoneNumberArray.length > 0) {
            let numberFind = prompt("Find Contact By Phone Number: ");
            let indexNumber = phoneNumberArray.indexOf(numberFind);
            if(indexNumber != -1) {
                console.log("The contact of this phone number " + numberFind + " is found");
            } else {
                console.log("The phone number " + numberFind + " is not found");
            }
        } else {
            console.log("Phone number  is empty there is nothing to find");
        }
        break;
    case '4':
        console.log("WELCOME TO FIND CONTACT BY LAST NAME");
        let lastNameFind = prompt("Enter the last name you wish to find: ");
        let lastNameIndex = secondNameArray.indexOf(lastNameFind);
        if(lastNameIndex != -1) {
            console.log("The contact with last name " + lastNameFind + " is found");
        } else {
            console.log("The last name " + lastNameFind + " is not found");
        }
        break;
    case '5':
        console.log("WELCOME TO EDITING OF CONTACT");
        if(firstNameArray.length > 0){
            let firstNameEdit = prompt("Enter the first name of the contact you wish to edit: ");
            let indexFirstNameEdit = firstNameArray.indexOf(firstNameEdit);
            if(indexFirstNameEdit != -1){
                let newFirstNameEdit = prompt("Enter the new name you want the first name to be edited to: ");
                firstNameArray[indexFirstNameEdit] = newFirstNameEdit;
                console.log("First name has been changed successfully to your new first name");
            } else {
                console.log("The first name you want to edit can't be found");
            }
        } else {
            console.log("First name array is empty");
        }
        if(secondNameArray.length > 0){
            let lastNameEdit = prompt("Enter the last name of the contact you wish to edit: ");
            let indexLastNameEdit = secondNameArray.indexOf(lastNameEdit);
            if(indexLastNameEdit != -1){
                let newLastNameEdit = prompt("Enter the new last name you want it to be changed to: ");
                secondNameArray[indexLastNameEdit] = newLastNameEdit;
                console.log("Last name has been changed successfully to your new last name");
            } else {
                console.log("The last name you want to edit can't be found");
            }
        } else {
            console.log("Second name array is empty");
        }
        break;
    case '6':
        console.log("Exit");
        break;
    default:
        console.log("Invalid option selected");
}
