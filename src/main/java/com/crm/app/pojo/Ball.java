package com.crm.app.pojo;

public class Ball {

	private Integer ballId;
	private String ballColor;
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
