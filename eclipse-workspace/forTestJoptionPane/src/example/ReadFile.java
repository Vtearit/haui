package example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class ReadFile {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("OutputFile.txt");
		
		if(file.exists()) {
			Scanner inputFile = new Scanner(file);
			while(inputFile.hasNext()) {
				System.out.println(inputFile.nextLine());
			}
			inputFile.close();
		}
		else JOptionPane.showMessageDialog(null, "The file does not exists");
	}
}
