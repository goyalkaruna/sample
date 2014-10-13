package edu.sjsu.cmpe275.lab2;

import java.util.HashMap;

public class ProfileServiceImpl implements ProfileService {

	private HashMap<String, Profile> hm = new HashMap<String, Profile>(); 
	@Override
	public Profile getProfile(String userId) {
		// TODO Auto-generated method stub
		
		if(!hm.containsKey(userId)){return null;}
		else{return hm.get(userId);}
	}

	@Override
	public void storeProfile(Profile pro) {
		// TODO Auto-generated method stub

		hm.put(pro.getId(), pro);
	}

}
