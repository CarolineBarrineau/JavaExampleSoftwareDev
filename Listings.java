
//Caroline Barrineau, Team Victor
import java.util.ArrayList;

public class Listings {

	private static Listings listings = null;
	private static ArrayList<Listing> listingsList = new ArrayList<Listing>();

	private Listings() {
		listingsList = DataLoader.loadListing();
	}

	public static Listings getInstance() {
		if (listings == null) {
			listings = new Listings();
		}

		return listings;
	}

	public ArrayList<Listing> getListings() {
		return listingsList;
	}

	public void addListing(String address, String description, double ratings, int roomNum,
			double price, int bedrooms, double bathrooms, ArrayList<Amenities> amenities, ArrayList<Types> types) {
		listingsList.add(new Listing(address, description, ratings, roomNum, price, bedrooms, bathrooms,
				amenities, types));
		DataWriter.saveListing();
	}
}
