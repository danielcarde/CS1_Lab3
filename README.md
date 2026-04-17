# Budget-Based Restaurant Recommender

A Java application that suggests restaurants based on user-provided spending limits and preferences for various food items.

## Highlights
- Offers personalized restaurant recommendations.
- Utilizes user input to determine budget range and cravings.
- Implements basic error handling for invalid input.

## Overview 
This project is a simple command-line application designed to assist users in choosing a place to eat based on their budget and dining preferences. 

It prompts the user to enter a maximum spending amount, then asks follow-up questions related to food choices (e.g., interest in boba tea or warm rolls). Based on these responses, the application suggests a suitable restaurant among popular options like Boba Mi Amor, Starbucks, Texas Roadhouse, and Chick-fil-A.

This tool aims to provide a quick and fun decision-making aid for individuals trying to decide where to eat.

## Why This Project
Many people find themselves indecisive when choosing a restaurant, often influenced by factors like meal budget and desired cuisine. This project simplifies this process by guiding users through a series of questions tailored to their spending limit and food preferences, ultimately suggesting a personalized recommendation. 


## Usage
```java
System.out.print("How many dollars are you willing to spend? (type a positive integer): "); // Input your maximum budget
int pricePoint = input.nextInt(); // Read user budget

// Follow-up questions based on budget and preferences
if (pricePoint < 10) {
    System.out.print("I would be interested in trying boba! (type true or false): ");
} else if (pricePoint >= 10) { // More specific questions for higher budgets
}
```

## Installation
This project is written in Java and requires a JDK to compile and run. Save the code as LabThree.java and compile it using: 
```bash
javac LabThree.java
```

Then run the application with:
```bash
java LabThree
```


## Architecture
The `LabThree` application consists of a single Java class (`LabThree`). It uses a `Scanner` object to read user input from the console, and employs a loop with error handling (`try-catch`) to ensure valid user input. 

Key files: `LabThree.java` (main logic)


## Future Improvements
- Expand the restaurant database to include more options and cuisines.
- Incorporate a geographic location component to suggest restaurants near the user's current position.
- Implement a rating/review system for users to share their experiences with different establishments.
