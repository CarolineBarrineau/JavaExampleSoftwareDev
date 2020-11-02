import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//Caroline Barrineau, Team Victor
public class DataLoaderUser extends DataConstants {

	public static ArrayList<RegisteredUser> loadUser() {

		ArrayList<RegisteredUser> user = new ArrayList<RegisteredUser>();

		try {
			FileReader reader = new FileReader(USER_FILE_NAME);
			JSONParser parser = new JSONParser();
			JSONArray UserJSON = (JSONArray) new JSONParser().parse(reader);

			for (int i = 0; i < UserJSON.size(); i++) {

				JSONObject userJSON = (JSONObject) UserJSON.get(i);

				String firstName = (String) userJSON.get(FIRST_NAME);
				String lastName = (String) userJSON.get(LAST_NAME);
				String username = (String) userJSON.get(USERNAME);
				String email = (String) userJSON.get(EMAIL);
				String phonenumber = (String) userJSON.get(PHONENUMBER);

				user.add(new RegisteredUser(firstName, lastName, username, email, phonenumber));

			}

			return user;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static ArrayList<Agent> loadAgent() {

		ArrayList<Agent> agent = new ArrayList<Agent>();

		try {

			FileReader reader = new FileReader(AGENT_FILE_NAME);
			JSONParser parser = new JSONParser();
			JSONArray AgentJSON = (JSONArray) new JSONParser().parse(reader);

			for (int i = 0; i < AgentJSON.size(); i++) {

				JSONObject agentJSON = (JSONObject) AgentJSON.get(i);

				String firstName = (String) agentJSON.get(FIRST_NAME);
				String lastName = (String) agentJSON.get(LAST_NAME);
				String username = (String) agentJSON.get(USERNAME);
				String email = (String) agentJSON.get(EMAIL);
				String phonenumber = (String) agentJSON.get(PHONENUMBER);
				String password = (String) agentJSON.get(PASSWORD);

				agent.add(new Agent(firstName, lastName, username, email, phonenumber, password));
			}

			return agent;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static ArrayList<Tennant> loadTennant() {

		ArrayList<Tennant> ten = new ArrayList<Tennant>();
		
		try {
			
			FileReader reader = new FileReader(TEN_FILE_NAME);
			JSONParser parser = new JSONParser();
			JSONArray TennatJSON = (JSONArray) new JSONParser().parse(reader);

			for (int i = 0; i < TennatJSON.size(); i++) {

				JSONObject tennatJSON = (JSONObject) TennatJSON.get(i);

				String firstName = (String) tennatJSON.get(FIRST_NAME);
				String lastName = (String) tennatJSON.get(LAST_NAME);
				String username = (String) tennatJSON.get(USERNAME);
				String email = (String) tennatJSON.get(EMAIL);
				String phonenumber = (String) tennatJSON.get(PHONENUMBER);
				String password = (String) tennatJSON.get(PASSWORD);

				ten.add(new Tennant(firstName, lastName, username, email, phonenumber, password));
			}

			return ten;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
