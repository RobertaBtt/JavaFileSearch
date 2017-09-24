package main;
import java.util.Scanner;
import filesystem.FileSystemScanner;


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
	}
	
	private static void manageInput(String[] args){
		int numFilesInDir = 0;
		
		FileSystemScanner fileSystemScanner = new FileSystemScanner();
		
		if (fileSystemScanner.exists(args[0])){
			
			if (fileSystemScanner.isDirectory(args[0])){
				numFilesInDir = fileSystemScanner.getFilesNumberFromDirectory(args[0]);
				
				//get files from directory
				//build representation
				//find in the representation
				
				System.out.println("There are" + numFilesInDir);
				
				Scanner scanner = new Scanner(System.in);
				while(true){
					System.out.println("Search>");
					final String line = scanner.nextLine();
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

}
