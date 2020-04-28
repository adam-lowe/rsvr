package com.tts.rsvr.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String location;
	private Float cost;
	private Date eventData;
	
	public Event() {}
	
	public Event(String name, String location, Float cost, Date eventData) {
		this.name = name;
		this.location = location;
		this.cost = cost;
		this.eventData = eventData;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Float getCost() {
		return cost;
	}

	public void setCost(Float cost) {
		this.cost = cost;
	}

	public Date getEventData() {
		return eventData;
	}

	public void setEventData(Date eventData) {
		this.eventData = eventData;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Event [name=" + name + ", location=" + location + ", cost=" + cost + ", eventData=" + eventData + "]";
	}

}
