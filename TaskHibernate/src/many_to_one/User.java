package many_to_one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User {
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getMono() {
		return mono;
	}

	public void setMono(long mono) {
		this.mono = mono;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Id
	@Column(name="USER_ID")
	private int userid;
	@Column(name="USER_NAME")
	private String Name;
	@Column(name="USER_MONO")
	private long mono;
	@Column(name="USER_ADDRESS")
	private String addr;
	

}
