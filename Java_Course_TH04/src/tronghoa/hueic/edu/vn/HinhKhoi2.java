package tronghoa.hueic.edu.vn;

public class HinhKhoi2 extends HinhKhoi1{
    protected double chieurong;

    public HinhKhoi2() {
    }

    public HinhKhoi2(double chieucao, double chieudai, double chieurong) {
        super(chieucao, chieudai);
        this.chieurong = chieurong;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }

    @Override
    public String toString() {
        return super.toString() + ", Chiều rộng = " + chieurong;
    }

    @Override
    public double tinhthetich() {
        double thetich;
        thetich = this.chieudai * this.chieurong * this.chieucao;
        return thetich;
    }
}
