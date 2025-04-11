# p4geom.py
# Description: Geometry calculations for 2D & 3D shapes

import math

def squarePerim(side):
    return 4 * side

def squareArea(side):
    return side ** 2

def cubeVolume(side):
    return side ** 3

def cubeSurfArea(side):
    return 6 * side ** 2

def circleCircum(radius):
    return 2 * math.pi * radius

def circleArea(radius):
    return math.pi * radius ** 2

def sphereVolume(radius):
    return 4/3 * math.pi * radius ** 3

def sphereSurfArea(radius):
    return 4 * math.pi * radius ** 2