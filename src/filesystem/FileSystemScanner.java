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


	public ArrayList<String> getListContent(String inputName) {
		File f = new File(inputName);
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(f.list()));
		return names;
	}

	public boolean exists(String inputName) {
		File file = new File(inputName);
		return file.exists();
	}

	public int getFilesNumberInPath(String inputName) {
		File f = new File(inputName);
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(f.list()));
		return names.size();
	}

}
