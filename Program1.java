package euler;
//find sum of multiples of 3 || 5 below 1000
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int sum=0;
//		for(int i=2;i<1000;i++)
//{
//	if(i%3==0||i%5==0)
//		{sum+=i;
//		System.out.println(i);}
//    This is Brute forcing 
//}System.out.println("Sum of natural nos="+sum);
		int result=Sum(3,999)+Sum(5,999)-Sum(15,999);
		System.out.println(result);
	}
	static int Sum(int n,int p)
	{
		return n*(p/n)*((p/n)+1)/2;
	}

}
