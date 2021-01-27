package example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ReadJOptionPane {
	
	public static void check() {
		String name1;
		String name2;
		name1 = JOptionPane.showInputDialog(null, "Enter name 1: ");
		name2 = JOptionPane.showInputDialog("Enter name 2: ");
		
		if(name1.equals(name2)) JOptionPane.showMessageDialog(null, "Name 1 is equal to name 2!");
		else JOptionPane.showMessageDialog(null, "Not the same");
		
		char letter;
		String input = JOptionPane.showInputDialog("Please enter your letter: ");
		letter = input.charAt(0);
		
		switch(letter) {
			case 'A':
			case 'a':
				JOptionPane.showMessageDialog(null, "You entered a ");
				break;
			case 'b':
				JOptionPane.showMessageDialog(null, "You entered b ");
				break;
			default:
				JOptionPane.showInternalMessageDialog(null, "I don't know");
				break;
		}	
	}
	public static void valid() {
			String input = JOptionPane.showInputDialog("Please enter a number in the range of 1 through 100");
			int number = Integer.parseInt(input);
			
			while(number < 1 || number > 100) {
				JOptionPane.showMessageDialog(null, "That number is not valid!");
				input = JOptionPane.showInputDialog("Please enter a number in the range of 1 through 100");
				number = Integer.parseInt(input);
			}
			JOptionPane.showMessageDialog(null, "Correct!");
		}
	public static void printTest() throws FileNotFoundException {
		// create and open the file
		// if the file exists, it will replace this file
		PrintWriter outputFile = new PrintWriter("OutputFile.txt");
		
		outputFile.println("This is the first line");
		outputFile.println("This is the second line");
		outputFile.println("This is the third line");
		
		outputFile.close();
		JOptionPane.showMessageDialog(null, "Create File success");
	}
	
	public static void checkYear() {
		int year;
        String can = "", chi = "";
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào năm dương lịch: ");
        year = scanner.nextInt();
         
        // Xác định Can
        switch (year % 10) {
            case 0:
                can = "Canh";
                break;
            case 1:
                can = "Tân";
                break;
            case 2:
                can = "Nhâm";
                break;
            case 3:
                can = "Quý";
                break;
            case 4:
                can = "Giáp";
                break;
            case 5:
                can = "Ất";
                break;
            case 6:
                can = "Bính";
                break;
            case 7:
                can = "Đinh";
                break;
            case 8:
                can = "Mậu";
                break;
            case 9:
                can = "Kỷ";
                break;
        }
         
        // Xác định Chi
        switch (year % 12) {
            case 0:
                chi = "Thân";
                break;
            case 1:
                chi = "Dậu";
                break;
            case 2:
                chi = "Tuất";
                break;
            case 3:
                chi = "Hợi";
                break;
            case 4:
                chi = "Tý";
                break;
            case 5:
                chi = "Sửu";
                break;
            case 6:
                chi = "Dần";
                break;
            case 7:
                chi = "Mẹo";
                break;
            case 8:
                chi = "Thìn";
                break;
            case 9:
                chi = "Tỵ";
                break;
            case 10:
                chi = "Ngọ";
                break;
            case 11:
                chi = "Mùi";
                break;
        }
         
        System.out.println("Năm âm lịch tương ứng với năm dương lịch = " + 
                year + " là " + (can + " " + chi));
	}

	public static void checkBmi() {
		double h, bmi, w ;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap chieu cao: ");
            h = sc.nextDouble();
            System.out.println("Nhap can nang: ");
            w = sc.nextDouble();
            bmi = (double)(w/(h*h));
            if (bmi < 18)
                System.out.println("gầy");
            else if (bmi >= 18 && bmi <= 24.9)
            	System.out.println("bt");
            else if (bmi > 24.9 && bmi <= 29.9)
            	System.out.println("béo 1");
            else if (bmi > 29.9 && bmi <= 34.9)
            	System.out.println("béo 2");
            else
            	System.out.println("béo 3");
        }
	
	public static void main(String[] args) throws FileNotFoundException {
		// valid();
//		checkYear();
		checkBmi();
//		printTest();
//		String name;
//		String surname;
//		System.out.println("");
//		name = JOptionPane.showInputDialog("Please enter your name: ");
//		surname = JOptionPane.showInputDialog("Please enter your surname: ");
//		JOptionPane.showMessageDialog(null, name + " " + surname);
//		
//		int firstNumber;
//		int secondNumber;
//		String input;
//		
//		input = JOptionPane.showInputDialog("Please enter the first number: ");
//		firstNumber = Integer.parseInt(input);
//		JOptionPane.showMessageDialog(null, input);
		
		System.exit(0);
		
	}
}
