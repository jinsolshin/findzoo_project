package com.example.demo.vo;

public class Board_typeVO {

	private int board_type_num;
	private String board_name;
	public int getBoard_type_num() {
		return board_type_num;
	}
	public void setBoard_type_num(int board_type_num) {
		this.board_type_num = board_type_num;
	}
	public String getBoard_name() {
		return board_name;
	}
	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}
	public Board_typeVO(int board_type_num, String board_name) {
		super();
		this.board_type_num = board_type_num;
		this.board_name = board_name;
	}
	public Board_typeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
