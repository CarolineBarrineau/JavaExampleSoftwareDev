//Team Victor
import java.util.ArrayList;

public class Tennants {
	
	private static Tennants tennants = null;
	private static ArrayList<Tennant> tenList = new ArrayList<Tennant>();

	private Tennants() {
		tenList = DataLoaderUser.loadTennant();
	}

	public static Tennants getInstance() {
		if (tennants == null) {
			tennants = new Tennants();
		}

		return tennants;
	}

	public ArrayList<Tennant> getTennants() {
		return tenList;
	}

	public void addTennants(String firstname, String lastname, String username, String email, String phonenumber, String password) {
		tenList.add(new Tennant(firstname, lastname, username, email, phonenumber, password));

		DataWriterUser.saveTennants();
	}
	
	
}
