package filesystem;

import java.util.ArrayList;

public interface InterfaceFileSystemScanner {

	boolean isDirectory(String inputName);
	boolean isFile(String inputName);
	boolean exists(String inputName);
	ArrayList<String> getNamesFilesFromDirectory(String inputName);
	int getFilesNumberFromDirectory(String inputName);
	
}
