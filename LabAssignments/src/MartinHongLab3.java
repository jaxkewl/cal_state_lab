import java.util.Scanner;

public class MartinHongLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int userGrade = 0;

		while (true) {

			// ask user for grade, integer only
			System.out.println("");
			System.out.print("Enter whole number grade (-1 exits): ");
			userGrade = input.nextInt();

			if (-1 == userGrade) {
				System.out.println("Exiting...");
				break;
			}

			// determine letter grade
			if (userGrade > 100) {
				System.out.println("Invalid Grade");
			}

			// ---------
			// A
			// ---------
			else if (100 == userGrade) {
				System.out.println("A+");
			} else if ((99 >= userGrade) && (userGrade >= 94)) {
				System.out.println("A");
			} else if ((93 >= userGrade) && (userGrade >= 90)) {
				System.out.println("A-");
			}

			// ---------
			// B
			// ---------
			else if (89 == userGrade) {
				System.out.println("B+");
			} else if ((88 >= userGrade) && (userGrade >= 84)) {
				System.out.println("B");
			} else if ((83 >= userGrade) && (userGrade >= 80)) {
				System.out.println("B-");
			}

			// ---------
			// C
			// ---------
			else if (79 == userGrade) {
				System.out.println("C+");
			} else if ((78 >= userGrade) && (userGrade >= 74)) {
				System.out.println("C");
			} else if ((73 >= userGrade) && (userGrade >= 70)) {
				System.out.println("C-");
			}

			// ---------
			// D
			// ---------
			else if (69 == userGrade) {
				System.out.println("D+");
			} else if ((68 >= userGrade) && (userGrade >= 64)) {
				System.out.println("D");
			} else if ((63 >= userGrade) && (userGrade >= 60)) {
				System.out.println("D-");
			} 
			
			
			// ---------
			// Fail
			// ---------			
			else {
				System.out.println("Fail");
			}

		}
	}
}
