package TEST;


import CODE.BienChe;
import CODE.HopDong;
import CODE.NhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HopDong> dshd=new ArrayList<HopDong>();
        ArrayList<BienChe> dsbc = new ArrayList<BienChe>();
        int n;
        System.out.print("\n Nhap vao so nhan vien:");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.printf("\nNhap vao nhan vien thu %d ", i + 1);
            int chon;
            System.out.printf("\n Nhap vao loai nhan vien: 1- Nhan vien hop dong, 2- Nhan vien bien che");
            chon = sc.nextInt();
            sc.nextLine();
            HopDong hd;
            BienChe bc;
            switch (chon) {
                case 1: {
                    hd = new HopDong();
                    hd.NhapThongTin(sc);
                    dshd.add(hd);
                    break;
                }
                case 2: {
                    bc = new BienChe();
                    bc.NhapThongTin(sc);
                    dsbc.add(bc);
                    break;
                }
                default: {
                    hd = new HopDong();
                    hd.NhapThongTin(sc);
                    dshd.add(hd);
                    break;
                }
            }
        }
        // Tìm nhân viên hợp đồng có số giờ lao động nhiều nhất.
        int MAX_HD=0;
        for (HopDong hd:dshd) {
            //System.out.printf("\n Gio lao dong %d ", hd.GetGioLaoDong());
            if (MAX_HD<hd.GetGioLaoDong())
                MAX_HD = hd.GetGioLaoDong();
        }
        System.out.printf("\n Nhan vien hop dong co gio lam viec cao nhat");
        for (HopDong hd:dshd)
            if (MAX_HD==hd.GetGioLaoDong())
                hd.HienThiThongTin();
        //- Tìm nhân viên biên chế có bậc lương thấp nhất.
        int MIN_BC=0;
        for (BienChe bc:dsbc)
            if (MIN_BC>bc.GetBacLuong())
                MIN_BC=bc.GetBacLuong();
       System.out.printf("\n Nhan vien bien che co bac luong thấp nhat");
       for (BienChe bc:dsbc)
            if (MIN_BC==bc.GetBacLuong())
                bc.HienThiThongTin();
    }

}