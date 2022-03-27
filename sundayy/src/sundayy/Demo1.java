package sundayy;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "SACHIN";
		String s2 = "SACHIN";
		int n = s1.compareTo(s2);
		if(n==0)
		{
			System.out.println("strings are equal");
		}
		else if(n>0)
		{
			System.out.println("s1 > s2");
		}
		else
		{
			System.out.println("s2 > s1");
		}
	}

}
