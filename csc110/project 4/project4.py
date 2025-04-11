#Rodas Gebreyohannes
# proj4.py
# Description: Main program for Project 4: Common Math Formulas

import p4geom

def main():#Get input from user and call display function 
    size, unit = getInput()
    displaySquareResults(size, unit)
    displayCubeResults(size, unit)
    displayCircleResults(size, unit)
    displaySphereResults(size, unit)

def getInput():# this function prompts the user to enter the size and unit of measure 
    size = float(input("Enter the size for side and radius:"))
    unit = input("Enter the unit of measure: ")
    return size, unit

def displaySquareResults(size, unit): #  square calculation 
    print("Square Calculations:")
    print(f"Perimeter: {p4geom.squarePerim(size):.2f} {unit}")
    print(f"Area: {p4geom.squareArea(size):.2f} {unit}^2")

def displayCubeResults(size, unit):
    print("Cube Calculations:")
    print(f"Volume: {p4geom.cubeVolume(size):.2f} {unit}^3")
    print(f"Surface Area: {p4geom.cubeSurfArea(size):.2f} {unit}^2")

def displayCircleResults(size, unit):
    print("Circle Calculations:")
    print(f"Circumference: {p4geom.circleCircum(size):.2f} {unit}")
    print(f"Area: {p4geom.circleArea(size):.2f} {unit}^2")

def displaySphereResults(size, unit):
    print("Sphere Calculations:")
    print(f"Volume: {p4geom.sphereVolume(size):.2f} {unit}^3")
    print(f"Surface Area: {p4geom.sphereSurfArea(size):.2f} {unit}^2")

if __name__ == "__main__":
    main()
# Approach to this assignment:
# I approached this assignment by breaking down the problem into smaller tasks, 
# such as calculating the perimeter and area of each shape, and then displaying the results.
# I got stuck on the sphere calculations, as I had to look up the formulas for the volume and surface area.
# I got unstuck by researching the formulas online and testing them in my program.

# Testing the program:
# I tested my program by entering different sizes and units of measure, and verifying that the results were correct.
# One thing that does not work as I would like is handling invalid input, such as non-numeric sizes or units.
# In the future, I would like to add error handling to handle these cases.

# What I learned from this assignment:
# I learned how to calculate the perimeter, area, volume, and surface area of various geometric shapes.
# I also learned how to use functions to organize my code and make it more reusable.
# What I would do differently on the next project is to plan out my code more thoroughly before starting to write it,
# and to test my code more thoroughly to catch any errors or bugs 