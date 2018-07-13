package top.geomatics;

import top.geomatics.hello.Greeting;

public class HelloWorldImpl implements Greeting{
	final String m_name;
	
	public HelloWorldImpl(String m_name) {
		this.m_name = m_name;
	}

	
	public void sayHello() {
		System.out.println("Hello,"+m_name+"!");
	}

}
