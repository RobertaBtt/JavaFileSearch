package filesystem;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class FileSystemScanner implements InterfaceFileSystemScanner{

	
	public boolean isDirectory(String inputName) {
		File file = new File(inputName);
		return file.isDirectory();
	}

	public boolean isFile(String inputName) {
		File file = new File(inputName);
		return file.isFile();
	}

	public boolean exists(String inputName) {
			File file = new File(inputName);
			return file.exists();
	}
	
	public ArrayList<String> getNamesFilesFromDirectory(String inputName) {
		File f = new File(inputName);
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(f.list()));
		return names;
	}

	

	public int getFilesNumberFromDirectory(String inputName) {
		File f = new File(inputName);
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(f.list()));
		return names.size();
	}

}
