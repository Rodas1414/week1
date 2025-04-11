# Filename: customer_data_cleaner.py
# Name :RodasGebreyohanees
# Date: July 31, 2024
# Description: This script contains the function to clean and format customer data from a given input string.

def clean_customer_data(customer_string):
    """
    Clean and parse customer data from a string.

    Args:
        customer_string (str): The input string containing customer data.

    Returns:
        dict: A dictionary containing the cleaned and parsed customer data.
    """
    # Split the input string into fields using the '#' character as a separator
    fields = customer_string.replace('O', '0').split('#')
    
    # Ensure we have all the expected fields
    if len(fields) < 4:
        raise ValueError("Input string does not have enough fields separated by '#'.")

    customer_data = {}

    # Extract and clean the customer number
    customer_number = ''.join(filter(str.isdigit, fields[0]))
    if not customer_number:
        raise ValueError("Customer number field is invalid or missing.")
    customer_data['Customer number'] = customer_number

    # Extract and clean the customer last name and first name
    names = fields[1].split(', ')
    if len(names) != 2:
        raise ValueError("Name field does not contain both last and first names.")
    customer_data['Customer last name'] = names[0].strip()
    customer_data['Customer first name'] = names[1].strip()

    # Extract and clean the customer area code and phone number
    phone = ''.join(filter(str.isdigit, fields[2]))
    if len(phone) < 10:
        raise ValueError("Phone number field is not valid.")
    customer_data['Customer area code'] = phone[:3]
    customer_data['Customer phone'] = phone[3:]

    # Extract and clean the customer balance
    try:
        balance = float(fields[3].strip('$').replace(',', ''))
    except ValueError:
        raise ValueError("Balance field is not a valid number.")
    customer_data['Customer balance'] = balance

    return customer_data


def main():
    """
    Main function to handle user input and output.
    """
    # Prompt the user to enter a customer string
    customer_string = input("Enter customer string: ")

    try:
        # Clean and parse the customer data
        customer_data = clean_customer_data(customer_string)

        # Display the cleaned customer data
        for key, value in customer_data.items():
            print(f"{key} : {value}")
    except ValueError as e:
        print(f"Error: {e}")

if __name__ == "__main__":
    main()
