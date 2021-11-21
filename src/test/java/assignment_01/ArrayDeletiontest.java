package assignment_01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayDeletiontest {

	private ArrayDeletion AD;
	private int[] Ad= {1,2,3,4,5};
	@Before
	public void setUp() throws Exception {
		AD=new ArrayDeletion();
	}

	@After
	public void tearDown() throws Exception {
		AD.display(Ad);
		
	}

	@Test
	public void test() {
		int[] expected_AD= {1,2,4,5,-1};
		
		Assert.assertArrayEquals(expected_AD, AD.delete(Ad, 2));
		
		int [] expected_AD1= {1,2,4,5,-1};
		
		Assert.assertArrayEquals(expected_AD1,AD.delete(Ad, -1));
		
		
	}

}
