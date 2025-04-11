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