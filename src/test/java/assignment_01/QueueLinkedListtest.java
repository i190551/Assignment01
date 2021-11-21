package assignment_01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QueueLinkedListtest {

	QueuewithLinkedList ql;
	@Before
	public void setUp() throws Exception {
		ql=new QueuewithLinkedList();
	}

	@After
	public void tearDown() throws Exception {
		
		ql.display();
	}

	@Test
	public void test() {
	
		ql.dequeue();
	}
	
	@Test
	public void test2() {
		ql.enqueue(10);
		ql.enqueue(100);
		ql.enqueue(1000);
		
		ql.dequeue();
		
	}

}
