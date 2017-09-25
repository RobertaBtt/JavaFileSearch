package filesystemscanner;

import java.util.ArrayList;

public interface InterfaceFileSystemScanner {

	boolean isDirectory(String inputName);
	boolean isFile(String inputName);
	boolean exists(String inputName);
	int getFilesNumberFromDirectory(String inputName);
	ArrayList<String> getFileNamesFromDirectory(String inputName);
	
}
