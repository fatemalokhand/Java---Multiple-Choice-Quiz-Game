
/**
 * Description: This is a general knowledge quiz. This quiz has 15 multiple choice questions. The user will be asked the questions one after another. If they get
 * a question right, they get 1 point and if they get it wrong, they get 0 points. After the user has completed the quiz, their final score will be
 * calculated as a percent and it will get displayed to the user.
 *
 * @author (Fatema Lokhandwala)
 * @version (2021-03-18)
 */

//importing Scanner to be able to use it for user input
import java.util.Scanner;

public class FatemaMultipleChoice
{
    public static void main(String[] args)
    {
        //line of code to clear the terminal window
        System.out.print('\u000C');
        
        //declaring a variable to store the user's response on whether or not they would like to play my guessing game, data type = string
        String strUserResponse;
        
        //declaring a variable to error catch if the user has entered an invalid response on whether or not they would like to play my guessing game, data type = boolean
        //initializing the variable for looping
        boolean bolErrorCatchingForUserResponse = false;
        
        //declaring an array to store the correct answers for the questions
        char[] CorrectAnswersForTheQuestions = new char[]{'A', 'D', 'C', 'A', 'C', 'D', 'A', 'D', 'C', 'D', 'B', 'B', 'A', 'D', 'D'};
        
        //declaring an array to store the user's answers for the questions
        char[] UserAnswersForTheQuestions = new char[15];
        
        //declaring an array to store the 1st question and its possible answer choices
        String[] QuestionOne = new String[]{"*******************************************", "Question #1", "*******************************************", "What is the world's most populated country?", "A - China", "B - USA", "C - Russia", "D - India", "*******************************************"};
        
        //declaring an array to store the 2nd question and its possible answer choices
        String[] QuestionTwo = new String[]{"*********************************************************", "Question #2", "*********************************************************", "The Great Barrier Reef is off the coast of which country?", "A - Fiji", "B - New Zealand", "C - South Africa", "D - Australia", "*********************************************************"};
        
        //declaring an array to store the 3rd question and its possible answer choices
        String[] QuestionThree = new String[]{"*************************************", "Question #3", "*************************************", "What is the world's smallest country?", "A - Monaco", "B - Lichtenstein", "C - Vatican City", "D - Luxembourg", "*************************************"};
        
        //declaring an array to store the 4th question and its possible answer choices
        String[] QuestionFour = new String[]{"**********************************************************", "Question #4", "**********************************************************", "In which country is the world's highest waterfall located?", "A - Venezuela", "B - Brazil", "C - South Africa", "D - USA", "**********************************************************"};
        
        //declaring an array to store the 5th question and its possible answer choices
        String[] QuestionFive = new String[]{"*********************************************************", "Question #5", "*********************************************************", "What country has the greatest number of active volcanoes?", "A - Philippines", "B - Italy", "C - Indonesia", "D - Japan", "*********************************************************"};
        
        //declaring an array to store the 6th question and its possible answer choices
        String[] QuestionSix = new String[]{"**************************************", "Question #6", "**************************************", "How many people have been on the moon?", "A - 5", "B - 7", "C - 10", "D - 12", "**************************************"};
        
        //declaring an array to store the 7th question and its possible answer choices
        String[] QuestionSeven = new String[]{"************************************************", "Question #7", "************************************************", "Where was the hottest temperature ever recorded?", "A - Libya", "B - Peru", "C - India", "D - Mexico", "************************************************"};
        
        //declaring an array to store the 8th question and its possible answer choices
        String[] QuestionEight = new String[]{"************************************************", "Question #8", "************************************************", "Which of the following animals is not nocturnal?", "A - Koala", "B - Bat", "C - Raccoon", "D - Coyote", "************************************************"};
        
        //declaring an array to store the 9th question and its possible answer choices
        String[] QuestionNine = new String[]{"*************************************", "Question #9", "*************************************", "How many hearts does an octopus have?", "A - 1", "B - 2", "C - 3", "D - 5", "*************************************"};
        
        //declaring an array to store the 10th question and its possible answer choices
        String[] QuestionTen = new String[]{"**************************************************************", "Question #10", "**************************************************************", "How many elements are there in the periodic table of elements?", "A - 103", "B - 109", "C - 115", "D - 118", "**************************************************************"};
        
        //declaring an array to store the 11th question and its possible answer choices
        String[] QuestionEleven = new String[]{"****************************************************************", "Question #11", "****************************************************************", "Which are the only birds that can fly backwards and upside down?", "A - Hornbills", "B - Hummingbirds", "C - Falcons", "D - Kingfishers", "****************************************************************"};

        //declaring an array to store the 12th question and its possible answer choices
        String[] QuestionTwelve = new String[]{"******************************************", "Question #12", "******************************************", "Which planet has the most number of moons?", "A - Jupiter", "B - Saturn", "C - Uranus", "D - Neptune", "******************************************"};

        //declaring an array to store the 13th question and its possible answer choices
        String[] QuestionThirteen = new String[]{"*********************************************", "Question #13", "*********************************************", "Which is the smallest bone of the human body?", "A - Stapes", "B - Lumbar", "C - Radius", "D - Nasal", "*********************************************"};

        //declaring an array to store the 14th question and its possible answer choices
        String[] QuestionFourteen = new String[]{"************************************************", "Question #14", "************************************************", "Which country has the world’s longest coastline?", "A - USA", "B - Australia", "C - Russia", "D - Canada", "************************************************"};
        
        //declaring an array to store the 15th question and its possible answer choices
        String[] QuestionFifteen = new String[]{"**********************************************************", "Question #15", "**********************************************************", "How many states are there in the United States of America?", "A - 36", "B - 41", "C - 47", "D - 50", "**********************************************************"};

        //declaring a variable to store the user's answer for the 1st question
        char chrUserAnswerForQuestionOne;
        
        //declaring a variable to error catch if the user has entered an invalid answer for question one, data type = boolean
        //initializing the variable for looping
        boolean bolErrorCatchingForUserAnswerForQuestionOne = false;
        
        //declaring a variable to store the user's answer for the 2nd question
        char chrUserAnswerForQuestionTwo;
        
        //declaring a variable to error catch if the user has entered an invalid answer for question two, data type = boolean
        //initializing the variable for looping
        boolean bolErrorCatchingForUserAnswerForQuestionTwo = false;
        
        //declaring a variable to store the user's answer for the 3rd question
        char chrUserAnswerForQuestionThree;
        
        //declaring a variable to error catch if the user has entered an invalid answer for question three, data type = boolean
        //initializing the variable for looping
        boolean bolErrorCatchingForUserAnswerForQuestionThree = false;
        
        //declaring a variable to store the user's answer for the 4th question
        char chrUserAnswerForQuestionFour;
        
        //declaring a variable to error catch if the user has entered an invalid answer for question four, data type = boolean
        //initializing the variable for looping
        boolean bolErrorCatchingForUserAnswerForQuestionFour = false;
        
        //declaring a variable to store the user's answer for the 5th question
        char chrUserAnswerForQuestionFive;
        
        //declaring a variable to error catch if the user has entered an invalid answer for question five, data type = boolean
        //initializing the variable for looping
        boolean bolErrorCatchingForUserAnswerForQuestionFive = false;
        
        //declaring a variable to store the user's answer for the 6th question
        char chrUserAnswerForQuestionSix;
        
        //declaring a variable to error catch if the user has entered an invalid answer for question six, data type = boolean
        //initializing the variable for looping
        boolean bolErrorCatchingForUserAnswerForQuestionSix = false;
        
        //declaring a variable to store the user's answer for the 7th question
        char chrUserAnswerForQuestionSeven;
        
        //declaring a variable to error catch if the user has entered an invalid answer for question seven, data type = boolean
        //initializing the variable for looping
        boolean bolErrorCatchingForUserAnswerForQuestionSeven = false;
        
        //declaring a variable to store the user's answer for the 8th question
        char chrUserAnswerForQuestionEight;
        
        //declaring a variable to error catch if the user has entered an invalid answer for question eight, data type = boolean
        //initializing the variable for looping
        boolean bolErrorCatchingForUserAnswerForQuestionEight = false;
        
        //declaring a variable to store the user's answer for the 9th question
        char chrUserAnswerForQuestionNine;
        
        //declaring a variable to error catch if the user has entered an invalid answer for question nine, data type = boolean
        //initializing the variable for looping
        boolean bolErrorCatchingForUserAnswerForQuestionNine = false;
        
        //declaring a variable to store the user's answer for the 10th question
        char chrUserAnswerForQuestionTen;
        
        //declaring a variable to error catch if the user has entered an invalid answer for question ten, data type = boolean
        //initializing the variable for looping
        boolean bolErrorCatchingForUserAnswerForQuestionTen = false;
        
        //declaring a variable to store the user's answer for the 11th question
        char chrUserAnswerForQuestionEleven;
        
        //declaring a variable to error catch if the user has entered an invalid answer for question eleven, data type = boolean
        //initializing the variable for looping
        boolean bolErrorCatchingForUserAnswerForQuestionEleven = false;
        
        //declaring a variable to store the user's answer for the 12th question
        char chrUserAnswerForQuestionTwelve;
        
        //declaring a variable to error catch if the user has entered an invalid answer for question twelve, data type = boolean
        //initializing the variable for looping
        boolean bolErrorCatchingForUserAnswerForQuestionTwelve = false;
        
        //declaring a variable to store the user's answer for the 13th question
        char chrUserAnswerForQuestionThirteen;
        
        //declaring a variable to error catch if the user has entered an invalid answer for question thirteen, data type = boolean
        //initializing the variable for looping
        boolean bolErrorCatchingForUserAnswerForQuestionThirteen = false;
        
        //declaring a variable to store the user's answer for the 14th question
        char chrUserAnswerForQuestionFourteen;
        
        //declaring a variable to error catch if the user has entered an invalid answer for question fourteen, data type = boolean
        //initializing the variable for looping
        boolean bolErrorCatchingForUserAnswerForQuestionFourteen = false;
        
        //declaring a variable to store the user's answer for the 15th question
        char chrUserAnswerForQuestionFifteen;
        
        //declaring a variable to error catch if the user has entered an invalid answer for question fifteen, data type = boolean
        //initializing the variable for looping
        boolean bolErrorCatchingForUserAnswerForQuestionFifteen = false;
        
        //declaring a variable to store the total number of points of the user
        byte bytTotalNumberOfPoints = 0;
        
        //declaring a variable to store the total score of the user
        float fltUserScoreInPercent;
        
        //outputting hello and welcome message to the user
        System.out.println("Hello! Welcome to my general knowledge quiz!");
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //outputting the description of the program to the user
        System.out.println("This is a general knowledge quiz. This quiz has 15 multiple choice questions. The user will be asked the questions one after another. If they get"); 
        System.out.println("a question right, they get 1 point and if they get it wrong, they get 0 points. After the user has completed the quiz, their final score will be"); 
        System.out.println("calculated as a percent and it will get displayed to the user."); 
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //outputting thank you and enjoy message to the user
        System.out.println("Thank you and enjoy taking my quiz!");
        
        //do while loop for error catching 
        do
        {
            //outputting a blank line to make the program easier to read and follow for the user
            System.out.println();
        
            //outputting the message to the user to let them know that they need to enter their response for whether or not they would like to take my general knowledge quiz
            System.out.println("Would you like to take my general knowledge quiz? Please enter either 'Yes' or 'No':");
            
            //taking in the user's input for their response
            strUserResponse = new Scanner(System.in).nextLine().toLowerCase();
            
            //condition used to determine if the user has entered "yes" as their response
            if(strUserResponse.equals("yes"))
            {
                //outputting a blank line to make the program easier to read and follow for the user
                System.out.println();
        
                //outputting the message to the user to let them know that the game is starting
                System.out.println("Yayy! Let's get started!");
                
                //setting the variable equal to false
                bolErrorCatchingForUserResponse = false;
                
                //breaking out of the do while loop
                break;
            }
            //condition used to determine if the user has entered "no" as their response
            else if(strUserResponse.equals("no"))
            {
                //outputting a blank line to make the program easier to read and follow for the user
                System.out.println();
                
                //outputting goodbye and enjoy message to the user
                System.out.println("Goodbye and enjoy the rest of your day!");
                
                //stopping the program from executing any furthur 
                System.exit(0);
                
                //setting the variable equal to false
                bolErrorCatchingForUserResponse = false;
                
                //breaking out of the do while loop
                break;
            }
            //condition used to determine if the user has entered something other than "yes" or "no" as their response
            else
            {
                //outputting an error message if an invalid response has been entered to the user
                System.out.println("Error! Please enter either 'Yes' or 'No'.");
        
                //setting the variable equal to true
                bolErrorCatchingForUserResponse = true;
            }
        }
        while(bolErrorCatchingForUserResponse = true);

        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
            
        //building a for loop to output the 1st question and its possible answer choices to the user
        for(int intCounter = 0; intCounter<QuestionOne.length; intCounter++)
        {
            System.out.println(QuestionOne[intCounter]);
        }
        
        //do while loop for error catching 
        do
        {
            //outputting a blank line to make the program easier to read and follow for the user
            System.out.println();
        
            //outputting the message to the user to let them know that they need to enter their answer for the question 
            System.out.println("Please enter your answer (Please enter either 'A', 'B', 'C' or 'D'):");
            
            //taking in the user's answer for the question
            chrUserAnswerForQuestionOne = new Scanner(System.in).next().toUpperCase().charAt(0);
            
            //condition used to determine if the user has entered a valid answer for the question 
            if(chrUserAnswerForQuestionOne == 'A' || chrUserAnswerForQuestionOne == 'B' || chrUserAnswerForQuestionOne == 'C' || chrUserAnswerForQuestionOne == 'D')
            {
                //setting the variable equal to false
                bolErrorCatchingForUserAnswerForQuestionOne = false;
                
                //breaking out of the do while loop
                break;
            }
            //condition used to determine if the user has entered an invalid answer for the question 
            else 
            {
                //outputting an error message if an invalid answer has been entered to the user
                System.out.println("Error! Please enter either 'A', 'B', 'C' or 'D'.");

                //setting the variable equal to true
                bolErrorCatchingForUserAnswerForQuestionOne = true;
            }
        }
        while(bolErrorCatchingForUserAnswerForQuestionOne = true);
        
        //populating the array with the user's answer 
        UserAnswersForTheQuestions[0] = chrUserAnswerForQuestionOne;
        
        //condition used to determine if the user's answer is correct
        if(UserAnswersForTheQuestions[0] == CorrectAnswersForTheQuestions[0])
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 1);
        
