package com.athome.feel.model;

public class DiaryDto {
	private String diary_id;
	private String member_id;
	private String year;
	private String month;
	private String day;
	private String memo;
	private String sentimentColor;
	private String sentimentName;
	public String getDiary_id() {
		return diary_id;
	}
	public void setDiary_id(String diary_id) {
		this.diary_id = diary_id;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getSentimentColor() {
		return sentimentColor;
	}
	public void setSentimentColor(String sentimentColor) {
		this.sentimentColor = sentimentColor;
	}
	public String getSentimentName() {
		return sentimentName;
	}
	public void setSentimentName(String sentimentName) {
		this.sentimentName = sentimentName;
	}
	@Override
	public String toString() {
		return "DiaryDto [diary_id=" + diary_id + ", member_id=" + member_id + ", year=" + year + ", month=" + month
				+ ", day=" + day + ", memo=" + memo + ", sentimentColor=" + sentimentColor + ", sentimentName="
				+ sentimentName + "]";
	}
	
	
	
	
}
