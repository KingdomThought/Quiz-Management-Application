package quizApp;

import java.util.Scanner;

public class QuizMenu {
	public String AdminUserId;
	public String AdminPassword;
	public int menuSelection;

	public void adminLogin() {

		System.out.println("Please Enter Your User ID");
		System.out.println("Please Enter Your User Password");

	}

	public void adminMenu() {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome. Thank you for choosing QUIZZ WIZZ PRO \n" + "Team Trinity Software Group 2022 \n"
				+ "\n" + "please enter the the number of the task you wish to perform \n" + "\n"

		);

		System.out.println("1. If you would like to create a custom Quiz");
		System.out.println("2. If you would like display a list of your custom quizzes ");
		System.out.println("3. If you would like to edit a custom Quiz");
		System.out.println("4. If you would like to delete a custom Quiz");
		System.out.println("5. If you would like to complete an unfinished saved quiz");
		System.out.println("6. If you would like to browse our presintalled Quizzes");
		System.out.println("7. If you would like to exit program");

		menuSelection = input.nextInt();

		if (menuSelection == 1) {
			QuizMaker q2 = new QuizMaker();
			q2.startBuildQuiz();
		} else if (menuSelection == 2) {
			System.out.println("This Function has not yet been coded");
			System.exit(menuSelection);
		} else if (menuSelection == 3) {
			System.out.println("This Function has not yet been coded");
			System.exit(menuSelection);
		} else if (menuSelection == 4) {
			System.out.println("This Function has not yet been coded");
			System.exit(menuSelection);
		} else if (menuSelection == 5) {
			System.out.println("This Function has not yet been coded");
			System.exit(menuSelection);
		} else if (menuSelection == 6) {
			System.out.println("This Function has not yet been coded");
			System.exit(menuSelection);
		} else if (menuSelection == 7) {
			System.exit(menuSelection);
		}

	}

}
