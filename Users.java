//Caroline Barrineau, Team Victor
import java.util.ArrayList;

public class Users  {

	private static Users users = null;
	private static ArrayList<RegisteredUser> usersList = new ArrayList<RegisteredUser>();

	private Users() {
		usersList = DataLoaderUser.loadUser();
	}

	public static Users getInstance() {
		if (users == null) {
			users = new Users();
		}

		return users;
	}

	public ArrayList<RegisteredUser> getUsers() {
		return usersList;
	}

	public void addRegisteredUser(String firstname, String lastname, String username, String email, String phonenumber) {
		usersList.add(new RegisteredUser(firstname, lastname, username, email, phonenumber));

		DataWriterUser.saveUsers();
	}
}
