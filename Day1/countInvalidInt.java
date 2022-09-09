package Day1;

public class countInvalidInt {

	public static void main(String[] a) {
		// TODO Auto-generated method stub
		int n, cnt=0, sum=0;
		for(int i=0;i<a.length;i++)
		{
		try
		{
		n=Integer.parseInt(a[i]);
		sum= sum+n;
		}
		catch (NumberFormatException e)
		{
		cnt++;
		}
		}
		System.out.println("Sum of only valid integers is= "+sum) ;

		System.out.println("Invalid integers are: "+cnt) ;
	}

}
