import java.util.Scanner;

public class ProjectOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println ("I will find the averages of three numbers for you.");
System.out.println ("Enter three whole numbers on a line:");

int num1, num2, num3; 
double Avg;
double Sum;

Scanner keyboard = new Scanner(System.in);
num1= keyboard.nextInt();
num2= keyboard.nextInt();
num3= keyboard.nextInt();
Sum= (num1 + num2 + num3);
Avg= (Sum/3);

System.out.println("If you have numbers: " + num1 + " " + num2 + " "+ num3);
System.out.println("The average of these three numbers are:");
System.out.println(Avg);	
	
	
	}

}
