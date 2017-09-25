package filesystem;

import java.util.ArrayList;

public interface InterfaceFSystemRepr {
	
	public void storeFilesNames(ArrayList<String>  fileNames);
	public ArrayList<String> getLeaves(String element);
	public ArrayList<String> find(String element);
}
