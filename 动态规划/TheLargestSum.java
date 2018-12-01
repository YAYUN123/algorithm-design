package 算法.动态规划;
//最大子段和
import java.util.Scanner;
public class TheLargestSum {
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a number:");
		int n = input.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
			a[i] = input.nextInt();
		int m = MaxSum(a,n);
		System.out.println(m);
	}
	
	public static int MaxSum(int[] a,int n)
	{
		int sum=0,b=0;
		for(int i=0;i<n;i++)
		{
			if(b>0)
				b+=a[i];
			else
				b=a[i];
			if(b>sum)
				sum=b;
		}
		return sum;
	}
}
//5
//-2 3 -4 3 76
//79

