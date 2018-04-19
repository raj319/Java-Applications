package com.cloud.compute;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Temp_Details")
public class Temp2 {

	@Id
	@GeneratedValue
	private long Id;
	
   private String date;
   private int tMax;
   private int tMin;
public Temp2(String date, int tMax, int tMin) {
	super();
	this.date = date;
	this.tMax = tMax;
	this.tMin = tMin;
}
public Temp2() {
	super();
}

public Temp2(String date) {
	super();
	this.date = date;
}
@JsonIgnore
@JsonProperty(value = "Id")
public long getId() {
	return Id;
}
public void setId(long id) {
	Id = id;
}

@JsonProperty("DATE")
public String getDate() {
	return date.replace("-", "");
}
public void setDate(String date) {
	this.date = date;
}
@JsonIgnore
@JsonProperty("TMAX")
public int gettMax() {
	return tMax;
}
public void settMax(int tMax) {
	this.tMax = tMax;
}
@JsonIgnore
@JsonProperty("TMIN")
public int gettMin() {
	return tMin;
}
public void settMin(int tMin) {
	this.tMin = tMin;
}
   
   
	
	
}
