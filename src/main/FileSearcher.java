package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import filesystem.FSystemReprSteamAndLeaf;
import filesystemscanner.FileSystemScanner;


public class FileSearcher {

	public static void main(String[] args) {
		try {
			validateInput(args);
			manageInput(args);
		} catch (Exception e) {
			System.out.println (e.getMessage());
		}		

	}
	
	private static void validateInput(String[] args) throws Exception{
		if (args.length == 0) {
			throw new Exception("Hello, please provide the argument");
		}
		if (args.length > 1) {
			throw new Exception("Please enter one file name");
		}
	}
	
	private static void manageInput(String[] args){
		int numFilesInDir = 0;
		
		FileSystemScanner fileSystemScanner = new FileSystemScanner();
		FSystemReprSteamAndLeaf fSystemSteamAndLeaf = new FSystemReprSteamAndLeaf();
		
		
		if (fileSystemScanner.exists(args[0])){
			
			if (fileSystemScanner.isDirectory(args[0])){
				numFilesInDir = fileSystemScanner.getFilesNumberFromDirectory(args[0]);
				
				ArrayList<String> fileNames = fileSystemScanner.getFileNamesFromDirectory(args[0]);
				fSystemSteamAndLeaf.storeFilesNames(fileNames);
				
				
				System.out.println("There are " + numFilesInDir + " Elements");
				
				Scanner scanner = new Scanner(System.in);
				while(true){
					fileSearch(scanner, fSystemSteamAndLeaf);
				}				
			}
			else{
				System.out.println("Not a directory");
			}
		}
		else {
			System.out.println("Does not exist");			
		}		
		
	}
	
	private static void fileSearch(Scanner scanner, FSystemReprSteamAndLeaf fSystemSteamAndLeaf){
		System.out.println("Search>");
		final String line = scanner.nextLine();
		List<String> matches = fSystemSteamAndLeaf.findMatches(line);
		for(String match : matches){
			System.out.println(match);
		}
	}

}
