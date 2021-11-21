package assignment_01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyStacktest {
	private MyStack MS;

	@Before
	public void setUp() throws Exception {
		MS=new MyStack(8);
	}

	@After
	public void tearDown() throws Exception {
		
		MS.displayStack();
	
	}

	@Test
	public void test1() throws Exception {
		
		
		try {
			MS.top();
			
			
		}catch (Exception E)
		{
			System.out.println("Stack is Empty");
			E.printStackTrace();
		}
		
		try {
			MS.pop();
		}catch (Exception E)
		{
			System.out.println("Cannot pop,Stack is empty.");
			E.printStackTrace();
		}
		
	}

	@Test
	public void test2() throws Exception {	
		MS.push(10);
		MS.push(20);
		MS.push(30);
		MS.push(40);
		
		
		Assert.assertEquals(40, MS.top());
		
	}	
	

	@Test
	public void test3() throws Exception {
		MS.push(10);
		MS.push(100);
		MS.push(150);
		MS.push(200);
		MS.push(250);
		MS.push(300);
		MS.push(350);
		MS.push(450);
		
		try {
			MS.push(550);
		}catch (Exception E)
		{
			System.out.println("Cannot push,Stack is full");
			E.printStackTrace();
		}
		
	

		Assert.assertEquals(450, MS.top());
	}
//	
//
	@Test
	public void test5() throws Exception {
		MS.push(10);
		MS.push(100);
		MS.push(150);
		MS.push(200);
		MS.push(250);
		MS.push(300);
		MS.pop();
		
		Assert.assertEquals(250, MS.top());
	}
	

	@Test
	public void test6() throws Exception {
		MS.push(10);
		MS.push(100);
		MS.push(150);
		MS.push(200);
		MS.push(250);
		int expected_size=5;
		
		Assert.assertEquals(expected_size, MS.size());
		
	}
	
	
	
}
