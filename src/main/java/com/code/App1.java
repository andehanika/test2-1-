package com.code;

import java.util.*;
class Sweets
{
 Scanner sc=new Scanner(System.in);
 static int no_of_chocos;
 static int no_of_candy;
 int q=0;
 public Sweets() {}
 public Sweets(int choco,int candi,int quantity)
 {
  no_of_chocos=choco;
  no_of_candy=candi;
  q=quantity;
 }
 public void cal_weight()
 {
  System.out.println(no_of_chocos+no_of_candy+q);
 }
 
}
class Choclates extends Sweets
{
 String flag;
 Scanner sc=new Scanner(System.in);
 String n[]=new String[no_of_chocos];
 public void input()
 {
  Scanner sc=new Scanner(System.in);
 for(int x=0;x<no_of_chocos;x++)
 {
	System.out.println("enter choclate name");
  n[x]=sc.next();
 }
 }
 public void sort(String s)
 {
  for(int k=0; k<no_of_chocos; k++)
        {
            for(int l=1; l<no_of_chocos; l++)
            {
                if(n[l-1].compareTo(n[l])>0)
                {
                    flag=n[l-1];
                    n[l-1]=n[l];
                    n[l]=flag;
                }
            }
        }
  if(s.equals("a"))
   for(int m=0;m<no_of_chocos;m++)
    System.out.println(n[m]);
  else
   for(int p=(no_of_chocos-1);p>=0;p--)
    System.out.println(n[p]);
 }
}
class Candies extends Sweets
{
 public void count()
 {
  if(no_of_candy<=10 && no_of_candy>0)
   System.out.println("number of candies lies in between 1 and 10 ");
  else if(no_of_candy<=50 && no_of_candy>10)
   System.out.println("number of candies lies in between 50 and 10 ");
  else
   System.out.println("candies are more than 50");
   
 }
}
public class App1
{
	public static void main(String arg[])
		 {
		  
		  Scanner sc=new Scanner(System.in);
		  int nchocos,ncandy,choice,nsweets;
		  System.out.println("enter number of gifts");
		  int n=sc.nextInt();
		  for(int i=0;i<n;i++)
		  {
		   System.out.println("enter entire sweet quantity");
		   nsweets=sc.nextInt();
		   System.out.println("enter number of candies");
		   ncandy=sc.nextInt();
		   System.out.println("enter number of choclates");
		   nchocos=sc.nextInt();
		   Sweets t=new Sweets(nchocos,ncandy,nsweets);
		   Choclates f=new Choclates();
		   f.input();
		   while(true)
		   {
		   System.out.println("1.Total weight\n2.number of chocolates\n3.sort choclates\n4.exit");
		   choice=sc.nextInt();
		   if(choice==1)
		    t.cal_weight();
		   else if(choice==2)
		   {
		    if(ncandy==0)
		     System.out.println("zero candies");
		    else
		    {
		     Candies d=new Candies();
		     d.count();
		    }
		   }
		   else if(choice==3)
		   {
		    System.out.println("enter 'a' for ascending order\n enter 'd' for descending order");
		    String a=sc.next();
		    f.sort(a); 
		   }
		   else
		    break;
		   }
		   System.out.println((i+1)+" gift completed");
		   System.out.println("enter new gift details");
		  }
		   
}
}