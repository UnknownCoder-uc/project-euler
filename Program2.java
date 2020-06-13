package euler;
//even valued fibonacci

public class Program2 {

	public static void main(String[] args) {
		
//		long a=1,b=2,c=0;

//long sum=2;
//
//while(c<4000000)
//{
//	c=a+b;
//	if(c%2==0)
//		sum=sum+c;
//	a=b;
//	b=c;
//
//}
//System.out.println("Sum of even fibonacci series="+sum);
		int fib3=2;
		int fib6=0;
		int c=2;
		int sum=0;
		while(c<4000000)
		{
		    sum=sum+c;
			c=4*fib3+fib6;
			fib6=fib3;
			fib3=c;
		}
		System.out.println(sum);
	}

}
