import java.util.ArrayList;

//Caroline Barrineau, Team Victor
public class Tennant extends RegisteredUser{
	private ArrayList<Listing> listing = new ArrayList<Listing>();
	private String password;

	public Tennant(String firstname, String lastName, String username, String email, String phonenumber, String password) {
		super(firstname, lastName, username, email, phonenumber);

		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setUserType(String password) {
		this.password = password;
	}

	public ArrayList<Listing> getFavorites() {
		//returns the properties the tennant has favorited
		if (listing == null)
			System.out.println("No Listings");
		return listing;
	}
	
	
}
