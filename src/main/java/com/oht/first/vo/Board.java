package com.oht.first.vo;

import java.sql.Date;

public class Board {
	private int boardNo;
	private String title;
	private String content;
	private Date date;
	private String memId;
	
	public Board(int boardNo, String title, String content, Date date, String memId) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.date = date;
		this.memId = memId;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", date=" + date + ", memId="
				+ memId + "]";
	}

	
	
}
