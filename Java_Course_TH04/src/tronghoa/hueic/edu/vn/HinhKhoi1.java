package tronghoa.hueic.edu.vn;

public class HinhKhoi1 extends HinhKhoi
{
    protected double chieudai;

    public HinhKhoi1() {
    }

    public HinhKhoi1(double chieucao, double chieudai) {
        super(chieucao);
        this.chieudai = chieudai;
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    @Override
    public String toString() {
        return super.toString() + ", Chiều dài = " + chieudai ;
    }
    public double tinhthetich(){
        double thetich;
        thetich = this.chieudai *this.chieudai * this.chieucao;
        return  thetich;
    }
}
