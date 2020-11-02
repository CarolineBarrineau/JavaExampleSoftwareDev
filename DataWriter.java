
//Caroline Barrineau, Team Victor
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {

	public static void saveListing() {
		Listings listings = Listings.getInstance();
		ArrayList<Listing> listing = listings.getListings();
		JSONArray jsonlisting = new JSONArray();

		// creating all the json objects
		for (int i = 0; i < listing.size(); i++) {
			jsonlisting.add(getListingJSON(listing.get(i)));
		}

		// Write JSON file
		try (FileWriter file = new FileWriter(FILE_NAME)) {

			file.write(jsonlisting.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static JSONObject getListingJSON(Listing listings) {
		JSONObject listingDetails = new JSONObject();
		listingDetails.put(ADDRESS, listings.getAddress());
		listingDetails.put(DESCRIPTION, listings.getDescription());
		listingDetails.put(REVIEWS, listings.getReviews());
		listingDetails.put(RATINGS, listings.getRatings());
		listingDetails.put(ROOM_NUMBER, listings.getRoomNum());
		listingDetails.put(PRICE, listings.getPrice());
		listingDetails.put(BEDROOMS, listings.getBedrooms());
		listingDetails.put(BATHROOMS, listings.getBathrooms());
		listingDetails.put(AMENITIES, listings.getAmenities());
		listingDetails.put(TYPES, listings.getType());

		return listingDetails;
	}

	
}
