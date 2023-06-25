package com.crm.app.service;

import java.util.ArrayList;

import com.crm.app.pojo.Ball;

public interface CrmService {
	//list of services
	public ArrayList<Ball> findAll();

	public void saveBall(Ball ball);
	
	public String sayHello(String userName);
}
