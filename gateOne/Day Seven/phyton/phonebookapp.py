first_name = []
second_name = []
phone_number = []

while True:
    prompt = """
    1 -> Add Contact
    2 -> Remove Contact
    3 -> Find Contact By Phone Number
    4 -> Find Contact By Last Name
    5 -> Edit Contact
    6 -> Exit
    """
    print(prompt)
    user_input = input("Enter any of the selected options above: ")
    
    match user_input:
        case '1':
            print("Add Contact")
            print("WELCOME TO ADDING OF CONTACT")
            while True:
                user_first_name = input("Enter the first name you want to save: ")
                first_name.append(user_first_name)
                user_last_name = input("Enter the last name you want to save: ")
                second_name.append(user_last_name)
                user_phone_number = input("Enter the phone number you want to save: ")
                if len(user_phone_number) != 11:
                    print("This contact can't be added unless you enter an 11-digit number")
                    print("The phone number you want to save must be up to 11 digits")  
                else:
                    phone_number.append(user_phone_number)
                    print("Contact added successfully")
                user_input = input("Do you still wish to add more contacts? (yes or no): ")
                if user_input.lower() != "yes":
                    break
        case '2':
            print("Remove Contact")
            if first_name:
                user_input_choice = input("Press 1 to remove by the first name or 2 to remove by the last name: ")
                if user_input_choice == '1':
                    contact_remove = input("Enter the first name of the contact you wish to remove: ")
                    index_remover = first_name.index(contact_remove)
                    if index_remover != -1:
                        first_name.pop(index_remover)
                        second_name.pop(index_remover)
                        phone_number.pop(index_remover)
                        print("Contact removed successfully")
                    else:
                        print("The contact you were trying to remove was not found.")
                elif user_input_choice == '2':
                    contact_remove = input("Enter the last name of the contact you wish to remove: ")
                    index_remover = second_name.index(contact_remove)
                    if index_remover != -1: 
                        first_name.pop(index_remover)
                        second_name.pop(index_remover)
                        phone_number.pop(index_remover)
                        print("Contact removed successfully")
                    else:
                        print("The contact you were trying to remove was not found.")
                else:
                    print("Invalid choice")
            else:
                print("There are no contacts to remove.")
        case '3':
            print("Find Contact By Phone Number")
        case '4':
            print("Find Contact By Last Name")
        case '5':
            print("Edit Contact")
        case '6':
            print("Exit")
            break
        case _:
            print("Out of options")


