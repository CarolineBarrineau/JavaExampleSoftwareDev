
//Caroline Barrineau, Team Victor
import java.util.ArrayList;
import java.util.Scanner;

public class RegisteredUserInterface {
	private Scanner scanner;

	public RegisteredUserInterface() {
		scanner = new Scanner(System.in);
	}

	public void play() {
		Users RegisteredUser = Users.getInstance();
		Agents agents = Agents.getInstance();
		Tennants tennants = Tennants.getInstance();

		System.out.println("***** Your Current Users *******");
		displayUsers();

		while (addRegisteredUser() == 1 || addRegisteredUser() == 2 || addRegisteredUser() == 3) {
			String firstName = getField("First Name");
			String lastName = getField("Last Name");
			String username = getField("Username");
			String email = getField("Email");
			String phoneNum = getField("PhoneNumber");
			String password = getField("Password");

			//RegisteredUser.addRegisteredUser(firstName, lastName, username, email, phoneNum);

			if (addRegisteredUser() == 0) {
				System.out.println("Not a Vaild input");

			}
			if (addRegisteredUser() == 1) {
				// its an agent
				agents.addAgents(firstName, lastName, username, email, phoneNum, password);
			}
			if (addRegisteredUser() == 2) {
				// add a tenant
				tennants.addTennants(firstName, lastName, username, email, phoneNum, password);

			}
			if (addRegisteredUser() == 3) {
				System.out.println("***** Your updated list of Users *******");
				displayUsers();
			}

		}
	}

	private String getField(String prompt) {
		System.out.print(prompt + ": ");
		return scanner.nextLine();
	}

	private int addRegisteredUser() {
		System.out.println("Are you creating an Agent (a) or a Tennant (t)?\nType 'c' to see all Users");

		String input = scanner.nextLine();

		if (input.toLowerCase().trim().equals("a")) {
			return 1;
		} else if (input.toLowerCase().trim().equals("b")) {
			return 2;
		} else if (input.toLowerCase().trim().equals("c")) {
			return 3;
		} else
			return 0;
	}

	public void displayUsers() {

		Users users = Users.getInstance();
		Agents agents = Agents.getInstance();
		Tennants tennants = Tennants.getInstance();

		ArrayList<Tennant> tennant = tennants.getTennants();
		ArrayList<Agent> agent = agents.getAgents();

		for (Agent a : agent) {
			if (users == null) {
				System.out.println("No Users Found");
			}
			if (agents == null) {
				System.out.println("No Agents Found");
			} else {
				System.out.println(
						"User Type: Agent" + "Name: " + a.getFirstname() + " " + a.getLastname() + "\nUsername: "
								+ a.getUsername() + "\nEmail: " + a.getEmail() + "\nCell: " + a.getPhonenumber());
			}
		}

		for (Tennant t : tennant) {
			if (tennants == null) {
				System.out.println("No Tennants Found");
			} else {
				System.out.println(
						"User Type: Agent" + "Name: " + t.getFirstname() + " " + t.getLastname() + "\nUsername: "
								+ t.getUsername() + "\nEmail: " + t.getEmail() + "\nCell: " + t.getPhonenumber());
			}
		}
	}
}
