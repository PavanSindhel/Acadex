package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@jakarta.persistence.Entity
public class Bike {
	@Id
	private int bikenumber;
	
	private String bikename ;
	
	private String bikemodel;
	
	/**
	 * @return the bikenumber
	 */
	public int getBikenumber() {
		return bikenumber;
	}

	/**
	 * @param bikenumber the bikenumber to set
	 */
	public void setBikenumber(int bikenumber) {
		this.bikenumber = bikenumber;
	}

	private int bikeprice;

	/**
	 * @return the bikename
	 */
	public String getBikename() {
		return bikename;
	}

	@Override
	public String toString() {
		return "Bike [bikenumber=" + bikenumber + ", bikename=" + bikename + ", bikemodel=" + bikemodel + ", bikeprice="
				+ bikeprice + "]";
	}

	/**
	 * @param bikename the bikename to set
	 */
	public void setBikename(String bikename) {
		this.bikename = bikename;
	}

	/**
	 * @return the bikemodel
	 */
	public String getBikemodel() {
		return bikemodel;
	}

	/**
	 * @param bikemodel the bikemodel to set
	 */
	public void setBikemodel(String bikemodel) {
		this.bikemodel = bikemodel;
	}

	/**
	 * @return the bikeprice
	 */
	public int getBikeprice() {
		return bikeprice;
	}

	/**
	 * @param bikeprice the bikeprice to set
	 */
	public void setBikeprice(int bikeprice) {
		this.bikeprice = bikeprice;
	}
	
}
