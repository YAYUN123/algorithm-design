package 算法.贪心;
//最优服务

import java.util.Scanner;

public class BestService 
{

	public static void main(String[] args) 
	{
		int sum=0,temp=0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the number of people:");
		int k = input.nextInt();
		int[] arr = new int[k];
		System.out.println("Please input the time of waiting:");
		for(int i=0;i<k;i++)
			arr[i]=input.nextInt();
		for (int i = 0; i < k - 1; i++)
		{
			for (int j = 0; j < k - 1 - i; j++)
			{
				if (arr[j] > arr[j + 1])
				{
	            temp = arr[j];
	            arr[j] = arr[j + 1];
	            arr[j + 1] = temp;
				}
			}
		}
		for(int i=1;i<=k;i++)
		{
			int m = f(arr,i);
			sum = sum+m;
		}
		System.out.println("the average of time:"+sum/10.0);
	}
	public static int f(int[] a,int n) 
	{
		int[] b = a;
		int s = 0;
		for(int i=0;i<n;i++)
		{
			s=s+b[i];			
		}
		return s;
	}
}
//Please input the number of people:
//10
//Please input the time of waiting:
//56 12 1 99 1000 234 33 55 99 812
//the average of time:532.0
