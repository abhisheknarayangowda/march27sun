package sundayy;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "SACHIN";
		String s2 = "DHONI";
		int n = s1.compareTo(s2);
		if(n==0)
		{
			System.out.println("strings are equal");
		}
		else if(n>0)
		{
			System.out.println("string 1 is greater than string 2");
		}
		else
		{
			System.out.println("string 2 is greater than string 1");
		}
	}

}
