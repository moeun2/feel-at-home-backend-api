package com.athome.feel.model;

public class SentimentDto {
	private String sentimentName;
	private String sentimentCnt;
	public String getSentimentName() {
		return sentimentName;
	}
	public void setSentimentName(String sentimentName) {
		this.sentimentName = sentimentName;
	}
	public String getSentimentCnt() {
		return sentimentCnt;
	}
	public void setSentimentCnt(String sentimentCnt) {
		this.sentimentCnt = sentimentCnt;
	}
	@Override
	public String toString() {
		return "SentimentDto [sentimentName=" + sentimentName + ", sentimentCnt=" + sentimentCnt + "]";
	}
	
	
	
}
