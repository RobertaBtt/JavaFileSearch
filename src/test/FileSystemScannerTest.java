package test;

import static org.junit.Assert.*;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Before;
import org.junit.Test;

import filesystem.FileSystemScanner;



public class FileSystemScannerTest {

	private String TESTEXISTINGDIR = null;
	private String TESTNOTEXISTINGDIR = null;
	private String TESTEXISTINGFILE = null;
	private String TESTNOTEXISTINGFILE = null;

	
	@Before
	public void setUp() throws Exception {
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();		
		TESTEXISTINGDIR  = s + "/src/test/test_folder";
		TESTNOTEXISTINGDIR = s + "/src/test/test_folderz";
		TESTEXISTINGFILE = s + "/src/test/test_folder/test.txt";
		TESTNOTEXISTINGFILE = s + "/src/test/test_folder/test.txt";
	}

	@Test
	public void testExistingDirectory() {
		FileSystemScanner validator = new FileSystemScanner();
		assertEquals(true, validator.isDirectory(TESTEXISTINGDIR));
	}
	
	@Test
	public void testNotExistingDirectory() {
		FileSystemScanner validator = new FileSystemScanner();
		assertEquals(false, validator.isDirectory(TESTNOTEXISTINGDIR));
	}
	
	@Test
	public void testIsFile() {
		FileSystemScanner validator = new FileSystemScanner();
		assertEquals(true, validator.isFile(TESTEXISTINGFILE));
	}
	
	@Test
	public void testNotExistingFile() {
		FileSystemScanner validator = new FileSystemScanner();
		assertEquals(false, validator.isDirectory(TESTNOTEXISTINGFILE));
	}
	
	
	@Test
	public void testontentList() {
		FileSystemScanner validator = new FileSystemScanner();
		assertEquals(4, validator.getFilesNumberInPath(TESTEXISTINGDIR));
	}	

}
