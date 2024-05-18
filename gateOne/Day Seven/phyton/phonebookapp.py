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
                    if contact_remove in first_name:
                        index_remover = first_name.index(contact_remove)
                        first_name.pop(index_remover)
                        print("Contact removed successfully")
                    else:
                        print("The contact you were trying to remove was not found.")
                elif user_input_choice == '2':
                    contact_remove = input("Enter the last name of the contact you wish to remove: ")
                    if contact_remove in second_name:
                        index_remover = second_name.index(contact_remove)
                        first_name.pop(index_remover)
                        print("Contact removed successfully")
                    else:
                        print("The contact you were trying to remove was not found.")
                else:
                    print("Invalid choice")
            else:
                print("There are no contacts to remove.")
        case '3':
            print("Find Contact By Phone Number")
            if phone_number:
                phone_num_to_find = input("Enter the phone number you want to find: ")
                if phone_num_to_find in phone_number:
                    index_finder = phone_number.index(phone_num_to_find)
                    print(f"phone number found")
                else:
                    print("Contact not found")
            else:
                print("There are no contacts to search.")
        case '4':
            print("Find Contact By Last Name")
            if second_name:
                last_name_to_find = input("Enter the last name you want to find: ")
                if last_name_to_find in second_name:
                    index_finder = second_name.index(last_name_to_find)
                    print(f"Contact found")
                else:
                    print("Contact not found")
            else:
                print("There are no contacts to search.")
        case '5':
            print("Edit Contact")
            if first_name:
                first_name_to_edit = input("Enter the first name you want to edit: ")
                if first_name_to_edit in first_name:
                    index_editor = first_name.index(first_name_to_edit)
                    new_first_name = input("Enter the new first name: ")
                    first_name[index_editor] = new_first_name
                    print("First name updated successfully")
                else:
                    print("Contact not in the list")
            else:
                print("There are no contacts to edit.")
            if second_name:
                second_name_to_edit = input("Enter the last name you want to edit: ")
                if second_name_to_edit in second_name:
                    index_editor = second_name.index(second_name_to_edit)
                    new_last_name = input("Enter the new last name: ")
                    second_name[index_editor] = new_last_name
                    print("Last name updated successfully")
                else:
                    print("Contact not in the list")
            else:
                print("There are no contacts to edit.")
        case '6':
            print("Exit")
            break
        case _:
            print("Out of options")
