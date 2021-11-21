package assignment_01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Stacktest {

	private Stack S;
	@Before
	public void setUp() throws Exception {
		S=new Stack();
	}

	@After
	public void tearDown() throws Exception {

	S.display();
	}

	@Test
	public void test() {

	S.push(1);

	S.push(2);

	S.push(3);

	S.push(4);
	
	int [] array_expected= {1,2,3,4};
	
	int [] Arr_res= S.getarray();
	
	for(int i=0;i<S.getsize();i++)
	{
		Assert.assertEquals(array_expected[i],Arr_res[i]);
	}

	}
	@Test
	public void test2() {
		
		S.push(1);

		S.push(2);

		S.push(3);

		S.push(4);

	Assert.assertEquals(4, S.pop());
	}
	
	@Test
	public void test3() {

		S.push(1);

		S.push(2);

		S.push(3);

		S.push(4);

		for(int i=0;i<4;i++)
			S.pop();
			Assert.assertEquals(-1, S.pop());
	
	
	
	}
	
	
	
}
