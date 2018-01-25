package com.revature.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table (name="TRAINER")
public class Trainer {
	@Id
	@Column(name="TRAINER_ID", nullable= false)
	private int id;
	@Column(name="TRAINER_FNAME", nullable=true)
	private String fname;
	@Column(name="TRAINER_LNAME", nullable=true)
	private String lname;
	@Column(name="TRAINER_RESUME", nullable=true)
    private String resume;
    @Column(name="TRAINER_SKILLS", nullable=true)
    private String skills;
    

public Trainer() {
	
}
    
   
public Trainer(int id, String fname, String lname, String resume, String skills) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.resume = resume;
		this.skills = skills;
	}


public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getResume() {
		return resume;
	}


	public void setResume(String resume) {
		this.resume = resume;
	}


	public String getSkills() {
		return skills;
	}


	public void setSkills(String skills) {
		this.skills = skills;
	}


@Override

public String toString() {

	return "Trainer   [TRAINER_ID=" + id + ", TRAINER_FNAME=" + fname + ", TRAINER_LNAME=" + lname + ", TRAINER_RESUME=" + resume

			+ ", TRAINER_SKILLS=" + skills + "]";

}


}	

