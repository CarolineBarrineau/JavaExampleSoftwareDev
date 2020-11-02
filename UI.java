
import java.util.Scanner;
/**
 * This class will act as the driver for the whole program. More methods will be added to the class as we continue to work on the program. 
 * @author daleman123
 *
 */
public class UI {

	private Scanner scanner;
	private Applications application;
	private String[] menuOptions = {"Create Account", "Create Listing", "My Listings", "All Listings", "Search", "Quit App"};
	boolean running = true;
	boolean signedIn = false;
	ListingInterface pi;
	RegisteredUserInterface user;

	public static void main(String[] args) {
		UI ui = new UI();
		ui.run();
	}
	
	public UI() {
		scanner = new Scanner(System.in);
		application = new Applications();
		pi = new ListingInterface();
		user = new RegisteredUserInterface();
	}
	
	public void run() {
		
		System.out.println("Welcome to our Off-Campus Housing Application!");
		System.out.println("\nWould you like to create an account (1) or view as guest (2)?");
		int k = scanner.nextInt();
		
		if(k == 1) {
			user.play();
			signedIn = true;
		}
		else if(k == 2) {
			signedIn = false;
		}
		
		while(running) {
			displayMainMenu();
			
			int i = scanner.nextInt();
			
			if(i < 1 || i > 5) {
				System.out.println("Invalid input");
				continue;
			}
			
			if(i == 1 && signedIn == false) {
				user.play();
				signedIn = true;
			}
			
			else if(i == 1 && signedIn == true)
			{
				System.out.println("You already have an account and are logged in");
				continue;
			}
			
			if(i == 2 && signedIn == true) {
				pi.play();
			}
			else if(i == 2 && signedIn == false) {
				System.out.println("You cannot create a listing as a guest. Please create an account to create a listing.");
				continue;
			}
			
			if(i == 3 && signedIn == true) {
				System.out.println("***** Your Current Listings *******");
				pi.displayListings();
			}
			
			else if(i == 3 && signedIn == false) {
				System.out.println("You cannot view your listings as a guest. Please create an account to view your listings.");
				continue;
			}
			
			if(i == 4) {
				pi.displayListings();
			}
			
			if(i == 5) {
			
			}
			
			if(i == 6) {
				System.out.println("Thanks for using our app. Goodbye!");
				break;
			}
		}
		
	}
	
	private void displayMainMenu() {
		System.out.println("\n********Main Menu********");
		for(int i = 0; i < menuOptions.length; i++) {
			System.out.println((i+1) + ". " + menuOptions[i]);
		}
		System.out.println("\n");
	}

}

