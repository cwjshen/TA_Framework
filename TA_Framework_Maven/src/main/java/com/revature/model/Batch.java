package com.revature.model;

import java.util.Date;
import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table (name="BATCH")
public class Batch {
@Id
@Column(name="BATCH_NAME", nullable=false)
 private String name;
@Column(name="BATCH_CURR", nullable=true)
 private String curriculum;
@Column(name="BATCH_TRAINER", nullable=true)
 private String trainer;
@Column(name="BATCH_LOCATION", nullable=true)
 private String location;
@Column(name="BATCH_BUILDING", nullable=true)
 private String building;
@Column(name="BATCH_ROOM", nullable=true)
 private int room;
@Column(name="BATCHSTART_DATE", nullable=true)
@Temporal(TemporalType.DATE)
private Date start_date;
@Column(name="BATCHEND_DATE", nullable=true)
@Temporal(TemporalType.DATE)
 private Date end_date;


 public Batch(String name, String curriculum, String trainer, String location, String building, int room,
		Date start_date, Date end_date) {
	super();
	this.name = name;
	this.curriculum = curriculum;
	this.trainer = trainer;
	this.location = location;
	this.building = building;
	this.room = room;
	this.start_date = start_date;
	this.end_date = end_date;
}
 
 public Batch() {
	 
 }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCurriculum() {
	return curriculum;
}

public void setCurriculum(String curriculum) {
	this.curriculum = curriculum;
}

public String getTrainer() {
	return trainer;
}

public void setTrainer(String trainer) {
	this.trainer = trainer;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getBuilding() {
	return building;
}

public void setBuilding(String building) {
	this.building = building;
}

public int getRoom() {
	return room;
}

public void setRoom(int room) {
	this.room = room;
}

public Date getStart_date() {
	return start_date;
}

public void setStart_date(Date start_date) {
	this.start_date = start_date;
}

public Date getEnd_date() {
	return end_date;
}

public void setEnd_date(Date end_date) {
	this.end_date = end_date;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((building == null) ? 0 : building.hashCode());
	result = prime * result + ((curriculum == null) ? 0 : curriculum.hashCode());
	result = prime * result + ((end_date == null) ? 0 : end_date.hashCode());
	result = prime * result + ((location == null) ? 0 : location.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + room;
	result = prime * result + ((start_date == null) ? 0 : start_date.hashCode());
	result = prime * result + ((trainer == null) ? 0 : trainer.hashCode());
	return result;
}


@Override

public String toString() {

	return "BATCH [BATCH_NAME=" + name + ", BATCH_CURR=" + curriculum + ", BATCH_TRAINER=" + trainer + ", BATCH_LOCATION=" + location

			+ ", BATCH_BUILDING=" + building + ", BATCH_ROOM=" + room + ", STARTDATE=" + start_date + ", ENDDATE=" + end_date +"]";

}



}
