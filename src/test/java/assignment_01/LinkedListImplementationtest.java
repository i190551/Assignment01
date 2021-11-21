package assignment_01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedListImplementationtest {

	LinkedListImplementation lli;
	@Before
	public void setUp() throws Exception {
	lli=new LinkedListImplementation();
	
	}

	@After
	public void tearDown() throws Exception {
		lli.display();
	}

	@Test
	public void test1() {
		
		lli.pushFront(400);
		lli.pushBack(40);
	}

	@Test
	public void test2() {
		
		lli.display();
		lli.add(45);
		lli.pushFront(400);
		lli.pushBack(40);
		
		
	}
	

	@Test
	public void test3() {
		try
		{
		lli.topFront();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	
		
		
	}

	@Test
	public void test4() {
		try
		{
			lli.pushFront(50);
			lli.pushFront(60);
		lli.popFront();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	
		
		lli.size();
	}
	
	public void test5() {
	
		try
		{
			lli.topBack();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	
		
		lli.size();
	}

}
