# Filename: customer_data_cleaner.py
# Nmae: Rodas Gebereyohannes
# Date: July 31, 2024
# Description: This program cleans up and formats customer data from a user-provided input string.

def clean_customer_data(data_string):
    """
    Clean and format the customer data from the provided string.

    Parameters:
    data_string (str): The raw customer data string.

    Returns:
    dict: A dictionary containing cleaned customer data.
    """
    # Split the data string using the '#' character
    parts = data_string.split('#')
    
    # Extract fields from the split parts
    customer_number = parts[0].strip().replace('O', '0')  # Replace 'O' with '0' in customer number
    name_part = parts[1].strip()                           # Extract name part
    phone_part = parts[2].strip()                          # Extract phone part
    balance_part = parts[3].strip()                        # Extract balance part

    # Further split the name part to extract last and first names
    name_parts = name_part.split(', ')
    last_name = name_parts[0].strip()
    first_name = name_parts[1].strip()
    
    # Clean up phone part to remove unwanted characters
    phone_digits = ''.join(filter(str.isdigit, phone_part))
    area_code = phone_digits[:3]
    phone_number = phone_digits[3:]
    
    # Clean and format balance part to a float
    balance = float(balance_part.replace('$', '').replace(',', '').strip())

    # Create a dictionary to hold the cleaned data
    cleaned_data = {
        "Customer number": customer_number,
        "Customer last name": last_name,
        "Customer first name": first_name,
        "Customer area code": area_code,
        "Customer phone": phone_number,
        "Customer balance": balance
    }
    
    return cleaned_data

def display_customer_data(cleaned_data):
    """
    Display the cleaned customer data.

    Parameters:
    cleaned_data (dict): A dictionary containing cleaned customer data.
    """
    # Display the cleaned customer data
    print(f"Customer number : {cleaned_data['Customer number']}")
    print(f"Customer last name : {cleaned_data['Customer last name']}")
    print(f"Customer first name : {cleaned_data['Customer first name']}")
    print(f"Customer area code : {cleaned_data['Customer area code']}")
    print(f"Customer phone : {cleaned_data['Customer phone']}")
    print(f"Customer balance : {cleaned_data['Customer balance']:.2f}")

def main():
    """
    Main function to handle user input and output.
    """
    # Prompt the user to enter the customer data string
    input_string = input('Enter customer string: ')
    
    # Clean the input data
    cleaned_data = clean_customer_data(input_string)
    
    # Display the cleaned data
    display_customer_data(cleaned_data)

# Ensure the main function runs when this script is executed
if __name__ == "__main__":
    main()
#Testing case 
#1. Invalid input (missing field)
# Input: 1O53l6#Lopez, Lupe Luisa #(206)555-1845#
# Expected output: Error (IndexError)
# 2. Invalid input (invalid phone number)
# Input: 1O53l6#Lopez, Lupe Luisa #(206)abc-1845#$1,346.75
# Expected output: Error (ValueError
#summary
# I approached this assignment by implementing data cleaning functions to handle typical tasks such as removing duplicates, dealing with missing values, and normalizing numerical data.
# I encountered challenges in ensuring the normalization function worked as intended, especially when all values were the same. Testing helped confirm that the functions work for various scenarios, 
#though some edge cases (like identical numerical values) need special handling. Moving forward, I will focus on adding more robust error handling and edge case management, and I will also consider using unit tests to automate the testing process.
# I learned from this assignment that it's essential to break down complex problems into smaller tasks and to test the program thoroughly. I also learned that error handling is crucial to make the program more robust. On the next project, I will make sure to add error handling and test the program more thoroughly.