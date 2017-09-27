package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import assignment.Stmt;

public class StmtTest {
	Stmt st=null;
	@Before
	public void setUp() throws Exception {
		st=new Stmt();
		
	}

	@After
	public void tearDown() throws Exception {
		st =null;
	}

	@Test
	public void oddTest() {
		int input=3;
		String actual="Tom";
		String expected=st.Tomjerry(input);
		assertEquals(expected,actual);
	}
	@Test
	public void evenTest() {
		int input=6;
		String actual="jerry";
		String expected=st.Tomjerry(input);
		assertEquals(expected,actual);
	}

}
