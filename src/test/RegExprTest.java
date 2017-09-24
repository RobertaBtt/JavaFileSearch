package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import filesystem.RegExprScoreMatch;

public class RegExprTest {

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
		assertEquals(50, regExprScoreMatch.getMatch("fileName.jpg", "fileNa8rufhdk"));
	}

}
