package 算法.贪心;

import java.util.Scanner;
//汽车加油
public class CarFill {
	public static void main(String[] args) 
	{
		int[] distance;
		int n,k,times=0,sum=0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please input two numbers:"); 
		n = input.nextInt();
		k = input.nextInt();
		distance  = new int[k+1];
		System.out.println("Please the numbers of distance,now");
		for(int i=0;i<k+1;i++)
			distance[i] = input.nextInt();
		for(int j=0;j<k+1;j++)
		{
			sum = sum+distance[j];
			if(sum>n)
			{
				times++;
				sum=0;
				j--;
				continue;
			}
			else
				distance[j] = sum;
		}
		System.out.println("the times is:"+times);
	}
}
//Please input two numbers:
//7 7
//Please the numbers of distance,now
//1 2 3 4 5 1 6 6
//the times is:4