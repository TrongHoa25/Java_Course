package dnhthanh.hueic.edu.vn;

public class GPT {

	public static void thuchien(float a, float b, float c) {
		//Viết nội dung giải phương trình bậc 2 vào đây
		float delta;
		delta = b * b - 4 * a * c;
		float x1, x2, x3, x;
		if(a == 0)
		{
			if (b == 0)
			{
				if (c == 0)
				{
					System.out.println("phương trình vô số nghiệm");
				}
				else {
					System.out.println("phương trình vô nghiệm");
				}
			}
			else
			{
				x = (-c)/b;
				System.out.println("phương trình có nghiệm là " + x);
			}
		}else
		{
			if (delta > 0)
			{
				x1 = (-b + (float) Math.sqrt(delta))/ (2*a);
				x2 = (-b - (float) Math.sqrt(delta))/ (2*a);
				System.out.println("phương trình có 2 nghiệm" +
						"\nx1 = "+ x1 +"\nx = " + x2);
			}else if (delta == 0)
			{
				x3 = ( -b ) / 2 * a;
				System.out.println("phương trình có nghiệm kép x = " + x3);
			}
			else
				System.out.println("phương trình vô nghiệm");
		}

	}
}
