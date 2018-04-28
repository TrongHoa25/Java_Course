package tronghoa.hueic.edu.vn;

public class Main {
    public static void main(String[] args) {
        HinhKhoi3 hk3 = new HinhKhoi3(10,2.5);
        System.out.println(hk3.toString() + "\n Thể tích = " + hk3.tinhthetich() );
        HinhKhoi2 hk2 = new HinhKhoi2(10,5,12);
        System.out.println(hk2.toString() + "\n Thể tích = " + hk2.tinhthetich() );
        HinhKhoi1 hk1 = new HinhKhoi1(10,50);
        System.out.println(hk1.toString() + "\n Thể tích = " + hk1.tinhthetich() );
    }
}
