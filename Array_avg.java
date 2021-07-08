public class Array_avg

{
	public static void main(String[] args) 
	{
	   float avg=0, sum=0;
	   double arr[]= {1,2.5,-7.5,16,8,-9.7,6.5,2.3,-7.9,11.23 };
	   
	   for(int i=0; i<10;i++)
	    sum+=arr[i];
	   avg = sum/10;
	   System.out.print("The average of the array is: "+ avg);
	   
	}
}
