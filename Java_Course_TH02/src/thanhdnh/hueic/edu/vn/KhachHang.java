package thanhdnh.hueic.edu.vn;

import java.util.Scanner;

public class KhachHang {
	private String username;
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	//Tiếp tục cho các thuộc tính khác

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public HangHoa MuaHang(String th, String nsx, double dg, int sl ){
		HangHoa hh = new HangHoa();
		hh.setTenHang(th);
		hh.setNgaySanXuat(nsx);
		hh.setDonGia(dg);
		hh.setSoLuong(sl);
		hh.tinhTien();
		return hh;
	}

	public KhachHang() {
		this.username = "tronghoa";
		this.password = "123456";
	}

	public KhachHang(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "KhachHang{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				'}';
	}
	//Tiếp tục cho các phương thức khác
}