package thanhdnh.hueic.edu.vn;

public class HangHoa {
	private String tenHang;
	private String ngaySanXuat;
	private double donGia;
	private int soLuong;

	public String getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(String ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
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

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	//Tiếp tục cho các phương thức còn lại
	public double tinhTien(){
		double tien;
		tien = this.donGia * this.soLuong;
		return tien;
	}
}
