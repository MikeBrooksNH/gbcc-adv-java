Websites commonly require a password that satisfies several requirements. Write a program that checks if an input string satisfies the following (error message is shown for each):

At least 8 characters (Too short)
At least one letter (Missing letter)
At least one number (Missing number)
At least one of these special characters: !, #, % (Missing special)
Output OK, or all related error messages (in above order). If the input string is "Hello", the output is:

Too short
Missing number
Missing special
Hints:

Declare a boolean variable for each requirement.

Use a for loop to visit each character, setting the corresponding boolean to true if satisfied (length is done differently though).

Use the functions Character.isLetter() and Character.isDigit() to detect if a character is a letter or a number.

