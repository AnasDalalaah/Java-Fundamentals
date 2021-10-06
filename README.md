# Java-Fundamentals

# Author: Anas Dalalah 


## Basics

- `pluralize(String word, int number)`
- `flipNHeads(int n)`
- `clock()`

## Basicslibrary

- `Average`
- `LowAverage`
- `Roll`
- `Contains Duplicates`

##  linter

- **_linter_**: method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon. with some exceptional cases:
  - if the line is empty.
  - if the line ends with an opening .curly brace {.
  - if the line ends with an closing curly brace }.
  - if the line contains if or else.

## inheritance
     - Library
        - main
            - Restaurant       
            - Review       

### lab07 Composition and Inheritance, Part 2
##### This lab contains the following Tasks:
1. The users want shops! Create a Shop class; a Shop should have a name, description, and number of dollar signs.

2. The users also want to review shops!
It would be great if a Review could be about either a Shop or a Restaurant. 
3. The users want theaters! Create a Theater class; a Theater should have a name and all of the movies currently showing there. (Strings are fine for the movies; no need to create another class.)

4. Users are frustrated: they like having a body, an author, and a number of stars, but when they’re reviewing a Theater, they also want to specify which movie they saw.
Some reviews should now have a String movie instance variable, to hold which movie that reviewer is referencing.

5. Add testing for any new functionality you’ve created.