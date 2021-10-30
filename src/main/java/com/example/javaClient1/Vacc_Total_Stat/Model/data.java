package com.example.javaClient1.Vacc_Total_Stat.Model;

public class data {
	
	private String baseDate; //통계 기준일자
	
	private String sido; //통계 지역명칭
	
	private int firstCnt; //당일 통계(1차 접종)
	
	private int secondCnt; //당일 통계(2차 접종)
	
	private int totalFirstCnt; //전체 누적 통계(1차 접종)
	
	private int totalSecondCnt; //전체 누적 통계(2차 접종)
	
	private int accumulatedFirstCnt; //전일까지의 누적 통계 (1차 접종)
	
	private int accumulatedSecondCnt; //전일까지의 누적 통계 (2차 접종)
	
	private int id;
	
	private int thirdCnt; //당일 통계(3차 접종)
	
	private int totalThirdCnt; //전체 누적 통계(3차 접종)
	
	private int accumulatedThirdCnt; //전일까지의 누적 통계 (3차 접종)
	
	public String getBaseDate() {
		return baseDate;
	}

	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;
	}

	public String getSido() {
		return sido;
	}

	public void setSido(String sido) {
		this.sido = sido;
	}

	public int getFirstCnt() {
		return firstCnt;
	}

	public void setFirstCnt(int firstCnt) {
		this.firstCnt = firstCnt;
	}

	public int getSecondCnt() {
		return secondCnt;
	}

	public void setSecondCnt(int secondCnt) {
		this.secondCnt = secondCnt;
	}

	public int getTotalFirstCnt() {
		return totalFirstCnt;
	}

	public void setTotalFirstCnt(int totalFirstCnt) {
		this.totalFirstCnt = totalFirstCnt;
	}

	public int getTotalSecondCnt() {
		return totalSecondCnt;
	}

	public void setTotalSecondCnt(int totalSecondCnt) {
		this.totalSecondCnt = totalSecondCnt;
	}

	public int getAccumulatedFirstCnt() {
		return accumulatedFirstCnt;
	}

	public void setAccumulatedFirstCnt(int accumulatedFirstCnt) {
		this.accumulatedFirstCnt = accumulatedFirstCnt;
	}

	public int getAccumulatedSecondCnt() {
		return accumulatedSecondCnt;
	}

	public void setAccumulatedSecondCnt(int accumulatedSecondCnt) {
		this.accumulatedSecondCnt = accumulatedSecondCnt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getThirdCnt() {
		return thirdCnt;
	}

	public void setThirdCnt(int thirdCnt) {
		this.thirdCnt = thirdCnt;
	}

	public int getTotalThirdCnt() {
		return totalThirdCnt;
	}

	public void setTotalThirdCnt(int totalThirdCnt) {
		this.totalThirdCnt = totalThirdCnt;
	}

	public int getAccumulatedThirdCnt() {
		return accumulatedThirdCnt;
	}

	public void setAccumulatedThirdCnt(int accumulatedThirdCnt) {
		this.accumulatedThirdCnt = accumulatedThirdCnt;
	}
}
