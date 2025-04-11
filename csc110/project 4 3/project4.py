# proj4.py
# Description: Main program for Project 4: Common Math Formulas

import p4geom

def main():
    size, unit = getInput()
    displaySquareResults(size, unit)
    displayCubeResults(size, unit)
    displayCircleResults(size, unit)
    displaySphereResults(size, unit)

def getInput():
    size = float(input("Enter the size: "))
    unit = input("Enter the unit of measure: ")
    return size, unit

def displaySquareResults(size, unit):
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