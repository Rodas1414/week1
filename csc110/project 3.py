#Rodas Gebreyohannes
# Coder : Your Name
# Date : MM/DD/YY
# Program : Program Template Generator
# Description : Generates a Python program header and section headings


# Define the width of the banner
BANNER_WIDTH = 70

# Define global variables to store user inputs
coder_name = ""
date = ""
program_name = ""
description = ""

# Define functions

def main():
    """
    The main function coordinates the execution of the program.
    Calls collectInputs to gather user data,
    displayBanner to show the program banner,
    and displaySectHeaders to show the section headers.
    """
    collectInputs()
    displayBanner()
    displaySectHeaders()

def collectInputs():
    """
    Collects user input for the program header and description.
    Stores these inputs in global variables.
    """
    global coder_name, date, program_name, description # Declare that we will be using the global variables
    coder_name = input("Enter your name: ")
    date = input("Enter the date: ")
    program_name = input("Enter the program name: ")
    description = input("Enter short description: ")

def displayBanner():
    """
    Displays the program banner with the user's information.
    Calls displayStarLine before and after the banner.
    """
    displayStarLine()
    print(f"# Coder : {coder_name}")
    print(f"# Date : {date}")
    print(f"# Program : {program_name}")
    print(f"# Descrip : {description}")
    displayStarLine()

def displayStarLine():
    """
    Displays a line of asterisks of a predefined width.
    """
    print("*" * BANNER_WIDTH)

def displaySectHeaders():
    """
    Displays section headers for a typical Python program.
    Calls displaySectHeader with the section names.
    """
    displaySectHeader("Constants")
    displaySectHeader("Variables")
    displaySectHeader("Input")
    displaySectHeader("Processing")
    displaySectHeader("Output")

def displaySectHeader(section_name):
    """
    Displays a section header with a line of asterisks before and after the section name.
    """
    displayStarLine()
    print(f"# {section_name}")
    displayStarLine()

# Call the main function to execute the program
main()

# Testing and Results
#I approached this assignment by breaking it into smaller tasks: creating functions for input collection, banner display, and section headers. I initially struggled with using global variables effectively but overcame this by reviewing Python documentation and tutorials
#I tested the program by entering a range of inputs, including standard, empty, long, and special characters. The program worked as expected, but I noticed that it could be improved by adding features like input validation and error handling for unusual input
#I learned how to manage global variables and design functions that interact correctly. In future projects, I will focus on validating user inputs and handling exceptions to make programs more robust and user-friendly.
#summary
#In this project, I focused on creating a structured program with clear functions. I faced challenges with global variables but resolved them through research. The program handled most test cases well, but future improvements will include better input validation and exception handling.
