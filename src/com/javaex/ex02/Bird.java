package com.javaex.ex02;

public abstract class Bird {
	
	//필드
    private String name;
    
    //생성자
	public Bird() {
		super();
	}
	
	public Bird(String name) {
		super();
		this.name = name;
	}
	
	//메소드 gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//추상 메서드
  	abstract void sing(); 

  	abstract void fly(); 
	  
  	abstract void showName(); 

}
