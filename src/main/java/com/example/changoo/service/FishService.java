package com.example.changoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.changoo.dao.FishDAO;
import com.example.changoo.model.Fish;

@Service
public class FishService {
	private FishDAO fishDAO;

	@Autowired
	public void setFishDAO(FishDAO fishDAO) {
		this.fishDAO = fishDAO;
	}

	public List<Fish> getFishsByID(String user_id) {
		return fishDAO.getFishsByID(user_id);
	}
	
	public List<Fish> getFishsByPeriod(String period1,String period2) {
		return fishDAO.getFishsByPeriod(period1,period2);
	}
	
	public List<Fish> getFishsforRank(String species,String period1,String period2) {
		return fishDAO.getFishsforRank(species,period1,period2);
	}

	
	public boolean  insert(Fish fish) {
		return fishDAO.insert(fish);
	}
}
