package dnhthanh.hueic.edu.vn;

public class DaoTu {
	public static String thuchien(String s) {
		String ns = new String();
//		Viết nội dung xử lý xâu s cho ra xâu ns, trong đó ns là xâu đảo từ.
		char[] arrs = s.toCharArray();
//		char[] arrb = new char[arrs.length];
		int t = arrs.length - 1;
		for (int i = arrs.length - 1; i >= 0 ; i--)
		{
			if (arrs[i] == ' ' || i == 0 )
			{
				ns += new String(getchar(arrs,i,t));
				t = i;
			}
		}
//		char[] arr = "trong hoa".toCharArray();
//		System.out.println(getchar(arr,2,4));
		return ns;
	}

	public static char[] getchar(char[] arrs, int i, int t) {
		char[] temp = new char[t - i + 1];
		for (int i1 = i; i1 <= t; i1++)
		{
			temp[i1 - i] = arrs[i1];
		}
		return temp;
	}

}
