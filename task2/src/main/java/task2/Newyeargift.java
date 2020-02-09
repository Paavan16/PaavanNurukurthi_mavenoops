package task2;
import java.util.*;
public class Newyeargift{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int tw=0;
			int count=0;
			System.out.println("Enter lower range of candy");
			int cl=sc.nextInt();
			System.out.println("Enter higher range of candy");
			int ch=sc.nextInt();
			System.out.println("Enter how many choclates you want to enter");
			int cn=sc.nextInt();
			dairychoc c[]= new dairychoc[cn];
			for (int i=0;i<cn;i++)
			{
				c[i]=new dairychoc();
				System.out.println("Enter the weight of "+(i+1)+"choco");
				int w=sc.nextInt();
				count=c[i].noofcandy(cl,ch,count,w);
				tw=c[i].wtofchoc(tw,w);
			}
			System.out.println("Enter how many sweets,please enter");
			int sw=sc.nextInt();
			Cashchoc s[]= new Cashchoc[sw];
			for (int i=0;i<sw;i++)
			{
				c[i]=new dairychoc();
				System.out.println("Enter the weight of "+(i+1)+"sweet");
				int w=sc.nextInt();
				s[i]=new Cashchoc();
				count=s[i].noofcandy(cl,ch,count,w);
				tw=s[i].wtofchoc(tw,w);
			}
			System.out.println("Total weight of box="+tw);
			System.out.println("candies count is ="+count);
			
			
		}

	}