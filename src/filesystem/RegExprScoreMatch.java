package filesystem;

import java.util.ArrayList;
import java.util.List;

public class RegExprScoreMatch implements InterfaceRegExprScoreMatch {

	List<String> regExprPatters = new ArrayList<String>();
	
	public int getMatch(String fileNameMemorized, String fileNameSearched) {
		
		fileNameSearched = fileNameSearched.toLowerCase();
		fileNameMemorized = fileNameMemorized.toLowerCase();
		
		String regExpLevel1 = fileNameMemorized;
		int fileNameMemorizedSize = fileNameMemorized.length();
		
		String regExpLevel2 = fileNameMemorized.substring(0,fileNameMemorizedSize/2) + "\\w*\\d*";
		
		String regExpLevel3 = fileNameMemorized.substring(0,fileNameMemorizedSize/3) + "\\w*\\d*";
		String regExpLevel4 = fileNameMemorized.substring(0,fileNameMemorizedSize/4) + "\\w*\\d*";
		
		String regExpLevel5 = fileNameMemorized.substring(0,fileNameMemorizedSize/10) + "\\w*\\d*";
		
		if (fileNameSearched.matches(regExpLevel1)) return 100;
		else if (fileNameSearched.matches(regExpLevel2)) return 50;
		else if (fileNameSearched.matches(regExpLevel3)) return 33;
		else if (fileNameSearched.matches(regExpLevel4)) return 25;
		else if (fileNameSearched.matches(regExpLevel5)) return 10;
		else return 0;
	}

}