            //calling the correctAnswerMessage method
            correctAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        //condition used to determine if the user's answer is incorrect
        else
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 0);
            
            //calling the incorrectAnswerMessage method
            incorrectAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //building a for loop to output the 2nd question and its possible answer choices to the user
        for(int intCounter = 0; intCounter<QuestionTwo.length; intCounter++)
        {
            System.out.println(QuestionTwo[intCounter]);
        }
        
        //do while loop for error catching 
        do
        {
            //outputting a blank line to make the program easier to read and follow for the user
            System.out.println();
        
            //outputting the message to the user to let them know that they need to enter their answer for the question 
            System.out.println("Please enter your answer (Please enter either 'A', 'B', 'C' or 'D'):");
            
            //taking in the user's answer for the question
            chrUserAnswerForQuestionTwo = new Scanner(System.in).next().toUpperCase().charAt(0);
            
            //condition used to determine if the user has entered a valid answer for the question 
            if(chrUserAnswerForQuestionTwo == 'A' || chrUserAnswerForQuestionTwo == 'B' || chrUserAnswerForQuestionTwo == 'C' || chrUserAnswerForQuestionTwo == 'D')
            {
                //setting the variable equal to false
                bolErrorCatchingForUserAnswerForQuestionTwo = false;
                
                //breaking out of the do while loop
                break;
            }
            //condition used to determine if the user has entered an invalid answer for the question 
            else 
            {
                //outputting an error message if an invalid answer has been entered to the user
                System.out.println("Error! Please enter either 'A', 'B', 'C' or 'D'.");
                
                //setting the variable equal to true
                bolErrorCatchingForUserAnswerForQuestionTwo = true;
            }
        }
        while(bolErrorCatchingForUserAnswerForQuestionTwo = true);
        
        //populating the array with the user's answer 
        UserAnswersForTheQuestions[1] = chrUserAnswerForQuestionTwo;
        
        //condition used to determine if the user's answer is correct
        if(UserAnswersForTheQuestions[1] == CorrectAnswersForTheQuestions[1])
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 1);
            
            //calling the correctAnswerMessage method
            correctAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        //condition used to determine if the user's answer is incorrect
        else
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 0);
            
            //calling the incorrectAnswerMessage method
            incorrectAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //building a for loop to output the 3rd question and its possible answer choices to the user
        for(int intCounter = 0; intCounter<QuestionThree.length; intCounter++)
        {
            System.out.println(QuestionThree[intCounter]);
        }
        
        //do while loop for error catching 
        do
        {
            //outputting a blank line to make the program easier to read and follow for the user
            System.out.println();
        
            //outputting the message to the user to let them know that they need to enter their answer for the question 
            System.out.println("Please enter your answer (Please enter either 'A', 'B', 'C' or 'D'):");
            
            //taking in the user's answer for the question
            chrUserAnswerForQuestionThree = new Scanner(System.in).next().toUpperCase().charAt(0);
            
            //condition used to determine if the user has entered a valid answer for the question 
            if(chrUserAnswerForQuestionThree == 'A' || chrUserAnswerForQuestionThree == 'B' || chrUserAnswerForQuestionThree == 'C' || chrUserAnswerForQuestionThree == 'D')
            {
                //setting the variable equal to false
                bolErrorCatchingForUserAnswerForQuestionThree = false;
                
                //breaking out of the do while loop
                break;
            }
            //condition used to determine if the user has entered an invalid answer for the question 
            else 
            {
                //outputting an error message if an invalid answer has been entered to the user
                System.out.println("Error! Please enter either 'A', 'B', 'C' or 'D'.");
                
                //setting the variable equal to true
                bolErrorCatchingForUserAnswerForQuestionThree = true;
            }
        }
        while(bolErrorCatchingForUserAnswerForQuestionThree = true);
        
        //populating the array with the user's answer 
        UserAnswersForTheQuestions[2] = chrUserAnswerForQuestionThree;
        
        //condition used to determine if the user's answer is correct
        if(UserAnswersForTheQuestions[2] == CorrectAnswersForTheQuestions[2])
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 1);
            
            //calling the correctAnswerMessage method
            correctAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        //condition used to determine if the user's answer is incorrect
        else
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 0);
            
            //calling the incorrectAnswerMessage method
            incorrectAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //building a for loop to output the 4th question and its possible answer choices to the user
        for(int intCounter = 0; intCounter<QuestionFour.length; intCounter++)
        {
            System.out.println(QuestionFour[intCounter]);
        }
        
        //do while loop for error catching 
        do
        {
            //outputting a blank line to make the program easier to read and follow for the user
            System.out.println();
        
            //outputting the message to the user to let them know that they need to enter their answer for the question 
            System.out.println("Please enter your answer (Please enter either 'A', 'B', 'C' or 'D'):");
            
            //taking in the user's answer for the question
            chrUserAnswerForQuestionFour = new Scanner(System.in).next().toUpperCase().charAt(0);
            
            //condition used to determine if the user has entered a valid answer for the question 
            if(chrUserAnswerForQuestionFour == 'A' || chrUserAnswerForQuestionFour == 'B' || chrUserAnswerForQuestionFour == 'C' || chrUserAnswerForQuestionFour == 'D')
            {
                //setting the variable equal to false
                bolErrorCatchingForUserAnswerForQuestionFour = false;
                
                //breaking out of the do while loop
                break;
            }
            //condition used to determine if the user has entered an invalid answer for the question 
            else 
            {
                //outputting an error message if an invalid answer has been entered to the user
                System.out.println("Error! Please enter either 'A', 'B', 'C' or 'D'.");
                
                //setting the variable equal to true
                bolErrorCatchingForUserAnswerForQuestionFour = true;
            }
        }
        while(bolErrorCatchingForUserAnswerForQuestionFour = true);
        
        //populating the array with the user's answer 
        UserAnswersForTheQuestions[3] = chrUserAnswerForQuestionFour;
        
        //condition used to determine if the user's answer is correct
        if(UserAnswersForTheQuestions[3] == CorrectAnswersForTheQuestions[3])
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 1);
            
            //calling the correctAnswerMessage method
            correctAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        //condition used to determine if the user's answer is incorrect
        else
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 0);
        
            //calling the incorrectAnswerMessage method
            incorrectAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //building a for loop to output the 5th question and its possible answer choices to the user
        for(int intCounter = 0; intCounter<QuestionFive.length; intCounter++)
        {
            System.out.println(QuestionFive[intCounter]);
        }
        
        //do while loop for error catching 
        do
        {
            //outputting a blank line to make the program easier to read and follow for the user
            System.out.println();
        
            //outputting the message to the user to let them know that they need to enter their answer for the question 
            System.out.println("Please enter your answer (Please enter either 'A', 'B', 'C' or 'D'):");
            
            //taking in the user's answer for the question
            chrUserAnswerForQuestionFive = new Scanner(System.in).next().toUpperCase().charAt(0);
            
            //condition used to determine if the user has entered a valid answer for the question 
            if(chrUserAnswerForQuestionFive == 'A' || chrUserAnswerForQuestionFive == 'B' || chrUserAnswerForQuestionFive == 'C' || chrUserAnswerForQuestionFive == 'D')
            {
                //setting the variable equal to false
                bolErrorCatchingForUserAnswerForQuestionFive = false;
                
                //breaking out of the do while loop
                break;
            }
            //condition used to determine if the user has entered an invalid answer for the question 
            else 
            {
                //outputting an error message if an invalid answer has been entered to the user
                System.out.println("Error! Please enter either 'A', 'B', 'C' or 'D'.");
                
                //setting the variable equal to true
                bolErrorCatchingForUserAnswerForQuestionFive = true;
            }
        }
        while(bolErrorCatchingForUserAnswerForQuestionFive = true);
        
        //populating the array with the user's answer 
        UserAnswersForTheQuestions[4] = chrUserAnswerForQuestionFive;
        
        //condition used to determine if the user's answer is correct
        if(UserAnswersForTheQuestions[4] == CorrectAnswersForTheQuestions[4])
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 1);
            
            //calling the correctAnswerMessage method
            correctAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        //condition used to determine if the user's answer is incorrect
        else
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 0);
            
            //calling the incorrectAnswerMessage method
            incorrectAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //building a for loop to output the 6th question and its possible answer choices to the user
        for(int intCounter = 0; intCounter<QuestionSix.length; intCounter++)
        {
            System.out.println(QuestionSix[intCounter]);
        }
        
        //do while loop for error catching 
        do
        {
            //outputting a blank line to make the program easier to read and follow for the user
            System.out.println();
        
            //outputting the message to the user to let them know that they need to enter their answer for the question 
            System.out.println("Please enter your answer (Please enter either 'A', 'B', 'C' or 'D'):");
            
            //taking in the user's answer for the question
            chrUserAnswerForQuestionSix = new Scanner(System.in).next().toUpperCase().charAt(0);
            
            //condition used to determine if the user has entered a valid answer for the question 
            if(chrUserAnswerForQuestionSix == 'A' || chrUserAnswerForQuestionSix == 'B' || chrUserAnswerForQuestionSix == 'C' || chrUserAnswerForQuestionSix == 'D')
            {
                //setting the variable equal to false
                bolErrorCatchingForUserAnswerForQuestionSix = false;
                
                //breaking out of the do while loop
                break;
            }
            //condition used to determine if the user has entered an invalid answer for the question 
            else 
            {
                //outputting an error message if an invalid answer has been entered to the user
                System.out.println("Error! Please enter either 'A', 'B', 'C' or 'D'.");
                
                //setting the variable equal to true
                bolErrorCatchingForUserAnswerForQuestionSix = true;
            }
        }
        while(bolErrorCatchingForUserAnswerForQuestionSix = true);
        
        //populating the array with the user's answer 
        UserAnswersForTheQuestions[5] = chrUserAnswerForQuestionSix;
        
        //condition used to determine if the user's answer is correct
        if(UserAnswersForTheQuestions[5] == CorrectAnswersForTheQuestions[5])
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 1);
            
            //calling the correctAnswerMessage method
            correctAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        //condition used to determine if the user's answer is incorrect
        else
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 0);
            
            //calling the incorrectAnswerMessage method
            incorrectAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //building a for loop to output the 7th question and its possible answer choices to the user
        for(int intCounter = 0; intCounter<QuestionSeven.length; intCounter++)
        {
            System.out.println(QuestionSeven[intCounter]);
        }
        
        //do while loop for error catching 
        do
        {
            //outputting a blank line to make the program easier to read and follow for the user
            System.out.println();
        
            //outputting the message to the user to let them know that they need to enter their answer for the question 
            System.out.println("Please enter your answer (Please enter either 'A', 'B', 'C' or 'D'):");
            
            //taking in the user's answer for the question
            chrUserAnswerForQuestionSeven = new Scanner(System.in).next().toUpperCase().charAt(0);
            
            //condition used to determine if the user has entered a valid answer for the question 
            if(chrUserAnswerForQuestionSeven == 'A' || chrUserAnswerForQuestionSeven == 'B' || chrUserAnswerForQuestionSeven == 'C' || chrUserAnswerForQuestionSeven == 'D')
            {
                //setting the variable equal to false
                bolErrorCatchingForUserAnswerForQuestionSeven = false;
                
                //breaking out of the do while loop
                break;
            }
            //condition used to determine if the user has entered an invalid answer for the question 
            else 
            {
                //outputting an error message if an invalid answer has been entered to the user
                System.out.println("Error! Please enter either 'A', 'B', 'C' or 'D'.");
                
                //setting the variable equal to true
                bolErrorCatchingForUserAnswerForQuestionSeven = true;
            }
        }
        while(bolErrorCatchingForUserAnswerForQuestionSeven = true);
        
        //populating the array with the user's answer 
        UserAnswersForTheQuestions[6] = chrUserAnswerForQuestionSeven;
        
        //condition used to determine if the user's answer is correct
        if(UserAnswersForTheQuestions[6] == CorrectAnswersForTheQuestions[6])
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 1);
            
            //calling the correctAnswerMessage method
            correctAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        //condition used to determine if the user's answer is incorrect
        else
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 0);
            
            //calling the incorrectAnswerMessage method
            incorrectAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //building a for loop to output the 8th question and its possible answer choices to the user
        for(int intCounter = 0; intCounter<QuestionEight.length; intCounter++)
        {
            System.out.println(QuestionEight[intCounter]);
        }
        
        //do while loop for error catching 
        do
        {
            //outputting a blank line to make the program easier to read and follow for the user
            System.out.println();
        
            //outputting the message to the user to let them know that they need to enter their answer for the question 
            System.out.println("Please enter your answer (Please enter either 'A', 'B', 'C' or 'D'):");
            
            //taking in the user's answer for the question
            chrUserAnswerForQuestionEight = new Scanner(System.in).next().toUpperCase().charAt(0);
            
            //condition used to determine if the user has entered a valid answer for the question 
            if(chrUserAnswerForQuestionEight == 'A' || chrUserAnswerForQuestionEight == 'B' || chrUserAnswerForQuestionEight == 'C' || chrUserAnswerForQuestionEight == 'D')
            {
                //setting the variable equal to false
                bolErrorCatchingForUserAnswerForQuestionEight = false;
                
                //breaking out of the do while loop
                break;
            }
            //condition used to determine if the user has entered an invalid answer for the question 
            else 
            {
                //outputting an error message if an invalid answer has been entered to the user
                System.out.println("Error! Please enter either 'A', 'B', 'C' or 'D'.");
                
                //setting the variable equal to true
                bolErrorCatchingForUserAnswerForQuestionEight = true;
            }
        }
        while(bolErrorCatchingForUserAnswerForQuestionEight = true);
        
        //populating the array with the user's answer 
        UserAnswersForTheQuestions[7] = chrUserAnswerForQuestionEight;
        
        //condition used to determine if the user's answer is correct
        if(UserAnswersForTheQuestions[7] == CorrectAnswersForTheQuestions[7])
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 1);
            
            //calling the correctAnswerMessage method
            correctAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        //condition used to determine if the user's answer is incorrect
        else
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 0);
            
            //calling the incorrectAnswerMessage method
            incorrectAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //building a for loop to output the 9th question and its possible answer choices to the user
        for(int intCounter = 0; intCounter<QuestionNine.length; intCounter++)
        {
            System.out.println(QuestionNine[intCounter]);
        }
        
        //do while loop for error catching 
        do
        {
            //outputting a blank line to make the program easier to read and follow for the user
            System.out.println();
        
            //outputting the message to the user to let them know that they need to enter their answer for the question 
            System.out.println("Please enter your answer (Please enter either 'A', 'B', 'C' or 'D'):");
            
            //taking in the user's answer for the question
            chrUserAnswerForQuestionNine = new Scanner(System.in).next().toUpperCase().charAt(0);
            
            //condition used to determine if the user has entered a valid answer for the question 
            if(chrUserAnswerForQuestionNine == 'A' || chrUserAnswerForQuestionNine == 'B' || chrUserAnswerForQuestionNine == 'C' || chrUserAnswerForQuestionNine == 'D')
            {
                //setting the variable equal to false
                bolErrorCatchingForUserAnswerForQuestionNine = false;
                
                //breaking out of the do while loop
                break;
            }
            //condition used to determine if the user has entered an invalid answer for the question 
            else 
            {
                //outputting an error message if an invalid answer has been entered to the user
                System.out.println("Error! Please enter either 'A', 'B', 'C' or 'D'.");
                
                //setting the variable equal to true
                bolErrorCatchingForUserAnswerForQuestionNine = true;
            }
        }
        while(bolErrorCatchingForUserAnswerForQuestionNine = true);
        
        //populating the array with the user's answer 
        UserAnswersForTheQuestions[8] = chrUserAnswerForQuestionNine;
        
        //condition used to determine if the user's answer is correct
        if(UserAnswersForTheQuestions[8] == CorrectAnswersForTheQuestions[8])
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 1);
            
            //calling the correctAnswerMessage method
            correctAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        //condition used to determine if the user's answer is incorrect
        else
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 0);
            
            //calling the incorrectAnswerMessage method
            incorrectAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //building a for loop to output the 10th question and its possible answer choices to the user
        for(int intCounter = 0; intCounter<QuestionTen.length; intCounter++)
        {
            System.out.println(QuestionTen[intCounter]);
        }
        
        //do while loop for error catching 
        do
        {
            //outputting a blank line to make the program easier to read and follow for the user
            System.out.println();
        
            //outputting the message to the user to let them know that they need to enter their answer for the question 
            System.out.println("Please enter your answer (Please enter either 'A', 'B', 'C' or 'D'):");
            
            //taking in the user's answer for the question
            chrUserAnswerForQuestionTen = new Scanner(System.in).next().toUpperCase().charAt(0);
            
            //condition used to determine if the user has entered a valid answer for the question 
            if(chrUserAnswerForQuestionTen == 'A' || chrUserAnswerForQuestionTen == 'B' || chrUserAnswerForQuestionTen == 'C' || chrUserAnswerForQuestionTen == 'D')
            {
                //setting the variable equal to false
                bolErrorCatchingForUserAnswerForQuestionTen = false;
                
                //breaking out of the do while loop
                break;
            }
            //condition used to determine if the user has entered an invalid answer for the question 
            else 
            {
                //outputting an error message if an invalid answer has been entered to the user
                System.out.println("Error! Please enter either 'A', 'B', 'C' or 'D'.");
                
                //setting the variable equal to true
                bolErrorCatchingForUserAnswerForQuestionTen = true;
            }
        }
        while(bolErrorCatchingForUserAnswerForQuestionTen = true);
        
        //populating the array with the user's answer 
        UserAnswersForTheQuestions[9] = chrUserAnswerForQuestionTen;
        
        //condition used to determine if the user's answer is correct
        if(UserAnswersForTheQuestions[9] == CorrectAnswersForTheQuestions[9])
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 1);
            
            //calling the correctAnswerMessage method
            correctAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        //condition used to determine if the user's answer is incorrect
        else
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 0);
            
            //calling the incorrectAnswerMessage method
            incorrectAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //building a for loop to output the 11th question and its possible answer choices to the user
        for(int intCounter = 0; intCounter<QuestionEleven.length; intCounter++)
        {
            System.out.println(QuestionEleven[intCounter]);
        }
        
        //do while loop for error catching 
        do
        {
            //outputting a blank line to make the program easier to read and follow for the user
            System.out.println();
        
            //outputting the message to the user to let them know that they need to enter their answer for the question 
            System.out.println("Please enter your answer (Please enter either 'A', 'B', 'C' or 'D'):");
            
            //taking in the user's answer for the question
            chrUserAnswerForQuestionEleven = new Scanner(System.in).next().toUpperCase().charAt(0);
            
            //condition used to determine if the user has entered a valid answer for the question 
            if(chrUserAnswerForQuestionEleven == 'A' || chrUserAnswerForQuestionEleven == 'B' || chrUserAnswerForQuestionEleven == 'C' || chrUserAnswerForQuestionEleven == 'D')
            {
                //setting the variable equal to false
                bolErrorCatchingForUserAnswerForQuestionEleven = false;
                
                //breaking out of the do while loop
                break;
            }
            //condition used to determine if the user has entered an invalid answer for the question 
            else 
            {
                //outputting an error message if an invalid answer has been entered to the user
                System.out.println("Error! Please enter either 'A', 'B', 'C' or 'D'.");
                
                //setting the variable equal to true
                bolErrorCatchingForUserAnswerForQuestionEleven = true;
            }
        }
        while(bolErrorCatchingForUserAnswerForQuestionEleven = true);
        
        //populating the array with the user's answer 
        UserAnswersForTheQuestions[10] = chrUserAnswerForQuestionEleven;
        
        //condition used to determine if the user's answer is correct
        if(UserAnswersForTheQuestions[10] == CorrectAnswersForTheQuestions[10])
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 1);
            
            //calling the correctAnswerMessage method
            correctAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        //condition used to determine if the user's answer is incorrect
        else
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 0);
            
            //calling the incorrectAnswerMessage method
            incorrectAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //building a for loop to output the 12th question and its possible answer choices to the user
        for(int intCounter = 0; intCounter<QuestionTwelve.length; intCounter++)
        {
            System.out.println(QuestionTwelve[intCounter]);
        }
        
        //do while loop for error catching 
        do
        {
            //outputting a blank line to make the program easier to read and follow for the user
            System.out.println();
        
            //outputting the message to the user to let them know that they need to enter their answer for the question 
            System.out.println("Please enter your answer (Please enter either 'A', 'B', 'C' or 'D'):");
            
            //taking in the user's answer for the question
            chrUserAnswerForQuestionTwelve = new Scanner(System.in).next().toUpperCase().charAt(0);
            
            //condition used to determine if the user has entered a valid answer for the question 
            if(chrUserAnswerForQuestionTwelve == 'A' || chrUserAnswerForQuestionTwelve == 'B' || chrUserAnswerForQuestionTwelve == 'C' || chrUserAnswerForQuestionTwelve == 'D')
            {
                //setting the variable equal to false
                bolErrorCatchingForUserAnswerForQuestionTwelve = false;
                
                //breaking out of the do while loop
                break;
            }
            //condition used to determine if the user has entered an invalid answer for the question 
            else 
            {
                //outputting an error message if an invalid answer has been entered to the user
                System.out.println("Error! Please enter either 'A', 'B', 'C' or 'D'.");
                
                //setting the variable equal to true
                bolErrorCatchingForUserAnswerForQuestionTwelve = true;
            }
        }
        while(bolErrorCatchingForUserAnswerForQuestionTwelve = true);
        
        //populating the array with the user's answer 
        UserAnswersForTheQuestions[11] = chrUserAnswerForQuestionTwelve;
        
        //condition used to determine if the user's answer is correct
        if(UserAnswersForTheQuestions[11] == CorrectAnswersForTheQuestions[11])
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 1);
            
            //calling the correctAnswerMessage method
            correctAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        //condition used to determine if the user's answer is incorrect
        else
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 0);
            
            //calling the incorrectAnswerMessage method
            incorrectAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //building a for loop to output the 13th question and its possible answer choices to the user
        for(int intCounter = 0; intCounter<QuestionThirteen.length; intCounter++)
        {
            System.out.println(QuestionThirteen[intCounter]);
        }
        
        //do while loop for error catching 
        do
        {
            //outputting a blank line to make the program easier to read and follow for the user
            System.out.println();
        
            //outputting the message to the user to let them know that they need to enter their answer for the question 
            System.out.println("Please enter your answer (Please enter either 'A', 'B', 'C' or 'D'):");
            
            //taking in the user's answer for the question
            chrUserAnswerForQuestionThirteen = new Scanner(System.in).next().toUpperCase().charAt(0);
            
            //condition used to determine if the user has entered a valid answer for the question 
            if(chrUserAnswerForQuestionThirteen == 'A' || chrUserAnswerForQuestionThirteen == 'B' || chrUserAnswerForQuestionThirteen == 'C' || chrUserAnswerForQuestionThirteen == 'D')
            {
                //setting the variable equal to false
                bolErrorCatchingForUserAnswerForQuestionThirteen = false;
                
                //breaking out of the do while loop
                break;
            }
            //condition used to determine if the user has entered an invalid answer for the question 
            else 
            {
                //outputting an error message if an invalid answer has been entered to the user
                System.out.println("Error! Please enter either 'A', 'B', 'C' or 'D'.");
                
                //setting the variable equal to true
                bolErrorCatchingForUserAnswerForQuestionThirteen = true;
            }
        }
        while(bolErrorCatchingForUserAnswerForQuestionThirteen = true);
        
        //populating the array with the user's answer 
        UserAnswersForTheQuestions[12] = chrUserAnswerForQuestionThirteen;
        
        //condition used to determine if the user's answer is correct
        if(UserAnswersForTheQuestions[12] == CorrectAnswersForTheQuestions[12])
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 1);
            
            //calling the correctAnswerMessage method
            correctAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        //condition used to determine if the user's answer is incorrect
        else
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 0);
            
            //calling the incorrectAnswerMessage method
            incorrectAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //building a for loop to output the 14th question and its possible answer choices to the user
        for(int intCounter = 0; intCounter<QuestionFourteen.length; intCounter++)
        {
            System.out.println(QuestionFourteen[intCounter]);
        }
        
        //do while loop for error catching 
        do
        {
            //outputting a blank line to make the program easier to read and follow for the user
            System.out.println();
        
            //outputting the message to the user to let them know that they need to enter their answer for the question 
            System.out.println("Please enter your answer (Please enter either 'A', 'B', 'C' or 'D'):");
            
            //taking in the user's answer for the question
            chrUserAnswerForQuestionFourteen = new Scanner(System.in).next().toUpperCase().charAt(0);
            
            //condition used to determine if the user has entered a valid answer for the question 
            if(chrUserAnswerForQuestionFourteen == 'A' || chrUserAnswerForQuestionFourteen == 'B' || chrUserAnswerForQuestionFourteen == 'C' || chrUserAnswerForQuestionFourteen == 'D')
            {
                //setting the variable equal to false
                bolErrorCatchingForUserAnswerForQuestionFourteen = false;
                
                //breaking out of the do while loop
                break;
            }
            //condition used to determine if the user has entered an invalid answer for the question 
            else 
            {
                //outputting an error message if an invalid answer has been entered to the user
                System.out.println("Error! Please enter either 'A', 'B', 'C' or 'D'.");
                
                //setting the variable equal to true
                bolErrorCatchingForUserAnswerForQuestionFourteen = true;
            }
        }
        while(bolErrorCatchingForUserAnswerForQuestionFourteen = true);
        
        //populating the array with the user's answer 
        UserAnswersForTheQuestions[13] = chrUserAnswerForQuestionFourteen;
        
        //condition used to determine if the user's answer is correct
        if(UserAnswersForTheQuestions[13] == CorrectAnswersForTheQuestions[13])
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 1);
            
            //calling the correctAnswerMessage method
            correctAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        //condition used to determine if the user's answer is incorrect
        else
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 0);
            
            //calling the incorrectAnswerMessage method
            incorrectAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //building a for loop to output the 15th question and its possible answer choices to the user
        for(int intCounter = 0; intCounter<QuestionFifteen.length; intCounter++)
        {
            System.out.println(QuestionFifteen[intCounter]);
        }
        
        //do while loop for error catching 
        do
        {
            //outputting a blank line to make the program easier to read and follow for the user
            System.out.println();
        
            //outputting the message to the user to let them know that they need to enter their answer for the question 
            System.out.println("Please enter your answer (Please enter either 'A', 'B', 'C' or 'D'):");
            
            //taking in the user's answer for the question
            chrUserAnswerForQuestionFifteen = new Scanner(System.in).next().toUpperCase().charAt(0);
            
            //condition used to determine if the user has entered a valid answer for the question 
            if(chrUserAnswerForQuestionFifteen == 'A' || chrUserAnswerForQuestionFifteen == 'B' || chrUserAnswerForQuestionFifteen == 'C' || chrUserAnswerForQuestionFifteen == 'D')
            {
                //setting the variable equal to false
                bolErrorCatchingForUserAnswerForQuestionFifteen = false;
                
                //breaking out of the do while loop
                break;
            }
            //condition used to determine if the user has entered an invalid answer for the question 
            else 
            {
                //outputting an error message if an invalid answer has been entered to the user
                System.out.println("Error! Please enter either 'A', 'B', 'C' or 'D'.");
                
                //setting the variable equal to true
                bolErrorCatchingForUserAnswerForQuestionFifteen = true;
            }
        }
        while(bolErrorCatchingForUserAnswerForQuestionFifteen = true);
        
        //populating the array with the user's answer 
        UserAnswersForTheQuestions[14] = chrUserAnswerForQuestionFifteen;
        
        //condition used to determine if the user's answer is correct
        if(UserAnswersForTheQuestions[14] == CorrectAnswersForTheQuestions[14])
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 1);
            
            //calling the correctAnswerMessage method
            correctAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        //condition used to determine if the user's answer is incorrect
        else
        {
            //calculating the total number of points that the user has
            //casting the value to a byte
            bytTotalNumberOfPoints = (byte)(bytTotalNumberOfPoints + 0);
            
            //calling the incorrectAnswerMessage method
            incorrectAnswerMessage();
            
            //outputting the total points to the user
            System.out.println("Your total points are " + bytTotalNumberOfPoints + ".");
        }
        
        //calculating the total score of the user
        //casting the value to a byte
        fltUserScoreInPercent = (bytTotalNumberOfPoints/15)*100;
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //outputting the total score to the user
        System.out.println("Your total score is " + Math.round(fltUserScoreInPercent) + "%");
    }
    
    public static void correctAnswerMessage()
    {
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //outputting the message to the user to let them know that their answer is correct
        System.out.println("Yay! Your answer is correct :)");
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //outputting the message to the user to let them know that they get 1 point
        System.out.println("Congratulations! You get 1 point.");
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
    }
    
    public static void incorrectAnswerMessage()
    {
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //outputting the message to the user to let them know that their answer is incorrect
        System.out.println("Sorry! Your answer is incorrect :(");
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
        
        //outputting the message to the user to let them know that they get 0 points
        System.out.println("Sorry! You get 0 points.");
        
        //outputting a blank line to make the program easier to read and follow for the user
        System.out.println();
    }
}
