package filesystem;

import java.util.ArrayList;
import java.util.List;

public class RegExprScoreMatch implements InterfaceRegExprScoreMatch {

	List<String> regExprPatters = new ArrayList<String>();
	
	public int getMatch(String fileNameMemorized, String fileNameSearched) {
	
		String regExpLevel1 = fileNameMemorized;
		int fileNameMemorizedSize = fileNameMemorized.length();
		
		String regExpLevel2 = fileNameMemorized.substring(0,fileNameMemorizedSize/2) + "\\w*\\d*";
		
		if (fileNameSearched == fileNameMemorized) return 100;
		else if (fileNameSearched.matches(regExpLevel2)) return 50;
		else return 0;
	}

}
