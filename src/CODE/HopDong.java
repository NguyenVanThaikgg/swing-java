package CODE;

import java.io.PrintStream;
import java.util.Scanner;

public class HopDong extends NhanVien{
    // Thuoc tinh
    private int GioLaoDong;
    // Khoi tao khong tham so
    public HopDong(){

    }
    // Khoi tao co tham so
    public HopDong(String Hoten, String CCCD, String PhongBan, int GioHopDong){
        super(Hoten,CCCD,PhongBan);
        this.GioLaoDong=GioHopDong;
    }
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.printf("\nNhap vao so gio lao dong: ");GioLaoDong=sc.nextInt();sc.nextLine();
    }
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.printf("\t So gio lao dong: %d",GioLaoDong);
    }
    public int GetGioLaoDong(){
        return GioLaoDong;
    }

}
