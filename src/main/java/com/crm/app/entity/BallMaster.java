package com.crm.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ball_master")
public class BallMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk_ball_id")
	private Integer ballId;
	
	@Column(name = "ball_color", nullable = false)
	private String ballColor;
	
	@Column(name = "ball_size", nullable = false)
	private int ballSize;
	
	public int getBallId() {
		return ballId;
	}
	public void setBallId(int ballId) {
		this.ballId = ballId;
	}
	public String getBallColor() {
		return ballColor;
	}
	public void setBallColor(String ballColor) {
		this.ballColor = ballColor;
	}
	public int getBallSize() {
		return ballSize;
	}
	public void setBallSize(int ballSize) {
		this.ballSize = ballSize;
	}
	
	@Override
	public String toString() {
		return "BallMaster [ballId=" + ballId + ", ballColor=" + ballColor + ", ballSize=" + ballSize + "]";
	}
	
}
