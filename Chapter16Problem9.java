public class Chapter16Problem9
{
	public static void main (String[] args)
	{
		int varTest1 = ackermann(0,0);
		int varTest2 = ackermann(0,1);
		int varTest3 = ackermann(1,1);
		int varTest4 = ackermann(1,2);
		int varTest5 = ackermann(1,3);
		int varTest6 = ackermann(2,2);
		int varTest7 = ackermann(3,2);

		System.out.println(varTest1);
		System.out.println(varTest2);
		System.out.println(varTest3);
		System.out.println(varTest4);
		System.out.println(varTest5);
		System.out.println(varTest6);
		System.out.println(varTest7);
	}

	public static int ackermann(int m, int n)
	{
		if(m == 0)
		{
			return n + 1;
		}

		else if(n == 0)
		{
			return ackermann(m - 1, 1);
		}

		else
		{
			return ackermann(m - 1, ackermann(m, n-1));
		}
	}
}