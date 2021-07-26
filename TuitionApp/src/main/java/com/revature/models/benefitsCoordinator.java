package com.revature.models;

public class benefitsCoordinator {

	private int id;
	private String firstName;
	private String lastName;
	private String date;
	private String time;
	private String location;
	private String description;
	private double cost;
	private String gradingFormat;
	private String eventType;
	private String approval;
	
	
	
	public benefitsCoordinator() {
		super();
	}

	public benefitsCoordinator(int id, String firstName, String lastName, String date, String time, String location,
			String description, double cost, String gradingFormat, String eventType, String approval) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
		this.time = time;
		this.location = location;
		this.description = description;
		this.cost = cost;
		this.gradingFormat = gradingFormat;
		this.eventType = eventType;
		this.approval = approval;
	}

	public benefitsCoordinator(String firstName, String lastName, String date, String time, String location,
			String description, double cost, String gradingFormat, String eventType, String approval) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
		this.time = time;
		this.location = location;
		this.description = description;
		this.cost = cost;
		this.gradingFormat = gradingFormat;
		this.eventType = eventType;
		this.approval = approval;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getGradingFormat() {
		return gradingFormat;
	}

	public void setGradingFormat(String gradingFormat) {
		this.gradingFormat = gradingFormat;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	
	public String getApproval() {
		return approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}

	@Override
	public String toString() {
		return "Benefits Coordinator [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", date=" + date
				+ ", time=" + time + ", location=" + location + ", description=" + description + ", cost=" + cost
				+ ", gradingFormat=" + gradingFormat + ", eventType=" + eventType + ", Approval=" + approval + "]";
	}	
	
}
