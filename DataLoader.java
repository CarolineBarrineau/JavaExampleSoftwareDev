
//Caroline Barrineau, Team Victor
import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants {

	static ArrayList<Amenities> amenities = new ArrayList<Amenities>();
	static ArrayList<Types> type = new ArrayList<Types>();

	public static ArrayList<Listing> loadListing() {

		ArrayList<Listing> listing = new ArrayList<Listing>();

		try {
			FileReader reader = new FileReader(FILE_NAME);
			JSONParser parser = new JSONParser();
			JSONArray listingsJSON = (JSONArray) new JSONParser().parse(reader);

			for (int i = 0; i < listingsJSON.size(); i++) {

				JSONObject listingJSON = (JSONObject) listingsJSON.get(i);

				String address = (String) listingJSON.get(ADDRESS);
				String description = (String) listingJSON.get(DESCRIPTION);
				//ArrayList<String> reviews = (ArrayList<String>) listingJSON.get(REVIEWS);
				double ratings = (double) listingJSON.get(RATINGS);
				int roomNum = ((Long) listingJSON.get(ROOM_NUMBER)).intValue(); // converts to int
				double price = (double) listingJSON.get(PRICE);
				int bedrooms = ((Long) listingJSON.get(BEDROOMS)).intValue();
				double bathrooms = (double) listingJSON.get(BATHROOMS);
				//amenities
				boolean shuttle = (boolean) listingJSON.get(SHUTTLE);
				boolean pets = (boolean) listingJSON.get(PETS);
				boolean furnished = (boolean) listingJSON.get(FURNISHED);
				boolean gym = (boolean) listingJSON.get(GYM);
				boolean pool = (boolean) listingJSON.get(POOL);
				boolean wdcon = (boolean) listingJSON.get(WASHER_DRYER_CONNECTION);
				boolean wdin = (boolean) listingJSON.get(WASHER_DRYER_INCLUDED);
				boolean onsiteLaundry = (boolean) listingJSON.get(ONSITE_LAUNDRY);
				boolean garbagePickup = (boolean) listingJSON.get(GARBAGE_PICKUP);
				boolean streetParking = (boolean) listingJSON.get(STREET_PARKING);
				boolean garageParking = (boolean) listingJSON.get(GARAGE_PARKING);
				boolean driveway = (boolean) listingJSON.get(DRIVEWAY);
				boolean freeWifi = (boolean) listingJSON.get(FREE_WIFI);
				//types
				boolean condo = (boolean) listingJSON. get(CONDO);
				boolean apartment = (boolean) listingJSON. get(APARTMENT);
				boolean studio = (boolean) listingJSON. get(STUDIO);
				boolean loft = (boolean) listingJSON. get(LOFT);
				boolean house = (boolean) listingJSON. get(HOUSE);
				boolean townhouse = (boolean) listingJSON. get(TOWNHOUSE);
				boolean duplex = (boolean) listingJSON. get(DUPLEX);
				boolean coop = (boolean) listingJSON. get(CO_OP);

				listing.add(new Listing(address, description, ratings, roomNum, price, bedrooms, bathrooms,
						getAmenities(shuttle, pets, furnished, gym, pool, wdcon, wdin, onsiteLaundry, garbagePickup,
								streetParking, garageParking, driveway, freeWifi),
						getType(condo, apartment, studio, loft, house, townhouse, duplex, coop)));
			}

			return listing;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	
	private static  ArrayList<Amenities> getAmenities(boolean shuttle, boolean pets, boolean furnished, boolean gym,
			boolean pool, boolean washerDryerConnections, boolean washerDryerIncluded, boolean onsiteLaundry,
			boolean garbagePickup, boolean streetParking, boolean garageParking, boolean driveway, boolean freeWifi) {

		// if any of the amenities are true, it is added to the amenities array

		if (shuttle) {
			amenities.add(Amenities.SHUTTLE);
		}
		if (pets) {
			amenities.add(Amenities.PETS);
		}
		if (furnished) {
			amenities.add(Amenities.FURNISHED);
		}
		if (gym) {
			amenities.add(Amenities.GYM);
		}
		if (pool) {
			amenities.add(Amenities.POOL);
		}
		if (washerDryerConnections) {
			amenities.add(Amenities.WASHER_DRYER_CONNECTIONS);
		}
		if (washerDryerConnections) {
			amenities.add(Amenities.WASHER_DRYER_INCLUDED);
		}
		if (onsiteLaundry) {
			amenities.add(Amenities.ONSITE_LAUNDRY);
		}
		if (garbagePickup) {
			amenities.add(Amenities.GARBAGE_PICKUP);
		}
		if (streetParking) {
			amenities.add(Amenities.STREET_PARKING);
		}
		if (garageParking) {
			amenities.add(Amenities.GARAGE_PARKING);
		}
		if (driveway) {
			amenities.add(Amenities.DRIVEWAY);
		}
		if (freeWifi) {
			amenities.add(Amenities.FREE_WIFI);
		}
		return amenities;
	}

	private static ArrayList<Types> getType(boolean apartment, boolean condo, boolean studio, boolean loft, boolean house,
			boolean townhouse, boolean duplex, boolean coop) {

		// if the type is true, it is added to the types arrayList
		if (apartment) {
			type.add(Types.APARTMENT);
		}
		if (condo) {
			type.add(Types.CONDO);
		}
		if (studio) {
			type.add(Types.STUDIO);
		}
		if (loft) {
			type.add(Types.LOFT);
		}
		if (house) {
			type.add(Types.HOUSE);
		}
		if (townhouse) {
			type.add(Types.TOWNHOUSE);
		}
		if (duplex) {
			type.add(Types.DUPLEX);
		}
		if (coop) {
			type.add(Types.CO_OP);
		}
		return type;
	}

}
