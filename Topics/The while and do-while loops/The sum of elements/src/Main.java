import java.util.Scanner;
 
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
	int sum = 0;
	int input = 1;	
	
		while (input > 0) {
		input = scanner.nextInt();		  
			sum += input;	 
		}
		  		    
		System.out.println(sum);
		}
	}
