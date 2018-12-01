package 算法.动态规划;
import java.util.Arrays;
//0-1背包
import java.util.Scanner;
public class Package {
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("input a number:");
		int n = input.nextInt();
		int[] weight = new int[n];
		int[] price = new int[n];
		System.out.println("input the weight of package:");
		for(int i=0;i<n-1;i++)
			weight[i] = input.nextInt();
		System.out.println("input the price of package:");
		for(int j=0;j<n-1;j++)
			price[j] = input.nextInt();
		int value = knapsackProblem(weight, price, n);
		System.out.println("the best value:"+value);
	}
	
	public static int knapsackProblem(int[] weight,int[] price,int n)
	{
		int row = weight.length+1;
		int col = n+1;
		int[][] solution = new int[row][col];
		int[] values = new int[row];
		values[0] = 0;
		for(int i=0;i<row;i++)
			solution[i][0] = 0;
		for(int j=0;j<col;j++)
			solution[0][j] = 0;
		for(int i=1;i<row;i++)
		{
			for(int j=1;j<col;j++)
			{
				solution[i][j] = solution[i-1][j];
				if(j-weight[i-1]>=0&&solution[i-1][j-weight[i-1]]+price[i-1]>solution[i][j])
				{
					solution[i][j] = solution[i-1][j-weight[i-1]]+price[i-1];
				}
			}
			values[i] = solution[i][col-1];
		}
		Arrays.sort(values);
		return values[values.length-1];
	}
}
//input a number:
//5
//input the weight of package:
//1 4 2 4 
//input the price of package:
//3 5 3 5
//the best value:8
