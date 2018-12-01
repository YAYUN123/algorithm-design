package 算法.动态规划;
//最长公共子序列
import java.util.Scanner;
public class CommonSubsequence {
	public static String a,b;
	public static char[] common;
	public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("Enter two lines of string:");
			a = input.nextLine();
			b = input.nextLine();
			char[] x = a.toCharArray();
			char[] y = b.toCharArray();
			common = new char[10];
			int com = f(x,y);
			System.out.println("the commom of number is:"+com);
			for(int i=0;i<common.length-1;i++)
				System.out.print(common[i]);
	}
	public static int f(char[] x,char[] y)
	{
		int number = 0;
		if(x.length==0||y.length==0)
			return 0;
		else
		{
			if(x[x.length-1]==y[y.length-1])
			{
				common[number] = x[x.length-1];
				String n = new String(x);
				String m = new String(y);
				char[] cn = n.substring(0, n.length()-1).toCharArray();
				char[] cm = m.substring(0, m.length()-1).toCharArray();
				
				number = f(cn,cm)+1;
				
			}
			else
			{
				String n = new String(x);
				char[] cn = n.substring(0, n.length()-1).toCharArray();
				int z = f(cn,y);

				String m = new String(y);
				char[] cm = m.substring(0, m.length()-1).toCharArray();
				int q = f(x,cm);

				if(z>q)
					return z;
				else
					return q;
			}
		}
		return number;
	}
}
//fnsdjkfdsn
//fhsdufhds
//6
