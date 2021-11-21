package assignment_01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueImplementationtest {
QueueImplementation qi;
	@Before
	public void setUp() throws Exception {
		qi=new QueueImplementation(5);
	}

	@After
	public void tearDown() throws Exception {
	
		qi.display();
	}

	@Test
	public void testempty() {
		Assert.assertEquals(true,qi.empty() );
		
	}
	
	@Test
	public void test() {
		try {
			qi.enqueue(5);
			qi.enqueue(7);
			qi.enqueue(4);
			
			qi.enqueue(6);
			qi.enqueue(1);
			qi.enqueue(2);
			
			
			
		}catch (Exception e)
		{
			System.out.println("Cannot enqueue, Queue is full");
			e.printStackTrace();
		}
		
		Assert.assertEquals(false,qi.empty() );
		
	}
	
	
	@Test
	public void test2() {
		
		
	try {
		
		qi.dequeue();
		
		
		
	}catch (Exception e)
	{
		System.out.println("Cannot dequeue, Queue is empty");
		e.printStackTrace();
	}
	
	
	}

	@Test
	public void test3() {
		
		
	try {
		qi.enqueue(4);
		qi.dequeue();
		
		qi.dequeue();
		
		
	}catch (Exception e)
	{
		System.out.println("Cannot dequeue, Queue is empty");
		e.printStackTrace();
	}
	
	
	}

	@Test
	public void test4()
	{
		qi.size();
	}
}
