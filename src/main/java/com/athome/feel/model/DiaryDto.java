package com.athome.feel.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "DiaryDto : Diary에 작성된 글과 감정")
public class DiaryDto {

	@ApiModelProperty(value = "글번호")
	private int diary_id;
	@ApiModelProperty(value = "작성자ID")
	private String member_id;
	@ApiModelProperty(value = "년")
	private String year;
	@ApiModelProperty(value = "월")
	private String month;
	@ApiModelProperty(value = "일")
	private String day;
	@ApiModelProperty(value = "작성글")
	private  String memo;
	@ApiModelProperty(value = "감정")
	private String sentiment;
	
	
	public int getDiary_id() {
		return diary_id;
	}
	public void setDiary_id(int diary_id) {
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
	public String getSentiment() {
		return sentiment;
	}
	public void setSentiment(String sentiment) {
		this.sentiment = sentiment;
	}
	@Override
	public String toString() {
		return "DiaryDto [diary_id=" + diary_id + ", member_id=" + member_id + ", year=" + year + ", month=" + month
				+ ", day=" + day + ", memo=" + memo + ", sentiment=" + sentiment + "]";
	}
	
	
	

	

	

}
