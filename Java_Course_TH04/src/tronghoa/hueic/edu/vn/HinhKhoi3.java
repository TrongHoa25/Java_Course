package tronghoa.hueic.edu.vn;

public class HinhKhoi3 extends HinhKhoi{
    protected double bankinh;

    public HinhKhoi3() {
    }

    public HinhKhoi3(double chieucao, double bankinh) {
        super(chieucao);
        this.bankinh = bankinh;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    @Override
    public String toString() {
        return super.toString() + " , Bán kính = " + bankinh;
    }
    public double tinhthetich(){
        double thetich;
        thetich = chieucao * Math.PI * bankinh * bankinh;
        return thetich;
    }
}
