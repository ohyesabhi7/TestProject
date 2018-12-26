import java.util.Scanner;

public class Numbers {
public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	//int num=sc.nextInt();
/*	int n=41,i,sum=0;
	
	for(i=2;i<n/2+1;i++)
	{
		if(n%i==0)
			sum=sum+i;
	}
	if(sum==0)
	System.out.println("prime");
	else
		System.out.println("not prime");*/
	
	//---------------------------------------------------------
	
	 int n1=0,n2=1,n3,i,count=10;    
	 System.out.print(n1+" "+n2);//printing 0 and 1    
	 for(i=0;i<count-2;i++)    
	 {    
	  n3=n1+n2;    
	  System.out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 } 
}
}
