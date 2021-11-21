package assignment_01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayInsertiontest {
	private ArrayInsertion AI;
	private int[] Ai= {1,2,3,4,5,6,7,8,9,10};

	@Before
	public void setUp() throws Exception {
		AI=new ArrayInsertion();
		
	}

	@After
	public void tearDown() throws Exception {
		AI.display(Ai);
			
	}

	@Test
	public void test() {
	
		int[] expected_AI= {1,2,3,4,5,11,7,8,9,10};
		
		
		
		Assert.assertArrayEquals(expected_AI, AI.insert(Ai, 11, 5));
		
		int [] expected_AI2= {5,1,3,4,5,11,7,8,9,10};
		Assert.assertArrayEquals(expected_AI2,AI.insert(expected_AI2, 5,0) );
		
		AI.setArray(12);
		int[] expected_AI1= {1,2,3,4,5,11,7,8,9,10};	
		Assert.assertArrayEquals(expected_AI1, AI.insert(Ai, 6, 0));
		
	}

}
