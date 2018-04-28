package tronghoa.hueic.edu.vn;

public class HinhKhoi {
    protected double chieucao;

    public HinhKhoi() {
    }

    public HinhKhoi(double chieucao) {

        this.chieucao = chieucao;
    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }

    @Override
    public String toString() {
        return "Chiều cao = " + chieucao ;
    }
}
