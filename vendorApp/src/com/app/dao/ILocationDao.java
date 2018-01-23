package com.app.dao;

import java.util.List;

import com.app.model.Location;

public interface ILocationDao {
	
	public int saveLocation(Location loc);
	/**
	 * adding method to get all records from Loc_TAB
	 * */
	public List<Location> getAllLocations();
	/**
	 * this method is used to delete a record from DB based on locId
	 */
	public void deleteLocById(int locId);
	/***
	 * this method is used to fetch Location 
	 * object from	 db based on 
	 * primary key ie locId
	 */
	public Location getLocationById(int locId);
	
	/***
	 * This method is used to update 
	 * data from UI to DB (Location obj)
	 */
	public void updateLoc(Location loc);
	/***
	 * Get count based on location Type
	 */
	public List<Object[]> getLocationwiseCount();
	/**
	 * Defining a method to check given
	 * locName exist in DB or not??
	 */
	public boolean isLocNameExist(String locName);
}
