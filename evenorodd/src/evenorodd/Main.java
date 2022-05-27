package evenorodd;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if ((num ^ 1) == num +1)
		{
			System.out.println("The number " + num  + " is Even");
		}
		else
		{
			System.out.println("The number " + num + " is Odd");
		}
	}
}
