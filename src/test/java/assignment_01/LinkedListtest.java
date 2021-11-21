package assignment_01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedListtest {

	LinkedList single;
	@Before
	public void setUp() throws Exception {
	
		single=new LinkedList();
	}

	@After
	public void tearDown() throws Exception {
	
	single.display();
	}

	@Test
	public void test() throws Exception {


		single.pop(2);
		single.display();
		try {
			single.pushBack(40);
		
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
		try {
		single.popFront();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		try {
		single.popBack();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try {
			single.popBack();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	single.pushFront(10);
	single.pushFront(20);
	single.pushFront(30);
	
	single.pop(2);
	
	single.pushBack(40);
	
	single.popFront();
	


	
	}

}
