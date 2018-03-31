import java.util.Scanner;

public class Project3 {
	final static int MIN_NUMBER = 1;
	final static int MAX_NUMBER = 8;
	static int image_number =1;
	
	public static void main(String [] args) {
		showMenu();	
	}
	
	public static void showMenu() {
		Scanner input = new Scanner(System.in);
		
		int userChoice = -2;
		
		while(userChoice != -1) {
			
			System.out.println("Please pick one of the following: #1-4, #-1 to exit");
			System.out.println("1. Go Forward");
			System.out.println("2. Backward");
			System.out.println("3. Create File Name");
			System.out.println("4. Create Random File Name");
			System.out.println("-1. Exit");
			
			userChoice = input.nextInt();
			
			switch(userChoice) {
			
			case -1: 
				System.out.println("User has exited application.");
					break;
			
			case 1: image_number = forward(image_number);
					System.out.println("Image number is now " + image_number);
					break;
					
			case 2:	image_number = backward(image_number);
					System.out.println("Image number is now " + image_number);	
					break;
					
			case 3: 
					System.out.println(createFileName(image_number));
					System.out.println("Image number is now " + image_number);
					break;
				
			case 4: 
					System.out.println(createRandomName());
					break;
					
			default: System.out.println("Input out of range");
			}
		}
		
	}	
		
	public static int forward (int current_number) { 
		if(current_number <MAX_NUMBER){
			current_number = current_number +1;
		}
		if(current_number >=MAX_NUMBER){
			current_number = MIN_NUMBER;
		}
		return current_number;
		
	}
	
	public static int backward (int current_number) {
		if(current_number <=MAX_NUMBER && current_number >2) {
			current_number = current_number -1;
		}
		if(current_number ==2){
			current_number = MIN_NUMBER;
		}
		
		return current_number;
	}
	
	public static String createFileName (int current_number) {
		return "picture" + current_number + ".gif";
	}
		
	public static String createRandomName() {
		int RAN_NUMBER = (int)(Math.random()*(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER);
		return ("picture" + RAN_NUMBER + ".gif"); 

	}
}