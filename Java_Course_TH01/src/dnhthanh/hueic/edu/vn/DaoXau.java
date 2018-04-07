package dnhthanh.hueic.edu.vn;

public class DaoXau {
	public static String thuchien(String s) {
		String ns = new String();
		//Viết nội dung xử lý xâu s cho ra xâu ns, trong đó ns là xâu đảo xâu.
		char[] arrs = s.toCharArray();
		{
			for (int i = arrs.length - 1; i >= 0; i--)
			{
				ns += arrs[i];
			}
		}
		return ns;
	}
}
