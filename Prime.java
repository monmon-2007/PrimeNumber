public class Prime
{
	public static void main(String[]args)
	{
		Stack prime = new Stack();

		double g=0;
		double a;
		double b;
		double gab;

		for (double i=0; i<=10000000; i++)
		{
			if (prime.isPrime(i))
			{
			prime.push(i);
			g++;
			//System.out.println(i);
			}
			if(g==2)
			{
				a=prime.pop();
				b=prime.pop();

				gab=(a-b);
				//System.out.println("-------------");
				//System.out.println("the gab between the last two prime: "+gab);
				//System.out.println();
				prime.push(a);
				g=1;

				if(gab>=100)
				{
				System.out.println("got it");
				System.out.println("The first number is: "+b);
				System.out.println("The Second number is: "+a);
				System.out.println("The Gab is: "+gab);
				}

			}

		}
		System.out.println("Done");


	}
}