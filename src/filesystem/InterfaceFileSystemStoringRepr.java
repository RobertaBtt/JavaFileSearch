package filesystem;

import java.util.ArrayList;

public interface InterfaceFileSystemStoringRepr {
	
	public void storeFilesNames(ArrayList<String>  fileNames);
	public ArrayList<String> find(String element);
}
