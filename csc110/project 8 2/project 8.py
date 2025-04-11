#Rodas Gebreyohannes
#project 8 
#csc 110
def main():
    """
    This function reads data from a file and calculates statistics
    on the pollutant levels in a river for a given month.
    """
    # Ask the user for input
    while True:
        river = input("Which river? ").strip()
        if not river:
            print("Error: River name cannot be empty. Please try again.")
            continue
        break

    while True:
        try:
            month = int(input("Which month (e.g., 1 for January)? "))
            if 1 <= month <= 12:
                break
            else:
                print("Error: Month number must be between 1 and 12. Please try again.")
        except ValueError:
            print("Error: Month number must be an integer. Please try again.")

    while True:
        try:
            pollutant = int(input("Available pollutants:\n1. Arsenic\n2. Lead\n3. Fertilizer\n4. Pesticides\nWhich pollutant? "))
            if 1 <= pollutant <= 4:
                break
            else:
                print("Error: Pollutant number must be between 1 and 4. Please try again.")
        except ValueError:
            print("Error: Pollutant number must be an integer. Please try again.")

    # Initialize variables
    count = 0
    total = 0.0
    minimum = float('inf')
    maximum = float('-inf')

    # Open the input file
    with open("PollutionSummary.txt", "r") as f:
        for line in f:
            # Read the data from the file
            data = line.strip().split("\t")
            if data[0] == river and int(data[1][5:7]) == month and int(data[2]) == pollutant - 1:  # Adjust pollutant index
                count += 1
                total += float(data[3])
                if float(data[3]) < minimum:
                    minimum = float(data[3])
                if float(data[3]) > maximum:
                    maximum = float(data[3])

    # Open the output file
    with open("RiverPollutionData.txt", "w") as f:
        # Write the header to the file
        f.write(f"Data for river: {river}\n")
        f.write(f"Data for month: {month}\n")
        f.write(f"Data for pollutant: {pollutant}\n")
        f.write(f"Number of readings: {count}\n")
        if count > 0:
            f.write(f"Average of readings: {total / count:.3f}\n")
        else:
            f.write("No readings to calculate average.\n")
        f.write(f"Lowest reading: {minimum:.3f}\n")
        f.write(f"Highest reading: {maximum:.3f}\n")

    print("Processing is complete. See summary file for results.")

if __name__ == "__main__":
    main()
 # Approach:
# I approached this assignment by first reading the problem statement and understanding the requirements. 
 #Then, I designed a step-by-step approach to solve the problem. I started by asking the user for input, then I read the data from the file, calculated the statistics, and finally wrote the results to the output file.

# Getting stuck and unstuck:
# I got stuck when I was trying to read the data from the file and calculate the statistics. 
#I was having trouble understanding how to iterate over the file and extract the relevant data. I got unstuck by breaking down the problem into smaller steps and focusing on one step at a time. I also used online resources and debugging techniques to identify and fix errors.

# Testing:
# I tested my program by running it with different inputs and verifying that the output was correct. 
#I tested it with different rivers, months, and pollutants, and I also tested it with invalid inputs to make sure it handled errors correctly.

# What doesn't work as I'd like:
# One thing that doesn't work as I'd like is that the program overwrites the input file instead of writing to a separate output file. It would be better if it wrote to a separate file to preserve the original data.

# What I learned:
# I learned how to read and write files in Python, how to calculate statistics, and how to handle user input. I also learned how to debug my code and identify errors.

# What I'll do differently:
# In the next project, I'll make sure to write to a separate output file instead of overwriting the input file. I'll also try to make my code more modular and reusable, and I'll add more error handling to make it more robust.