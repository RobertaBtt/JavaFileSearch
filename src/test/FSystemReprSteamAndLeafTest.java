package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import filesystem.FSystemReprSteamAndLeaf;



public class FSystemReprSteamAndLeafTest {

	private String THIS = "this";
	private String THAT = "that";
	private String IMG_FILE = "imgfile.jpg";
	private String IMG_01 = "img01";
	
	private FSystemReprSteamAndLeaf steamAndLeaf = new FSystemReprSteamAndLeaf();
	private ArrayList<String> fileNames = new ArrayList<String>();
	
	@Before
	public void setUp() throws Exception {
		fileNames.add(THIS);
		fileNames.add(THAT);
		fileNames.add(IMG_FILE);
		fileNames.add(IMG_01);
		steamAndLeaf.storeFilesNames(fileNames);

	}

	@Test
	public void testGetLeavesT() {
		assertEquals(2, steamAndLeaf.getLeaves(THAT).size());
	}
	
	@Test
	public void testGetLeavesA() {
		assertEquals(0, steamAndLeaf.getLeaves("a_test").size());
	}
	
	@Test
	public void testGetLeavesI() {
		assertEquals(2, steamAndLeaf.getLeaves("Image").size());
	}
	
	@Test
	public void testfindMatches1(){
		List<String> matches = steamAndLeaf.findMatches("immagine");	
		assertEquals(2,  matches.size());
	}
	
	@Test
	public void findMatches2(){
		List<String> matches = steamAndLeaf.findMatches("notFound");	
		assertEquals(0,  matches.size());
	}

}
