# Assignment 1: Meet and Greet (Review)
<!-- Don't modify the text between the arrows ⬇⬇⬇ and ⬆⬆⬆ -->

<!--⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇ -->
### Lab Goals
1. Review Java text files IO.
a. Be able to write a Java program that reads and writes text files.
2. Review the SafeInput Library, developed in Computer Programming I (Tom Wulf’s section)
3. Learn more about you.
### Final Result:
You will be submitting a repository containing the following:
1. one Java Project with the following files:
    1. PortfolioGenerator.java (has a main method)
    2. PersonReader.java (has a main method)
    3. SafeInput.java
    4. The output text file from the PortfolioGenerator program.
2. README.md file that includes your self-assessment
----
## Part 1: Writing to a text file:
1. Create a program (java main class) called PortfolioGenerator.java.
1. Complete the implementation of the `getString` and `getArrayOfStrings` functions in the SafeInput Library.
1. For Extra Credit: Create a getEmail function that will validate the user Input. (Use Regular Expressions) [Example](https://howtodoinjava.com/regex/java-regex-validate-email-address/)
2. The program will prompt the user (namely, you) to enter the following information
    1. Name
    2. Email
    3. Personal Background
    4. Programming Languages
      - You don’t know ahead of time how many languages the user knows. So, use
an ArrayList to store the records.
    - Once the user has indicated that they’ve entered all their languages, move on
to the next question.
    5. Achievements and interests you would like to share
    - Same as above, you don’t know how many achievements the user will share so
use an ArrayList Here as well.
    - Once the user has indicated that they’ve entered all their achievements, export
a text file that looks like the screenshot attached.
3. Use the SafeInput Library as needed to validate the user inputs; Block and Repeat until
the user gets the input correct, do not terminate the script.
4. Run the application and answer the question (I want to learn more about **YOU** through this
assignment)

#### Grading
- [ ] The program runs with no errors.
- [ ] The program uses ArrayList for the questions.
- [ ] The program generates the text file in the above format.
- [ ] Correct implementation of the `getString` function
- [ ] Correct implementation of the `getArrayOfStrings` function
- [ ] **(1 EXTRA POINTS ⭐)**: If you Center your name as in the screenshot
- [ ] **(2 EXTRA POINTS ⭐⭐)**: Correct Implementation of the `getEmailAddress` function in the SafeInput Library.

----
## Part 2: Reading from a file:
1. Create a program (Java main class) called PersonReader.java.
2. Use the JFileChooser to prompt the user to select the classmates.txt file (The file is
available with the assignment directions on Blackboard.)
3. Use the String.format method to create a neatly formatted columnar display of the data
records.
```
Firstname   Lastname    age     email
====================================================
Francisco   Hughes      46      jielkop@vap.su
Kathryn     Chapman     25      ije@hanugwe.as
```


#### Grading
- [ ] The program runs with no errors.
- [ ] The program properly uses the JFileChooser.
- [ ] The program output is formatted properly.

<!--⬆⬆⬆⬆⬆⬆⬆⬆⬆⬆⬆⬆ -->
 -----
 
 ## Assignment Self Assessment:
 #### Reflection
 [//]: <> (share your thoughts on the assignment, things you learnt and would like to remember when you look back at this assignment)
 
 
 #### Self Assessment
 ##### Part 1:
 - [ ] The program runs with no errors;
 - [ ] The program uses `ArrayList`;
 - [ ] The program generate the text file in the above format;
 - [ ] ⭐️ The name in the exported text file is centered;
 - [ ] ⭐️ The report is designed in a better format;
 
 ##### Part 2:
 - [ ] The program runs with no errors;
 - [ ] The program uses `JFileChooser` properly;
 - [ ] The program output is formatted properly;
 
 **Your Grade:**  /20
 
 **Notes:**
