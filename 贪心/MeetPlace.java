package 算法.贪心;
import java.util.Scanner;
//会场安排
public class MeetPlace {
	public static int k,times=0,m=0,temp1,temp2;
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("请输入需要安排的活动个数:");
		k=input.nextInt();
		int[] begin = new int[k];
		int[] end = new int[k];

		System.out.println("请输入各个会议的开始和结束时间:");
		for(int i=0;i<k;i++)
	    {
			begin[i] = input.nextInt();
			end[i] = input.nextInt();
	    }
		for (int i = 0; i < k; i++)  
		{
	        for (int j = i+1; j < k; j++)  
	        {
	        	if(end[i]>end[j])
	        	{
	        		temp1 = end[i];end[i] = end[j];end[j] = temp1;
	        		temp1 = begin[i];begin[i] = begin[j];begin[j] = temp1;
	        	}
	        }
	    }
	    while (m!=k) //m记录已经被安排的会议个数
	    {     
	        int temp = 0;  //接收上一个会议的结束时间
	  
	        for (int i = 0; i < k; i++)  
	        {  
	            if (begin[i] >= temp)
	            {   
	                temp = end[i];  
	                begin[i]=-1;  
	                end[i]=-1;  
	                m++;  
	            }        
	        }  
	        times++;  
	    }  
	    System.out.println("需要会场数："+times);
	}
}
//请输入需要安排的活动个数:
//5
//请输入各个会议的开始和结束时间:
//1 23
//12 28
//25 35
//27 80
//36 50
//需要会场数：3