package assignment_01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Queuetest {
	private Queue Q;
	@Before
	public void setUp() throws Exception {
		Q = new Queue(3);
		
		Q.display();
	}

	
	@After
	public void tearDown() throws Exception {
	
	Q.display();
	}
	@Test
	public void testQueue1() throws Exception {
		
		 Q.enqueue(5);
		 Q.enqueue(6);
		 Q.enqueue(7);
		 
		 Q.display();
		 Q.size();
		 int[] exp= {5,6,7};
		 int [] result = Q.getarray();
			for (int i=0; i<Q.size(); i++)
			{
				Assert.assertEquals( exp[i], result[i]);
			}
		 
	}
	
	@Test
	public void testQueue2() throws Exception {
		 Q.enqueue(1);
		 Q.enqueue(2);
		 Q.enqueue(3);
	
	
		 try {
			 Q.enqueue(4);
			 
		 }catch (Exception e)
		 {
			 System.out.print("Queue is full");
			 e.printStackTrace();
		 }
		 
	}
	@Test
	public void testQueue3() throws Exception {
		Q.enqueue(8);
		 Q.enqueue(9);
		 Q.enqueue(10);
		 Q.RemovePointer();
		 Q.dequeue();
		 Q.dequeue();
		 Q.dequeue();
		 
		 int[] exp= {8};
		 int [] answer = Q.getarray();
			for (int i=0; i<=Q.size(); i++)
			{
				Assert.assertEquals( exp[i], answer[i]);
				
			}
	}
			@Test
			public void testQueue4()  {
				try {
					Q.dequeue();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		
			@Test 
			public void testQueueSize()
			{
				System.out.println(Q.size());
			}
		
}
