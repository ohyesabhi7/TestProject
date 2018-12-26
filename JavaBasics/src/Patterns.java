
public class Patterns {
public static void main(String[] args) {
	int n=5,i,j;
	/*for ( i=0;i<n;i++)
	{
		for(j=0;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();

	}*/
	//-----------------------------------------
		/*for (i = 0; i < n; i++) 
		{
			for (j = n; j > i; j--) 
				System.out.print("* ");
		
			System.out.println();
		}*/
//----------------------------------------------
	/*	int k = 2 * n - 2,z=0;

	for ( i = 0; i < n; i++) 
		{
			for ( j = 0; j < k; j++) 
			{
				System.out.print(" ");
			}
			k = k - 1;
			for (int h = 0; h <= i+z; h++)
			{
				System.out.print("*");
			}
			z++;
			System.out.println();
		}
	*/
	
	////////----------------------------------------
	int k=2*n-2;
	for( i=0; i<n; i++)
    {
        for( j=0; j<k; j++)
        {
            System.out.print(" ");
        }
        k = k - 1;
        for(int h=0; h<=i; h++)
        {
            System.out.print("*");
        }
         
        System.out.println();
		
		
    }
	
	/*
*/
	

}}
