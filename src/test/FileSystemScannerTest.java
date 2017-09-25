package test;

import static org.junit.Assert.*;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Before;
import org.junit.Test;

import filesystemscanner.FileSystemScanner;



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
		TESTNOTEXISTINGFILE = s + "/src/test/test_folder/test_not_found.txt";
	}

	@Test
	public void testIsDirectory() {
		FileSystemScanner validator = new FileSystemScanner();
		assertEquals(true, validator.isDirectory(TESTEXISTINGDIR));
	}
	
	@Test
	public void testIsNotDirectory() {
		FileSystemScanner validator = new FileSystemScanner();
		assertEquals(false, validator.isDirectory(TESTNOTEXISTINGDIR));
	}
	
	@Test
	public void testIsFile() {
		FileSystemScanner validator = new FileSystemScanner();
		assertEquals(true, validator.isFile(TESTEXISTINGFILE));
	}
	
	
	@Test
	public void notExists() {
		FileSystemScanner validator = new FileSystemScanner();
		assertEquals(false, validator.exists(TESTNOTEXISTINGFILE));
	}
	
	
	@Test
	public void testontentList() {
		FileSystemScanner validator = new FileSystemScanner();
		assertEquals(4, validator.getFilesNumberFromDirectory(TESTEXISTINGDIR));
	}	
	
	@Test
	public void getNamesFiles() {
		FileSystemScanner validator = new FileSystemScanner();
		assertEquals("test2.txt", validator.getFileNamesFromDirectory(TESTEXISTINGDIR).get(0));
	}
	

}
