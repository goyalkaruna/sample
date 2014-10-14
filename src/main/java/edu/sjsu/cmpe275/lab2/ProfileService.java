package edu.sjsu.cmpe275.lab2;

import java.util.HashMap;

public interface ProfileService {

	public HashMap<String, Profile> getHashmap();
	public Profile getProfile(String userId);
	public void storeProfile(Profile pro);
	
}
