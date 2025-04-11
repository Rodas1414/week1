#Rodas Gebreyohannes

import unittest
from matchmaker import rate, match  # Import the functions to be tested

class TestMatchmaker(unittest.TestCase):
    """
    Test cases for the Matchmaker functions
    """

    def test_rating_easy(self):
        """
        Test the rating function with easy cases
        """
        self.assertEqual(rate(5, 5), 0)
        self.assertEqual(rate(0, 10), 10)
        self.assertEqual(rate(3, 7), 4)

    def test_rating_hard(self):
        """
        Test the rating function with hard cases
        """
        self.assertEqual(rate(-1, 10), 11)  # Test with negative rating
        self.assertEqual(rate(10, -1), 11)  # Test with negative rating
        self.assertEqual(rate(5, 5.5), 0.5)  # Test with decimal rating

    def test_match_politics(self):
        """
        Test the match function with politics cases
        """
        person1 = (7, 10, 8, 9, 10, "buddhism", 6, 8)
        person2 = (7, 10, 8, 9, 10, "buddhism", 6, 8)
        self.assertAlmostEqual(match(person1, person2), 0.2)  # Test with same politics

        person1 = (7, 10, 8, 9, 10, "buddhism", 6, 9)
        person2 = (7, 10, 8, 9, 10, "buddhism", 6, 8)
        self.assertAlmostEqual(match(person1, person2), 0.1)  # Test with different politics

    def test_match_religion(self):
        """
        Test the match function with religion cases
        """
        person1 = (7, 10, 8, 9, 10, "buddhism", 6, 8)
        person2 = (7, 10, 8, 9, 10, "buddhism", 6, 8)
        self.assertAlmostEqual(match(person1, person2), 0.2)  # Test with same religion

        person1 = (7, 10, 8, 9, 10, "buddhism", 6, 8)
        person2 = (7, 10, 8, 9, 10, "judaism", 6, 8)
        self.assertAlmostEqual(match(person1, person2), 0.0)  # Test with different religion

    def test_match_ratings(self):
        """
        Test the match function with rating cases
        """
        person1 = (7, 10, 8, 9, 10, "buddhism", 6, 8)
        person2 = (7, 10, 8, 9, 10, "buddhism", 6, 8)
        self.assertAlmostEqual(match(person1, person2), 0.2)  # Test with same ratings

        person1 = (0, 0, 0, 0, 0, "buddhism", 0, 0)
        person2 = (10, 10, 10, 10, 10, "buddhism", 10, 10)
        self.assertAlmostEqual(match(person1, person2), 0.0)  # Test with different ratings

if __name__ == "__main__":
    unittest.main()