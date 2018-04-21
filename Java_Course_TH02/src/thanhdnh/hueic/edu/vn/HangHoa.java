package thanhdnh.hueic.edu.vn;

public class HangHoa {
	private String tenHang;
	private String ngaySanXuat;
	private double donGia;
	private int soLuong;

	public String getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(String nsx) {
		ngaySanXuat = nsx;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double dg) {
		donGia = dg;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int sl) {
		soLuong = sl;
	}
	//Tiếp tục cho các thuộc tính còn lại

	public String getTenHang() {
		return tenHang;
	}

	@Override
	public String toString() {
		return "HangHoa{" +
				"tenHang='" + tenHang + '\'' +
				", ngaySanXuat='" + ngaySanXuat + '\'' +
				", donGia=" + donGia +
				", soLuong=" + soLuong +
				", thanh tien =" + tinhTien()+
				'}';
	}

	public void setTenHang(String th) {
		tenHang = th;
	}
	//Tiếp tục cho các phương thức còn lại
	public double tinhTien(){
		double tien;
		tien = donGia * soLuong;
		return tien;
	}
}
