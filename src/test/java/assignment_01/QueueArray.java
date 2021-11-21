package assignment_01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QueueArray {

	QueuewithArray qa;
	@Before
	public void setUp() throws Exception {
	qa=new QueuewithArray(3);qa.display();
	}

	@After
	public void tearDown() throws Exception {
		qa.display();
	}

	@Test
	public void test() {
		qa.enqueue(5);
		qa.enqueue(4);
		qa.enqueue(2);
		
		try {
			qa.enqueue(1);
		}catch(Exception e)
		{
			System.out.println("Queue is full");
			e.printStackTrace();
		}
		
		qa.dequeue();
		
	}

}
