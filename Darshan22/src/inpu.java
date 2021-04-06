import java.util.Scanner;
public class inpu {

	public static void main(String[] args) {
		
	
//		        System.out.println("How many numbers you want to enter?");
//		        Scanner scanner = new Scanner(System.in);
//		        int n = scanner.nextInt();
//		        /* Declaring array of n elements, the value
//		         * of n is provided by the user
//		         */
//		        double[] arr = new double[n];
//		        double total = 0;
//
//		        for(int i=0; i<arr.length; i++){
//		        	System.out.print("Enter Element No."+(i+1)+": ");
//		        	arr[i] = scanner.nextDouble();
//		        }
//		     //   scanner.close();
//		        for(int i=0; i<arr.length; i++){
//		        	total = total + arr[i];
//		        }
//
//
//		        
//		        double average = total / arr.length;
//		        
//		        System.out.println(average);
		
//		int a=0,b=0,c=1;
//		
//		Scanner input = new Scanner(System.in);
//		
//		int n = input.nextInt();
//		
//		for(int i=1;i<=n;i++)
//		{
//			a=b;
//			b=c;
//			c=a+b;
//			System.out.println(a+"");
//		}
//		
	     
	        
	        int a[][]={{1,1},{2,2}};    
	        int b[][]={{1,1},{2,6}};    
	            
	       
	        int c[][]=new int[2][2];  
	        
	        for(int i=0;i<2;i++)
	        {    
	        for(int j=0;j<2;j++)
	        {    
	        c[i][j]=0;      
	        for(int k=0;k<2;k++)      
	        {      
	        c[i][j]+=a[i][k]*b[k][j];      
	        }
	        System.out.print(c[i][j]+" ");  
	        } 
	        System.out.println();    
	        }    
	
		
		    }
		}
		
		
		
		
		
	