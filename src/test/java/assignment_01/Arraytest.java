package assignment_01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Arraytest {

	private ArrayInsertion AI;
	private Array Ar;

	private int[] ar= {80,60,50,70,40};
	private int[] ar1= {4,5,6,7,8};
	
	@Before
	public void setUp() throws Exception {

		Ar=new Array(ar,5);
	}

	@After
	public void tearDown() throws Exception {
		
		
		
		Ar.display();
		
	}

	@Test
	public void test() {
	
		
		
		boolean expected_ar=true;
		boolean expected_ar1=false;

		//Ar.insert(10, 4);
		
		Ar.display();
		Ar.delete(3);
		
		Assert.assertEquals(expected_ar,Ar.linearSearch(50));
		
		Assert.assertEquals(false,Ar.linearSearch(100));
		
		
		Ar.bubbleSort();
		

		Assert.assertEquals(expected_ar1,Ar.binarySearch(60, 5, 0));
		Assert.assertEquals(expected_ar,Ar.binarySearch(50, 0, 5));
	}
	

}
