package 算法.分治递归;
//二分搜索
import java.util.Scanner;
public class BinarySearch {
	public static int[] a;
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input a number");
		int n = scanner.nextInt();
		a = new int[n];
		System.out.println("please input the numbers");

		for(int i=0;i<n;i++)
			a[i] = scanner.nextInt();
		System.out.println("please input a number to find");
		int m = scanner.nextInt();
		if(m<a[0]||m>a[n-1])
			System.out.println("你要找的数不存在。。。");
		else
		{
			int i = f1(m,n);
			int j = f2(m,n);
			System.out.println("比它小的最大数的位置："+j);
			System.out.println("比它大的最小数的位置："+i);
		}
		
	}
	public static int f1(int m,int n)
	{
		int left = 0,right = n-1;
		while(left<right)
		{
			int mid = (left+right)/2+1;
			if(m == a[mid])
				return mid;
			else if(m>a[mid])
				left = mid+1;
			else
				right = mid -1;	
		}
		return left+1;
	}
	public static int f2(int m,int n)
	{
		int left = 0,right = n-1;
		while(left<right)
		{
			int mid = (left+right)/2+1;
			if(m == a[mid])
				return mid;
			else if(m>a[mid])
				left = mid+1;
			else
				right = mid - 1;
		}
		return right+1;
	}
}
//4
//1 2 4 5
//3
