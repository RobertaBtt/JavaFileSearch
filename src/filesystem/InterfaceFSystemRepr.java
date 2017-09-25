package filesystem;

import java.util.ArrayList;
import java.util.List;

public interface InterfaceFSystemRepr {
	
	public void storeFilesNames(ArrayList<String>  fileNames);
	public List<String> getLeaves(String element);
	public List<String> findMatches(String element);
}
