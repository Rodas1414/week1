# This is a comment - anything after the "#" symbol is ignored by the computer
# Student name: Rodas Gebreyohannes
# Date: 6/28/2024
# Description: A program to generate a report for a book collection

# Ask the user for their name and store it in the "name" variable
name = input("Enter your name: ")

# Ask the user for the date and store it in the "date" variable
date = input("Enter the date: ")

# Ask the user for the number of books they want to add to their collection
# The "int()" function converts the user's input into an integer
num_books = int(input("Enter the number of books: "))

# Create an empty list called "books" to store information about each book
books = []

# Loop through the range of numbers from 0 to num_books-1
for i in range(num_books):
    # Ask the user for the title of the book and store it in the "title" variable
    title = input(f"Enter book title {i+1}: ")

    # Ask the user for the author of the book and store it in the "author" variable
    author = input(f"Enter author of book {i+1}: ")

    # Ask the user for the rating of the book and store it in the "rating" variable
    # The "int()" function converts the user's input into an integer
    rating = int(input(f"Enter rating of book {i+1} (1-5): "))

    # Create a dictionary to store information about the book
    book_info = {"title": title, "author": author, "rating": rating}

    # Add the book information to the "books" list
    books.append(book_info)

# Print the student's name and date
print("Student name:", name)
print("Date:", date)

# Print a header for the book collection report
print("\nBook Collection Report")
print("Title\tAuthor\tRating")

# Loop through each book in the "books" list
for book in books:
    # Print the title, author, and rating of the book
    print(f"{book['title']}\t{book['author']}\t{book['rating']}")

# testing and results
# I tested the program with 3 books and it worked as expected.
# I also tested it with invalid inputs (e.g. non-numeric rating) and it failed as expected.
# I would like to add error handling to handle invalid inputs in the future.
# I learned how to use lists and dictionaries to store and manipulate data.
# I will use more descriptive variable names and add more comments to my code in the future.
