package Register;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Register {
	 @Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
     private String UserId;
	public String getUserId() {
		return UserId;
	}
	
	public void setUserId(String userId) {
		UserId = userId;
	}

	private String Password;
	private String Name;
	private String Address;
	private String Email;
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	

}

