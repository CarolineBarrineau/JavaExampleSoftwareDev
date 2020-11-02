
//Team Victor
import java.util.ArrayList;

public class Agent extends RegisteredUser {

	private ArrayList<Listing> listing = new ArrayList<Listing>();
	private String password;

	public Agent(String firstname, String lastName, String username, String email, String phonenumber, String password) {
		super(firstname, lastName, username, email, phonenumber);

		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setUserType(String password) {
		this.password = password;
	}

	public ArrayList<Listing> getProperties() {
		//returns the properties the agent has made
		if (listing == null)
			System.out.println("No Listings");
		return listing;
	}

}
