# Challenge 1
## Implementing wc

### How to run
* Compile java code `javac ccwc.java`
* For file as input `java <flag> filepath`
* For standard input `<standard_input> | java <flag> `

### How it works

The given code is a solution to John Crickett's Coding Challenge https://codingchallenges.fyi/challenges/challenge-wc

It is developed in java and uses internal java libraries.

The solution depends solely on number of arguments

If no args are provided, we consider a standard input with no flags.

If single arg is provided, we consider following:
    
1. We first check for argument and check if this is a valid file on system, if yes, then we print solution for text
2. If the path is not valid, we print solution for standard input taking the arg value as the flag

If two args are provided, then we consider case for file input with flag.