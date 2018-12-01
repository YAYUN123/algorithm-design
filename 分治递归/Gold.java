package 算法.分治递归;
import java.util.Scanner;  
//金块问题
public class Gold {  
	
	 public static void main(String[] args) {  
	      @SuppressWarnings("resource")
	      Scanner scanner = new Scanner(System.in);  
	      System.out.println("Please input the number of gold:");
	      int n = scanner.nextInt();
	      System.out.println("the numbers:");
	      int[] gold= new int[n];
	      for(int i=0;i<n;i++)
	    	  gold[i] = scanner.nextInt();
	  
	      int[] result = new int[2];  
	      minmax(0, n - 1, gold, result);  
	  
	      System.out.println("min: " + result[0]);  
	      System.out.println("max: " + result[1]);  
	    }  
  
    public static void minmax(int i, int j, int[] gold, int[] result) {  
  
        int[] ltemp = new int[2];  
        int[] rtemp = new int[2];  
  
        if (i == j - 1) {  
            if (gold[i] <= gold[j]) {  
                result[0] = gold[i];  
                result[1] = gold[j];  
            } else {  
                result[0] = gold[j];  
                result[1] = gold[i];  
            }  
        } else {  
            int mid = (i + j) / 2;  
            minmax(i, mid, gold, ltemp);  
            minmax(mid + 1, j, gold, rtemp);  
  
            if (ltemp[0] <= rtemp[0]) {  
                result[0] = ltemp[0];  
            } else {  
                result[0] = rtemp[0];  
            }  
  
            if (ltemp[1] >= rtemp[1]) {  
                result[1] = ltemp[1];  
            } else {  
                result[1] = rtemp[1];  
            }  
            
        }  
  
    }  
}

//8
//1 3 4 2 23 3 5 54 7 
//min: 1
//max: 54