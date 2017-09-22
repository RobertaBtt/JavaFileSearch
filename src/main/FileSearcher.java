package main;
import java.util.Scanner;
import filesystem.FileSystemScanner;


public class FileSearcher {

	public static void main(String[] args) {
		try {
			manageInput(args);
			manageConsole(args);
		} catch (Exception e) {
			System.out.println (e.getMessage());
		}
		

	}
	
	private static void manageInput(String[] args) throws Exception{
		if (args.length == 0) {
			throw new Exception("Hello, please provide a directory");
		}
	}
	private static void manageConsole(String[] args){
		FileSystemScanner fileSystemScanner = new FileSystemScanner();
		if (fileSystemScanner.exists(args[0]) && ( fileSystemScanner.isDirectory(args[0]))){
			System.out.println("There are" + fileSystemScanner.getFilesNumberInPath(args[0]));
			Scanner scanner = new Scanner(System.in);
			while(true){
				System.out.println("Search>");
				final String line = scanner.nextLine();
			}
		}
		
		
	}

}
