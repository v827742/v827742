package manyTomany.cfbs;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Batch {

	@Id
	private int bid;
	
	private String bnamd;
	
	@ManyToMany(cascade=CascadeType.ALL)
	//@JoinTable(name="Batch_Faculty",joinColumns={@JoinColumn(name="bid")},inverseJoinColumns={@JoinColumn(name="fid")})
	Set<Faculty> flt=new HashSet<>();

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBnamd() {
		return bnamd;
	}

	public void setBnamd(String bnamd) {
		this.bnamd = bnamd;
	}

	public Set<Faculty> getFlt() {
		return flt;
	}

	public void setFlt(Set<Faculty> flt) {
		this.flt = flt;
	}
	
}
