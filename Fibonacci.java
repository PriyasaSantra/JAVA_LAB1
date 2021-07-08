//FIBONACCI SERIES UPTO 50 
public class Fibonacci{
    
    public static void main(String[] args){
       long first=0, second=1, third, i;
        System.out.println("The number of terms upto which series is to be calculated is : 50");
        System.out.print("( 1 th - " + first + " ) \t\t");
        System.out.print("( 2 th - " + second + " ) \t\t");
        for(i=3;i<=50;++i) 
        {    
            third = first + second;
            if(i % 3 == 1) System.out.print("\n");
            System.out.print("( " + i + " th - " + third + " ) \t");
            if(i<=12) System.out.print("\t");
            first = second;    
            second = third;    }
}
}
