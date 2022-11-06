Program Specifications Write a program to play an automated dice game that uses two
dice (Die class provided). The player rolls both dice and either wins one credit, loses one
credit, or sets a goal for future rolls. Current round ends when player wins or loses a credit.
Game ends when credits are zero.
Note: this program is designed for incremental development. Complete each step and
submit for grading before starting the next step. Only a portion of tests pass after each
step but confirm progress.
Step 0. Read starter template and do not change the provided code. Two Die objects are
created. A random seed is read from input and passed to a die. This supports automated
testing and creates predictable results that would otherwise be "random". Starting credit
amount is read from input.
Step 1 (3 pts). Roll both dice. Player wins one credit by rolling 7 or 11. Player losses one
credit by rolling 2, 3, or 12. Otherwise, credits do not change and the player's goal is set to
the dice total. The player's goal must be repeated in Step #2 to win a credit. Die class
includes roll() and getValue() methods. Output dice total and credits. Submit for grading to
confirm 3 tests pass.
Ex: If input is:
24 10
Sample output is:
Dice total: 7
Credits: 11
Step 2 (4 pts). If player did not win or lose in step 1 (i.e. a goal was set), continue rolling
both dice until one of two outcomes: 1) player rolls a 7 and loses one credit or 2) player
rolls the goal value and wins one credit. Current round ends. Set goal to -1 and output
credits. Submit for grading to confirm 5 tests pass.
Ex: If input is: