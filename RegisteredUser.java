//Team Victor

public class RegisteredUser {

	String firstname;
	String lastname;
	String username;
	String email;
	String phonenumber;

	public RegisteredUser(String firstname, String lastName, String username, String email, String phonenumber) {
		this.firstname = firstname;
		this.lastname = lastName;
		this.username = username;
		this.email = email;
		this.phonenumber = phonenumber;
		
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	
}
