package edu.sjsu.cmpe275.lab2;

public interface ProfileService {

	public Profile getProfile(String userId);
	public void storeProfile(Profile pro);
	
}
