package assignment_01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




public class StackwithLinkedListtest {

	StackwithLinkedList link_stack;
	@Before
	public void setUp() throws Exception {
		link_stack=new StackwithLinkedList();
	}

	@After
	public void tearDown() throws Exception {
	
	link_stack.display();
	}

	@Test
	public void test() throws Exception {
		
		link_stack.display();
		Assert.assertEquals(-1, link_stack.pop());
		Assert.assertEquals(-1, link_stack.top());
		
		
		link_stack.push(10);
		link_stack.push(20);
		link_stack.push(30);
		link_stack.push(40);
		link_stack.push(50);
		Assert.assertEquals(50, link_stack.pop());
		

		link_stack.getSize();

	
	}

}
