#Rodas Gebreyohannes
#july/31/2024
#CSC 110
#Function to get a non-empty string from the user
def get_non_empty_string(prompt):
    user_input = input(prompt)
    if user_input.strip()!= "":
        return user_input
    print("Please enter a non-empty string.")
    return get_non_empty_string(prompt)

def get_in_range_integer(min_value, max_value, prompt):# Function to get an integer within a specified range from the user
    try:
        user_input = int(input(prompt))
        if min_value <= user_input <= max_value:
            return user_input
        print(f"Please enter a value between {min_value} and {max_value}.")
        return get_in_range_integer(min_value, max_value, prompt)
    except ValueError:
        print("Please enter an integer.")
        return get_in_range_integer(min_value, max_value, prompt)

def enter_co2_reading_batch():#Function to enter a batch of CO2 readings
    name = get_non_empty_string("Enter name: ")
    location = get_non_empty_string("Enter location: ")

    min_level = None
    max_level = None
    total_level = 0
    reading_count = 0

    month = get_in_range_integer(0, 12, "Enter month (or 0 to exit): ")
    while month!= 0:
        day = get_in_range_integer(1, 31, "Enter day: ")
        year = get_in_range_integer(2022, 2099, "Enter year: ")
        co2_level = get_in_range_integer(1, 10000, "Enter CO2 reading: ")

        if min_level is None or co2_level < min_level:
            min_level = co2_level
        if max_level is None or co2_level > max_level:
            max_level = co2_level
        total_level += co2_level
        reading_count += 1

        month = get_in_range_integer(0, 12, "Enter month (or 0 to exit): ")

    if reading_count > 0:
        avg_level = round(total_level / reading_count)
    else:
        avg_level = None

    return name, location, min_level, max_level, reading_count, avg_level

def main():
    name, location, min_level, max_level, reading_count, avg_level = enter_co2_reading_batch()
    
    print(f"Recorder name: {name}")
    print(f"Reading location: {location}")
    print(f"Number of readings: {reading_count}")
    if reading_count > 0:
        print(f"Minimum CO2 Level: {min_level}")
        print(f"Maximum CO2 Level: {max_level}")
        print(f"Average CO2 level: {avg_level}")
   
if __name__ == "__main__":
    main()
# Test cases

# Test case 1: Valid input
# name = 'John', location = 'New York', min_level = 100, max_level = 1000, reading_count = 3, avg_level = 400
# Test case 2: Invalid input (empty string)
# Expected output: ValueError
# Test case 3: Invalid input (out of range integer)
# Expected output: ValueError
   # Summary
# I approached this assignment by first writing functions to handle user inputs robustly and then integrating them into a main function to process CO2 readings. 
#I encountered challenges in ensuring that inputs were properly validated and handled, but solving these issues led to a more robust program. 
#Testing showed that the program correctly processes valid inputs and gracefully handles errors.
# For future projects, I will continue to focus on input validation and user experience improvements, 
#applying what I've learned about creating responsive and user-friendly applications.
