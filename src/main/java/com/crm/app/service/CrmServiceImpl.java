package com.crm.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.app.entity.BallMaster;
import com.crm.app.pojo.Ball;
import com.crm.app.repository.BallRepository;

@Service
public class CrmServiceImpl implements CrmService {
	
	@Autowired
	private BallRepository ballRepository;

	//implementation of services - Business Logic 
	public ArrayList<Ball> findAll() {
		List<BallMaster> ballMasterList = ballRepository.findAll() ;
		ArrayList<Ball> ballList = new ArrayList();
			
		for(int index = 0; index < ballMasterList.size(); index++) {
			BallMaster bm = ballMasterList.get(index);
					
			Ball ball = new Ball();
			
			ball.setBallId(bm.getBallId());
			ball.setBallColor(bm.getBallColor());
			ball.setBallSize(bm.getBallSize());
			
			ballList.add(ball);
			
		}
			
		return ballList;
		
	}

	@Override
	public void saveBall(Ball ball) {
		BallMaster bm = new BallMaster();
		bm.setBallSize(ball.getBallSize());
		bm.setBallColor(ball.getBallColor());
		
		ballRepository.save(bm);
		
	}
	
	@Override
	public String sayHello(String userName) {
		
		if(userName == null)
			throw new NullPointerException();
			
		return "Hello "+userName+" !!!!";
	}

}
