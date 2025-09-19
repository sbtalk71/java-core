package com.demo.util;

public interface ActionHandler {

	public void doAction();
}


class Util{
	public static void main(String[] args) {
		
		GreetHandler h= new GreetHandler();
		h.doAction();
		
		
		ActionHandler ah=new ActionHandler() {
			@Override
			public void doAction() {
				System.out.println("action Handled...");
				
			}
		};
		
		ah.doAction();
		
	
	}
}


class GreetHandler implements ActionHandler{

	@Override
	public void doAction() {
		System.out.println("Greetins delivered...");
		
	}
	
}