#Rodas Gebreyohannes
# TestGeometry.py
# Description: This script contains automated test cases for the functions in p4geom.py.

import unittest
import p4geom
import math

class TestGeometry(unittest.TestCase):
    def test_squarePerim(self):
        size = 5
        expected_perimeter = 4 * size
        self.assertAlmostEqual(p4geom.squarePerim(size), expected_perimeter, places=4)

    def test_squareArea(self):
        size = 5
        expected_area = size ** 2
        self.assertAlmostEqual(p4geom.squareArea(size), expected_area, places=4)

    def test_cubeVolume(self):
        size = 5
        expected_volume = size ** 3
        self.assertAlmostEqual(p4geom.cubeVolume(size), expected_volume, places=4)

    def test_cubeSurfArea(self):
        size = 5
        expected_surface_area = 6 * size ** 2
        self.assertAlmostEqual(p4geom.cubeSurfArea(size), expected_surface_area, places=4)

    def test_circleCircum(self):
        size = 5
        expected_circumference = 2 * math.pi * size
        self.assertAlmostEqual(p4geom.circleCircum(size), expected_circumference, places=4)

    def test_circleArea(self):
        size = 5
        expected_area = math.pi * size ** 2
        self.assertAlmostEqual(p4geom.circleArea(size), expected_area, places=4)

    def test_sphereVolume(self):
        size = 5
        expected_volume = 4/3 * math.pi * size ** 3
        self.assertAlmostEqual(p4geom.sphereVolume(size), expected_volume, places=4)

    def test_sphereSurfArea(self):
        size = 5
        expected_surface_area = 4 * math.pi * size ** 2
        self.assertAlmostEqual(p4geom.sphereSurfArea(size), expected_surface_area, places=4)

if __name__ == '__main__':
    unittest.main()