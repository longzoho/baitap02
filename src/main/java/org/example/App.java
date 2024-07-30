package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(CLB.getDsCLB());

        SinhVien sv1 = new SinhVien("001", "Nguyen Van A");
        sv1.themKyNang(new KyNang("Noi", 6));
        sv1.themKyNang(new KyNang("Hat", 3));

        System.out.println(CLB.getDsCLB());
    }
}
