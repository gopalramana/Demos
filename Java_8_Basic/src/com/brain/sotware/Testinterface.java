package com.brain.sotware;

public class Testinterface implements Interface1,Interface2{

	public static void main(String[] args) {
		
		Interface1 one=new Testinterface();
	/*	one.add();
		one.hello();*/
            

	}






	@Override
	public void hello() {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void div() {
		// TODO Auto-generated method stub
		Interface1.super.div();
	}






	@Override
	public void add() {
		// TODO Auto-generated method stub
		Interface1.super.add();
	}



}
