package test;

import static org.junit.Assert.*;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import filesystem.FSystemReprSteamAndLeaf;
import filesystem.FileSystemScanner;



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
	}

	@Test
	public void testGetLeavesT() {
		steamAndLeaf.storeFilesNames(fileNames);
		assertEquals(2, steamAndLeaf.getLeaves(THAT).size());
	}
	
	@Test
	public void testGetLeavesA() {
		steamAndLeaf.storeFilesNames(fileNames);
		assertEquals(0, steamAndLeaf.getLeaves("a_test").size());
	}
	
	@Test
	public void testGetLeavesI() {
		steamAndLeaf.storeFilesNames(fileNames);
		assertEquals(2, steamAndLeaf.getLeaves("Image").size());
	}
	
	

}
