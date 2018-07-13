package top.geomatics;

import top.geomatics.hello.Greeting;

public class GreetingImpl implements Greeting{
	final String m_name;

	public GreetingImpl(String m_name) {
		
		this.m_name = m_name;
	}
	
	public void sayHello() {
		System.out.println("Hello, "+ m_name+"!");
		
	}

}
