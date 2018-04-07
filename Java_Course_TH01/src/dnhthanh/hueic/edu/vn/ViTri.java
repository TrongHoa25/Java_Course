package dnhthanh.hueic.edu.vn;

public class ViTri {
    public static void xacdinhvt(String me, String con){
        char[] arrss = new char[con.length()];
        char[] arra = me.toCharArray();
        char[] arrb = con.toCharArray();
        int t = con.length() -1 ;
        for (int i = 0; i < me.length() - con.length(); i++)
        {
            arrss = DaoTu.getchar(arra,i,t);
            if(sosanharr(arrss,arrb))
            {
                System.out.println(i);
            }
            t++;
        }
    }
    public static boolean sosanharr(char[] arra, char[] arrb)
    {
        if (arra.length != arrb.length)
            return false;
        boolean ss = true;
        for (int i = 0; i < arra.length; i++)
        {
            ss = ss && (arra[i] == arrb[i]);
        }
        return ss;
    }
}
