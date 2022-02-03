//QUIZ APP
//THE TRINITY SOFTWARE GROUP
//SPRING 2022
//DEADLINE:
//VERSION:1

package quizApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizMaker {

	public String question; // This String Variable Stores Question
	public String rightAnswer; // This Variable Store the Correct Answer to Question
	public String incorrectAlternateOne;
	public String incorrectAlternateTwo;
	public String incorrectAlternateThree;
	public int qCount = 1;
	public String quizName;
	public String authorName;
	public int c = 1; // used as count variable in alternate Question Loop
	public int numOfQuestions;
	public int i = 1; // used as counter variable in Question Loop

	
	//Below are Five. These <String> ArrayLists will store 1)The Quiz Question 2)The Correct Answer
	//3)Incorrect Answer 4)Incorrect Answer & 5)Incorrect answer
	//
	//For every question made. The corresponding answer and corresponding alternate answers will share
	//the same index across all five ArrayLusts.
	ArrayList<String> questionList = new ArrayList<String>();
	ArrayList<String> correctAnswerList = new ArrayList<String>();
	ArrayList<String> incorrectAnswer1 = new ArrayList<String>();
	ArrayList<String> incorrectAnswer2 = new ArrayList<String>();
	ArrayList<String> incorrectAnswer3 = new ArrayList<String>();

	ArrayList<String> possibleAnswers = new ArrayList<String>(); //Stores All possible answer choices to Question

	//The code below will prompt user to enter appropiate elements needed
	//to create questions
	public void questionInput() {

		// Here are some print Statements that give some information about the Authors
		// and instructions for software usage.
		System.out.println("***Welcome to The TRINITY GROUP QuizMakerPRO***");
		System.out.println("*** This Software Was Designed to Build Quizzes for Students***");
		System.out.println("*** Please Follow These Instructions:***");
		System.out.println(" 1) You will be prompted to enter quiz Question");
		System.out.println(" 2) You will be prompted to enter the correct  answer for question");
		System.out.println(" 3) You will be prompted to enter 3 alternate incorrect answers to quiz question");
		System.out.println(" 4) This software will randomly shuffle the order of quiz questions ");
		System.out.println("\n");

		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		Scanner inputNumQues = new Scanner(System.in);
		
		System.out.println("How many questions will this quiz consist of? must Select a number between 1 and 10.");
		numOfQuestions=inputNumQues.nextInt();
		while (numOfQuestions >10 || numOfQuestions < 1) {
			
			System.out.println("Please Try again. Must enter a number between 1 and 10");
			numOfQuestions=inputNumQues.nextInt();
		}

		// This while loop is the Question Loop, it will loop for the
		//questions in the given quiz.
		while (i <= numOfQuestions) {
			int c = 1;
			System.out.print("Question # " + i + " Please Enter Question You Wish To Record \n");
			question = in.nextLine();
			System.out.println("Question # " + i + ": Has been added Susscefully");
			System.out.println("");
			System.out.println("Question # " + i + " Please Provide The Correct Answer for this Question");
			Scanner inAnswer = new Scanner(System.in);
			rightAnswer = inAnswer.nextLine();
			System.out.println("Question # " + i + " Solution Has Been Added to Answer Key");
			System.out.println();
			questionList.add(question);
			correctAnswerList.add(rightAnswer);

			// This "while" loop right here will loop 3 times.
			// Each time it loops it will ask the user to enter an alternate answer
			// for the question they are building. These 3 answers are inteded to be
			// incorrect.
			while (c <= 3) {
				System.out
						.println("Question # " + i + " Please enter alternate incorrect multiple choice option  " + c);
				if (c == 1) {
					incorrectAlternateOne = inAnswer.nextLine();
					incorrectAnswer1.add(incorrectAlternateOne);
				} else if (c == 2) {
					incorrectAlternateTwo = inAnswer.nextLine();
					incorrectAnswer2.add(incorrectAlternateTwo);
				} else if (c == 3) {
					incorrectAlternateThree = inAnswer.nextLine();
					incorrectAnswer3.add(incorrectAlternateThree);
				}

				c++;

			}
			// Informs user that alternate questions were successfully added and
			// Question is now complete.
			System.out.print("Question # " + i + " Alternate Question choices added Successfully. Question " + i
					+ " is now complete. \n");
			System.out.println();

			// This code right here adds the various possible answers inputed into an
			// ArrayList
			// Called "possibleAnswers". This List contains the correct answer in addition
			// to three alternates.
			possibleAnswers.add(0, incorrectAlternateOne);
			possibleAnswers.add(0, incorrectAlternateTwo);
			possibleAnswers.add(0, incorrectAlternateThree);
			possibleAnswers.add(0, rightAnswer);

			createQuestion();
			
			//When this line of code executes in increments the question count variable by 1
			//it will do so until the loops condition is met. The condition is set to the amount of
			//questions being made.
			i++;
		}
	}

	// This method is used to create question. It stores the correct answer by
	// initializing
	// correctAnser Variable to the correct answer which can be found at index 0
	// before shuffle.
	// After the correct answer has been stored in this method we then shuffle the
	// various answer choices
	// and structure the question with print Statements
	public void createQuestion() {
		String correctAnswer = possibleAnswers.get(0);
		shuffleQuestions(possibleAnswers);
		System.out.println();
		System.out.println("Question " + i);
		System.out.println();
		System.out.println(questionList.get(0));
		System.out.println();
		System.out.println("A: " + possibleAnswers.get(0));
		System.out.println();
		System.out.println("B: " + possibleAnswers.get(1));
		System.out.println();
		System.out.println("C: " + possibleAnswers.get(2));
		System.out.println();
		System.out.println("D: " + possibleAnswers.get(3));
		System.out.println();
		System.out.println("The Correct Answer is: " + correctAnswer);
		System.out.println();
		System.out.println();

	}

	// This method takes in all possible answers and the shuffles them before
	// question creation
	public ArrayList<String> shuffleQuestions(ArrayList<String> possibleAnswers2) {
		Collections.shuffle(possibleAnswers);
		return possibleAnswers2;

	}

}
