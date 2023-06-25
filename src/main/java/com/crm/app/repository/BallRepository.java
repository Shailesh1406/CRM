package com.crm.app.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.crm.app.entity.BallMaster;

@Repository
public interface BallRepository extends JpaRepository<BallMaster, Integer>{
	
	@Query(nativeQuery = true, value = "select * from ball_master where ball_size = :ballSize")
	public ArrayList<BallMaster> getSizeBalls(@Param("ballSize") Integer ballSize);
	
	@Query("SELECT bm FROM BallMaster bm WHERE bm.ballColor = :color")
	public ArrayList<BallMaster> getColoredBalls(@Param("color") String colorName);

}