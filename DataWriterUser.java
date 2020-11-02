//Caroline Barrineau, Team Victor

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriterUser extends DataConstants {

	public static void saveUsers() {
		Users users = Users.getInstance();
		ArrayList<RegisteredUser> RegisteredUser = users.getUsers();
		JSONArray jsonRegisteredUser = new JSONArray();

		// creating all the json objects
		for (int i = 0; i < RegisteredUser.size(); i++) {
			jsonRegisteredUser.add(getRegisteredUsersJSON(RegisteredUser.get(i)));
		}

		// Write JSON file
		try (FileWriter file = new FileWriter(USER_FILE_NAME)) {

			file.write(jsonRegisteredUser.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static JSONObject getRegisteredUsersJSON(RegisteredUser Users) {
		JSONObject RegisteredUsersDetails = new JSONObject();
		RegisteredUsersDetails.put(FIRST_NAME, Users.getFirstname());
		RegisteredUsersDetails.put(LAST_NAME, Users.getLastname());
		RegisteredUsersDetails.put(USERNAME, Users.getUsername());
		RegisteredUsersDetails.put(EMAIL, Users.getEmail());
		RegisteredUsersDetails.put(PHONENUMBER, Users.getPhonenumber());
		// RegisteredUsersDetails.put(PASSWORD, "none");

		return RegisteredUsersDetails;
	}

	public static void saveAgents() {
		Agents agents = Agents.getInstance();
		ArrayList<Agent> agent = agents.getAgents();
		JSONArray jsonAgent = new JSONArray();

		// creating all the json objects
		for (int i = 0; i < agent.size(); i++) {
			jsonAgent.add(getAgentsJSON(agent.get(i)));
		}

		// Write JSON file
		try (FileWriter file = new FileWriter(AGENT_FILE_NAME)) {

			file.write(jsonAgent.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static JSONObject getAgentsJSON(Agent agent) {
		JSONObject AgentDetails = new JSONObject();
		AgentDetails.put(FIRST_NAME, agent.getFirstname());
		AgentDetails.put(LAST_NAME, agent.getLastname());
		AgentDetails.put(USERNAME, agent.getUsername());
		AgentDetails.put(EMAIL, agent.getEmail());
		AgentDetails.put(PHONENUMBER, agent.getPhonenumber());
		AgentDetails.put(PASSWORD, agent.getPassword());

		return AgentDetails;
	}
	public static void saveTennants() {
		Tennants tennants = Tennants.getInstance();
		ArrayList<Tennant> tennant = tennants.getTennants();
		JSONArray jsonTennant = new JSONArray();

		// creating all the json objects
		for (int i = 0; i < tennant.size(); i++) {
			jsonTennant.add(getTennantsJSON(tennant.get(i)));
		}

		// Write JSON file
		try (FileWriter file = new FileWriter(TEN_FILE_NAME)) {

			file.write(jsonTennant.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static JSONObject getTennantsJSON(Tennant tennant) {
		JSONObject TennantDetails = new JSONObject();
		TennantDetails.put(FIRST_NAME, tennant.getFirstname());
		TennantDetails.put(LAST_NAME, tennant.getLastname());
		TennantDetails.put(USERNAME, tennant.getUsername());
		TennantDetails.put(EMAIL, tennant.getEmail());
		TennantDetails.put(PHONENUMBER, tennant.getPhonenumber());
		TennantDetails.put(PASSWORD, tennant.getPassword());

		return TennantDetails;
	}
}
