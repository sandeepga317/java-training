package com.java8;

public class InstanceMethodReference {
	
	public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
    }  
	
	public static void main(String[] args) {
		InstanceMethodReference inst = new InstanceMethodReference();
		Sayable say = inst::saySomething;
		say.say();
	}

}
