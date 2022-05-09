package qaautomation.march2022;

import java.util.Scanner;

public class TugasDua {
	
	public static void main(String[] args) {
	    double n1, n2;
	    Scanner inp = new Scanner(System.in);

	    System.out.print("Input Nilai Pertama: ");
	    String inp1 = inp.nextLine();
	    try{
	    	n1 = Double.parseDouble(inp1);
	    } catch(NumberFormatException numberFormatException){
	        System.out.println("Salah input format nomor: "+inp1+". Exception:" +numberFormatException.getMessage());
	        return;
	    }

	    System.out.print("Input Nilai Kedua: ");
	    String inp2 = inp.nextLine();
	    try{
	        n2 = Double.parseDouble(inp2);
	    } catch(NumberFormatException numberFormatException){
	        System.out.println("Salah input format nomor: "+inp2+". Exception:" +numberFormatException.getMessage());
	        return;
	    }

	    System.out.print("Masukkan Operator: ");
	    String inp3 = inp.nextLine();

	    switch (inp3) {

	        case "+":
	            System.out.println("Hasilnya adalah: " + (n1 + n2));
	            break;
	        case "-":
	            System.out.println("Hasilnya adalah: " + (n1 - n2));
	            break;
	        case "*":
	            System.out.println("Hasilnya adalah: " + (n1 * n2));
	            break;
	        case "/":
	            System.out.println("Hasilnya adalah: " + (n1/n2));
	            break;
	        default:
	            System.out.println("Operator tidak benar! \nSilahkan gunakan '-,+,*,/' ");

	    }

	}

	}