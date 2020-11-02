
//Team Victor
import java.util.ArrayList;

public class Agents {

	private static Agents agents = null;
	private static ArrayList<Agent> agentList = new ArrayList<Agent>();

	private Agents() {
		agentList = DataLoaderUser.loadAgent();
	}

	public static Agents getInstance() {
		if (agents == null) {
			agents = new Agents();
		}

		return agents;
	}

	public ArrayList<Agent> getAgents() {
		return agentList;
	}

	public void addAgents(String firstname, String lastname, String username, String email, String phonenumber, String password) {
		agentList.add(new Agent(firstname, lastname, username, email, phonenumber, password));

		DataWriterUser.saveAgents();
	}
}
