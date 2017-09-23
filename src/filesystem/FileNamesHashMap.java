package filesystem;
import java.util.ArrayList;
import java.util.Map;

import java.util.HashMap;

public class FileNamesHashMap implements InterfaceFilesNameHashMap{

	private Map<String, ArrayList<String>> filesNamesHashMap = new HashMap();
	
	public void addElementToMap(String element) {
		String key = element.substring(0,1);
		
		if (filesNamesHashMap.containsKey(key)){
			filesNamesHashMap.get(key).add(element);
		}
		else{
			ArrayList<String> words = new ArrayList<String>();
			words.add(element);
			filesNamesHashMap.put(key, words);
		}
		
	}

	public ArrayList<String> getElementFromMap(String element) {
		
		String key = element.substring(0,1);
		
		if (filesNamesHashMap.containsKey(key)){
			return filesNamesHashMap.get(key);
		}
		else return new ArrayList<String>();
	}

}
