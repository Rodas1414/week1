# Filename: TestCustDataFixup.py
# Author: Rodas Gebreyohannes
# Date: July 31, 2024
# Description: This script contains unit tests for the customer data cleaning function.

import unittest
from customer_data_cleaner import clean_customer_data  # Adjust the import according to your file structure

class TestCustDataFixup(unittest.TestCase):
    """
    Unit tests for the clean_customer_data function.
    """
    
    def test_clean_customer_data_valid(self):
        # Test with valid input data
        input_data = '1O53l6#Lopez, Lupe Luisa #(206)555-1845#$1,346.75'
        expected_output = {
            'Customer number': '105316',
            'Customer last name': 'Lopez',
            'Customer first name': 'Lupe Luisa',
            'Customer area code': '206',
            'Customer phone': '5551845',
            'Customer balance': 1346.75
        }
        self.assertEqual(clean_customer_data(input_data), expected_output)
    
    def test_clean_customer_data_missing_field(self):
        # Test with missing fields
        input_data = '1O53l6#Lopez, Lupe Luisa #(206)555-1845'
        with self.assertRaises(ValueError):
            clean_customer_data(input_data)
    
    def test_clean_customer_data_invalid_number(self):
        # Test with invalid customer number
        input_data = '123abc#Lopez, Lupe Luisa #(206)555-1845#$1,346.75'
        expected_output = {
            'Customer number': '123',
            'Customer last name': 'Lopez',
            'Customer first name': 'Lupe Luisa',
            'Customer area code': '206',
            'Customer phone': '5551845',
            'Customer balance': 1346.75
        }
        self.assertEqual(clean_customer_data(input_data), expected_output)
    
    def test_clean_customer_data_invalid_phone(self):
        # Test with invalid phone number
        input_data = '1O53l6#Lopez, Lupe Luisa #(206)555-184#$1,346.75'
        with self.assertRaises(ValueError):
            clean_customer_data(input_data)
    
    def test_clean_customer_data_invalid_balance(self):
        # Test with invalid balance
        input_data = '1O53l6#Lopez, Lupe Luisa #(206)555-1845#$abc'
        with self.assertRaises(ValueError):
            clean_customer_data(input_data)

if __name__ == "__main__":
    unittest.main()
