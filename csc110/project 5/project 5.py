# matchmaking.py
# Rodas Gebreyohannes
# July 26, 2024

# Global constants for category weightings
ATHLETICISM_WEIGHT = 0.15
FOOD_OUT_WEIGHT = 0.10
ENTERTAINMENT_OUT_WEIGHT = 0.15
SERIOUS_RELATIONSHIP_WEIGHT = 0.20
RELIGION_WEIGHT = 0.20
POLITICS_WEIGHT = 0.20

def rate(rating1, rating2):
    """
    Returns the probability of a match between two ratings.
    """
    diff = abs(rating1 - rating2)
    if diff <= 1:
        return 1.0
    elif diff <= 3:
        return 0.7
    elif diff <= 6:
        return 0.4
    else:
        return 0.0

def match(person1, person2):
    """
    Returns the overall probability of a match between two people.
    """
    athletics1, food1, entertainment1, relationship1, religious1, religion1, politics1, leanings1 = person1
    athletics2, food2, entertainment2, relationship2, religious2, religion2, politics2, leanings2 = person2

    # Calculate probabilities for each category
    athleticism_prob = rate(athletics1, athletics2) * ATHLETICISM_WEIGHT
    food_out_prob = rate(food1, food2) * FOOD_OUT_WEIGHT
    entertainment_out_prob = rate(entertainment1, entertainment2) * ENTERTAINMENT_OUT_WEIGHT
    serious_relationship_prob = rate(relationship1, relationship2) * SERIOUS_RELATIONSHIP_WEIGHT
    
    # Special cases for religion and politics
    if religious1 >= 8 or religious2 >= 8:
        if religion1 == religion2:
            religion_prob = 1.0 * RELIGION_WEIGHT
        else:
            religion_prob = 0.5 * RELIGION_WEIGHT
    else:
        religion_prob = rate(religious1, religious2) * RELIGION_WEIGHT
    
    if politics1 >= 9 or politics2 >= 9:
        politics_prob = rate(leanings1, leanings2) * POLITICS_WEIGHT
    else:
        politics_prob = rate(politics1, politics2) * POLITICS_WEIGHT
    
    # Calculate overall probability
    overall_prob = athleticism_prob + food_out_prob + entertainment_out_prob + serious_relationship_prob + religion_prob + politics_prob
    
    return overall_prob

def main():
    # Create two person tuples
    person1 = (7, 10, 8, 9, 10, "buddhism", 6, 8)
    person2 = (4, 5, 6, 10, 8, "judaism", 3, 2)
    
    # Calculate and display the probability of a match
    prob = match(person1, person2)
    print(f"The probability of a compatible match is {prob*100:g}%")

    
if __name__ == "__main__":
    main()
 #testing case 
   #I developed the following test cases to ensure the match function behaves correctly:
#Exact Match: person1 = (10, 10, 10, 10, 10, "buddhism", 10, 10) and person2 = (10, 10, 10, 10, 10, "buddhism", 10, 10). 
    #Expected result: 1.0 (100% match).
#No Match: person1 = (0, 0, 0, 0, 0, "buddhism", 0, 0) and person2 = (10, 10, 10, 10, 10, "judaism", 10, 10). 
    #Expected result: 0.0 (0% match).

#summary
#I broke down the problem into smaller functions, defining rate and match functions. Handling special cases for religion and politics was challenging, but I successfully implemented them.
#Getting stuck
#I reviewed the problem statement, code, and documentation, and tested with different inputs to identify issues.
#What Doesn't Work as Expected
#The program doesn't handle incorrect or missing data well. I'd like to add robust error handling.
#I learned to break down complex problems, handle special cases, and adjust weights. I gained experience with testing and debugging.
#What I Will Do Differently Next Time
#I'll add robust error handling, consider advanced techniques, and test more thoroughly.
#Overall, I'm satisfied with my work, but acknowledge room for improvement.