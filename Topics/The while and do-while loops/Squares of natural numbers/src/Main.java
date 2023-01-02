import java.util.Scanner;
 
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int n = scanner.nextInt();
int a = 1;
while (a * a <= n) {
		
	System.out.println(a * a);
	a++;
	}
scanner.close();
	}

}
