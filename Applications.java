// Team Victor

import java.util.ArrayList;

public class Applications {
	private ArrayList<Listing> listing;
	private ArrayList<Amenities> amenities;
	private Users users;
	private RegisteredUser regUser;

	public void Application(ArrayList<Listing> listing, ArrayList<Amenities> amenities, Users users,
			RegisteredUser regUser) {
		this.listing = listing;
		this.amenities = amenities;
		this.users = users;
		this.regUser = regUser;
	}

	public ArrayList<Listing> findListing(String keyword) {
		
		for (int i = 0; i < listing.size(); i++) {
			
			}

		return listing;
	}

	public boolean login(String input, String username) {

		System.out.println("Logging in as an Agent (a) or a Tennant (t)?");
		if (input.toLowerCase().trim().equals("a")) {
			System.out.println("Please input your Username: ");

		} else if (input.toLowerCase().trim().equals("t")) {

		} else {

		}
	}

	public void reviewLease(Listing listing, int rating, String comment) {

	}

	public void makeAppointment(Tennant tennant, Agent agent, String day, String time) {

	}

}