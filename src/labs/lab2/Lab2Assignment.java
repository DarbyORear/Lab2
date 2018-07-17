package labs.lab2;

import java.util.Scanner;

public class Lab2Assignment {
	//Note to modify file

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// TODO Auto-generated method stub
		//formula for calculating perimeter of a rectangle is: P = L*2 + W*2
		//formula for area of a rectangle is: A = L * W
		//Ask user to input doubles.
		
		System.out.println("Please enter the length of the classroom in feet: ");
		double classroomLength = scnr.nextDouble();
	
		System.out.println("Please enter the width of the classroom in feet: ");
		double classroomWidth = scnr.nextDouble();
		
		double classroomPerimeter = classroomLength * 2 + classroomWidth * 2;
		double classroomArea = classroomLength * classroomWidth;
		
		System.out.println("The perimeter of the classroom is: " + classroomPerimeter + " feet.");
		System.out.println("The area of the classroom is: " + classroomArea + " square feet." );
	
		System.out.println();
		System.out.println("Would you like to continue? (y/n): ");
		String userContinueAnswer = scnr.next();
	
		char userContinue = userContinueAnswer.charAt(0);
	
			while(userContinue == 'y') {
				System.out.println("Please enter the length of the classroom in feet: ");
				classroomLength = scnr.nextDouble();
			
				System.out.println("Please enter the width of the classroom in feet: ");
				classroomWidth = scnr.nextDouble();
				
				classroomPerimeter = classroomLength * 2 + classroomWidth * 2;
				classroomArea = classroomLength * classroomWidth;
				
				System.out.println("The perimeter of the classroom is: " + classroomPerimeter + " feet.");
				System.out.println("The area of the classroom is: " + classroomArea + " square feet." );
			
				System.out.println();
				System.out.println("Would you like to continue? (y/n)");
				//scan again
				userContinueAnswer = scnr.next();
				userContinue = userContinueAnswer.charAt(0);
			}
			
			if(userContinue == 'n') {
				System.out.println("Thank your for inquiring about the size of Grand Circus classrooms!");
			}
			else {
				System.out.println("Not a valid entry. Please enter \"y\" or \"n\": ");
			}
	
	}

}
