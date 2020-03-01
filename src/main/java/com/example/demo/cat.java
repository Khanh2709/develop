package com.example.demo;

public class cat {
	private String talk;
	  public cat() {
	  }
	  public cat(String talk) {
	    this.talk = talk;
	  }
	  public void setTalk(String talk) {
	    this.talk = talk;
	  }
	  public String getTalk() {
	    return talk;
	  }
	  public void print() {
	    System.out.println("Print: " + this.talk);
	  }

	}

