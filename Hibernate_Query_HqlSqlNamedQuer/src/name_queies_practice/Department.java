package name_queies_practice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;



@NamedQueries({
	@NamedQuery(name="all_Dept",query="from Department"),
	@NamedQuery(name="one_dept",query="from Department where did=:id"),
	@NamedQuery(name="update_query",query="update Department set dname=:dnm,addr=:adr where did=:id"),
	@NamedQuery(name="delete_query",query="delete from Department where did=:dpid")
})
@Entity
public class Department {
	@Id
	private int did;
	private String dname;
	private String addr;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	

}
