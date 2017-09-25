package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import stringmatch.RegExprScoreMatch;


public class RegExprScoreMatchTest {

	private RegExprScoreMatch regExprScoreMatch = new RegExprScoreMatch();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {		
		assertEquals(100, regExprScoreMatch.getMatch("fileName.jpg", "fileName.jpg"));
	}
	
	@Test
	public void test2() {		
		assertEquals(50, regExprScoreMatch.getMatch("fileName.jpg", "FileNa8rufhdk"));
	}
	
	@Test
	public void test4() {		
		assertEquals(33, regExprScoreMatch.getMatch("fileName.jpg", "file"));
	}
	
	@Test
	public void test5() {		
		assertEquals(25, regExprScoreMatch.getMatch("fileName.jpg", "filZZZZZZZZZ"));
	}
	
	@Test
	public void test6() {		
		assertEquals(10, regExprScoreMatch.getMatch("fileName.jpg", "fi000"));
	}
	
	@Test
	public void test7() {		
		assertEquals(1, regExprScoreMatch.getMatch("fileName.jpg", "00000"));
	}

}
