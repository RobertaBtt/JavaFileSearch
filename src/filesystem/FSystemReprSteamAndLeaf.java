package filesystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FSystemReprSteamAndLeaf implements InterfaceFSystemRepr {
	
	private Map<String, ArrayList<String>> filesNamesHashMap = new HashMap<String, ArrayList<String>>();

	
	public void storeFilesNames(ArrayList<String> fileNames) {		
		for(String name: fileNames){
			this.addElementToMap(name);
		}
		
	}
	
	
	private void addElementToMap(String element) {
		String key = element.substring(0,1).toLowerCase();
		
		if (filesNamesHashMap.containsKey(key)){
			filesNamesHashMap.get(key).add(element);
		}
		else{
			ArrayList<String> words = new ArrayList<String>();
			words.add(element);
			filesNamesHashMap.put(key, words);
		}
		
	}

	public List<String> findMatches(String element) {
		
		RegExprScoreMatch scoreMatch = new RegExprScoreMatch();
		List<String> matches = new ArrayList<String>();		
		List<String> leaves = this.getLeaves(element);
		for(String leaf: leaves){
			matches.add(leaf + " " + scoreMatch.getMatch(leaf, element) + " %");
		}
		
		return matches;
		
	}
	
	public List<String> getLeaves(String element){
		String key = element.substring(0,1).toLowerCase();
		
		if (filesNamesHashMap.containsKey(key)){
			return filesNamesHashMap.get(key);
		}
		else return new ArrayList<String>();
	}
	
	
}
