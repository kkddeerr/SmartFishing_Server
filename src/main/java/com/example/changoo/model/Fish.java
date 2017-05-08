package com.example.changoo.model;

import com.google.gson.Gson;

public class Fish {
	private String id;
	private String user_id;
	private String name;
	private String imageFile;
	private String species;
	private Double maxFower;
	private Double avgFower;
	private Double weight;
	private String date;
	private String time;
	private Double timeing;
	private Double GPS_lat;
	private Double GPS_lot;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageFile() {
		return imageFile;
	}

	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public double getMaxFower() {
		return maxFower;
	}

	public void setMaxFower(double maxFower) {
		this.maxFower = maxFower;
	}

	public double getAvgFower() {
		return avgFower;
	}

	public void setAvgFower(double avgFower) {
		this.avgFower = avgFower;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
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

	public double getTimeing() {
		return timeing;
	}

	public void setTimeing(double timeing) {
		this.timeing = timeing;
	}

	public double getGPS_lat() {
		return GPS_lat;
	}

	public void setGPS_lat(double GPS_lat) {
		this.GPS_lat = GPS_lat;
	}

	public double getGPS_lot() {
		return GPS_lot;
	}

	public void setGPS_lot(double GPS_lot) {
		this.GPS_lot = GPS_lot;
	}

	public String toString() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}

}
