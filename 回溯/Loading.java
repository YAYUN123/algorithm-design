package 算法.回溯;
//装载问题
import java.util.Scanner;

public class Loading {  
    private int n;
    private int[] w;
    private int c;
    private int cw;  
    private int bestw;
    private int r; 
    private int[] x;
    private int[] bestx;
 
    public void backtrace(int i) {  
        
        if (i > n-1) {   
            if (cw > bestw) {  
                for (int j = 0; j < n; j++) {  
                    bestx[j] = x[j];  
                    bestw = cw;  
                }  
                return;  
            }  
        }  
        r -= w[i];  
       
        if (cw + w[i] < c) {    
            x[i] = 1;  
            cw += w[i];  
            backtrace(i + 1);  
            cw -= w[i];  
        }  
         
        if (cw + r > bestw) {  
            x[i] = 0;  
            backtrace(i + 1);  
        }  
        r += w[i];  
    }  
  
    public static void main(String[] args) {  
        Loading X = new Loading();  
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);  
         
        X.n = scanner.nextInt();  
        X.w = new int[X.n];  
        X.x = new int[X.n];  
        X.bestx= new int[X.n];   
        for (int i = 0; i < X.n; i++) {  
            X.w[i] = scanner.nextInt();  
        }  
        X.c = scanner.nextInt();
  
        for (int i = 0; i < X.n; i++)  
            X.r += X.w[i];  
        X.backtrace(0);  
        System.out.print("输出当前最优解:");  
        for (int i = 0; i < X.n; i++) System.out.print(X.bestx[i] + " ");  
        System.out.println();  
        System.out.println("最优解：" + X.bestw);  
    }  
}  
//4
//10 10 40 40
//100
//输出当前最优解:1 0 1 1 
//最优解：90
