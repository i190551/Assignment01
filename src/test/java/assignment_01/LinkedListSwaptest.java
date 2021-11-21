package assignment_01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedListSwaptest {
LinkedListSwap lls;
	@Before
	public void setUp() throws Exception {
	lls=new LinkedListSwap();
	lls.display();
	}

	@After
	public void after() throws Exception {
		lls.display();
	}	

	@Test
	public void test() {
		lls.pushFront(50);
		lls.pushFront(60);
		
		
		
	}

	
	@Test
	public void test2() {
		lls.pushBack(5);
		lls.pushBack(6);
		
		
		
	}
	
	@Test
	public void test3() {
		lls.pushFront(50);
		lls.pushFront(60);
		
		lls.swap();
		
	}
}
