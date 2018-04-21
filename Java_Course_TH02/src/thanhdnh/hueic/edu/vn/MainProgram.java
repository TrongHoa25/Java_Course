package thanhdnh.hueic.edu.vn;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		HangHoa hh = new HangHoa();
		KhachHang kh = new KhachHang();
		//Tiếp tục với các yêu cầu của đề bài
		Scanner sc = new Scanner(System.in);
		String un, pw;
		System.out.println("Mời nhập username");
		un = sc.nextLine();
		System.out.println("Mời nhập password");
		pw = sc.nextLine();
		if (un.equals(kh.getUsername()) && pw.equals(kh.getPassword())) {
			String ten, nsx;
			double dg;
			int sl;
			System.out.println("Nhập tên hàng");
			ten = sc.nextLine();
			System.out.println("Nhập ngày sản xuất");
			nsx = sc.nextLine();
			System.out.println("Nhập đơn giá");
			dg = sc.nextDouble();
			System.out.println("Nhập số lượng");
			sl = sc.nextInt();
			hh = kh.MuaHang(ten, nsx, dg, sl);
			System.out.println(hh.toString());
		} else {
			System.out.println("xin loi tai khoan quy khach khong ton tai trong he thong. Xin lien he dang ky voi chi nhanh khach hang gan nhat");
		}
	}
}
