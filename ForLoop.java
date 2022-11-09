
public class ForLoop {
public static void main(String args[])
{
	System.out.println("For Loop in java\nFirst Method");
	
	int nums[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	for(int i=0;i<14;i++)
	{
		System.out.print(nums[i]+" ");
	}
	
	System.out.println("\n\nFor loop in java\nSecond Method");
	for(int x:nums)
	{
		System.out.print(x+" ");
	}
	
	System.out.println("\n\nFor loop in java on characters");
	char characters[]={'a','b','c','d','e'};
	
	for(char x:characters)
	{
		System.out.print(x+" ");
	}
	
	System.out.println("\n\nFor loop in java reverse \nFirst method");
	int n;
	for(n=10;n>0;n--)
	{
		System.out.println("Tick: " +n);
	}	

	System.out.println("\nUsing for loop finding prime numbers in first 100 natural number");
	boolean prime=true;
	for(int i=2;i<100;i++)
	{
		for(int j=2;j<=(i/2)&&prime!=false;j++)
		{
			if(i%j==0)
				prime=false;
		}
		if(prime)
			System.out.print(i+" ");
		prime=true;
	}
	
	
	int a,b;
	b=4;
	for(a=1;a<b;a++)
	{
		System.out.println("\nThe a is "+a+" and the b is "+b);
		b--;
	}
	
	System.out.println("\nUsing Comma");
	//But for the above code is more efficient is like that
	//With the help of comma
	//It will reduce the lines of codes
	for(a=1 , b=4; a<b; a++, b--)
	{
		System.out.println("\nThe a is "+a+" and the b is "+b);
	}
	
	System.out.println("\nSome for loop variations\nLoop when we don't need to define the starting points and ending with loop declaration\n");
	boolean done=false; int i=0;
	 for(;!done;)
	 {
		 System.out.print(i+" ");
		 if(i==10)
			 done=true;
		 i++;
	 }
	 
	 System.out.println("\nFor each Version of the loop\n");
	 int numbers[]= {0,1,2,3,4,5,6,7,8,9,10};
	 int sum=0;
	 for(int x:numbers)
	 {
		 System.out.print(x+" ");
		 //sum=sum+x;
		 sum+=x;
	 }
	 System.out.println("\nThe sum of all the number is : "+sum);
	 
	 
	 System.out.println("\nUse of break in For each Version of the loop\n");
	 sum=0;
	 for(int x:numbers)
	 {
		 System.out.print(x+" ");
		 if(x==5)
			 break;
		 sum+=x;
	 }
	 System.out.println("\nThe sum of all the number is : "+sum);
	 
	 System.out.println("\nFor each loop is essentially for read only\n");
	 for(int x:numbers)
	 {
		 System.out.print(x+ " ");
		 x=x*10;
	 }
	
	 
	 System.out.println("\nIterating over Multidimensional array");
	 sum=0;
	 int number[][]=new int[3][5];
	 for(int k=0;k<3;k++)
	 {
		 for(int j=0;j<5;j++)
		 {
			 number[k][j]=(k+1)*(j+1);
			 sum+=number[k][j];
		 }
	 }
	 System.out.println("\nRead through for each \n ");
	 for(int x[]:number)
	 {
		 for(int y:x)
		 {
			 System.out.println("The value is "+y);
		 }
	 }
	 System.out.println("The sum of all these values is "+sum);
	 
	 
	 System.out.println("Applying enhanced for ");
	 System.out.println("For finding value in an array");
	 int value=5; boolean found =false;
	 for(int x[]:number)
	 {
		 for(int y:x)
		 {
			 if(y==value)
			 {
				 System.out.print("The value "+value + " is found in the array number");
				 found=true;
				 break;
			 }
		 }
	 }
	 if(found==false)
		 System.out.println("Not found ");
	 
	 
	 
	 System.out.println("Nested Loops");
	 for(i=0;i<10;i++)
	 {
		 for(int j=10;j>i;j--)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	 
	 
	 
	   System.out.println("Using break to exit the loop");
	   for(i=0;i<100;i++)
	   {
		   if(i==10)
			   break;
		   System.out.println("i: "+i);
	   }
	   System.out.println("Loop Complete");
	   
	   
	   System.out.println("Using break in while loop");
	   i=0;
	   while(i<100)
	   {
		   System.out.println("i: "+i);
		   i++;
		   if(i==10)
			   break;
	   }
	   
	   
	   System.out.println("Using break in for loop");
	   i=0;
	   for(;i<3;)
	   {
		   System.out.print("\nPass "+i+":   ");
		   for(int j=0;j<100;j++)
		   {
			   System.out.print(j+" ");
			   if(j==10)
				   break;
		   }
		   i++;
	   }
	   System.out.println("\nLoop is Complete");
	   
	   
	   
	   System.out.println("Using break as a Form of Goto");
	  i=0; 
	
	   first:
	   {
		   second:
		   {
			   third:
			   {
				   System.out.println("i: "+i);
					   break third;
			   }
			  System.out.println("j: "+i) ;
				  break first;
		   }
		   
	   }
	   
	   System.out.println("Using break as a Form of Goto");
	   System.out.println("Using break in for loop");
	   i=0;
	  outer: for(;i<3;)
	   {
		   System.out.print("\nPass "+i+":   ");
		   for(int j=0;j<100;j++)
		   {
			   System.out.print(j+" ");
			   if(j==10)
				   break outer;
		   }
		   i++;
	   }
	   System.out.println("\nLoop is Complete");
	 
	
	   System.out.println("\nUsing continue in for loop");
	   for( i=0;i<10;i++)
	   {
		   System.out.print(i+" ");
		   if(i%2==0)
			   continue;
		System.out.println("");
	   }
	   
	   
	   System.out.println("\nUsing continue in for for loop");
	   i=0;
	   for(;i<10;)
	   {
		   for(int j=0;j<=i;j++)
		   {
			   System.out.print((i+1)*(j+1)+" ");
		   }
		   System.out.println();
		   i++;
	   }   
	   
	   
	   System.out.println("\nReturn\n");
	   System.out.println(" execute");
	   boolean t=true;
	   if(t)
		   return;
	   System.out.println("This is not gonna execute");
	   
}
	}
	


