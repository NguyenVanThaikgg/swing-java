package CODE;

import java.awt.*;
import java.util.Scanner;

public class NhanVien {
    // Thuoc tinh
    private String HoTen;
    private String CCCD;
    private String PhongBan;
    // Khoi tao khong tham so
    public NhanVien(){

    }
    // Khoi tao co tham so
    public NhanVien(String Hoten, String CCCD, String PhongBan){
        this.HoTen=Hoten;
        this.CCCD=CCCD;
        this.PhongBan=PhongBan;
    }
    // Nhap vao thong tin nhan vien
    public void NhapThongTin(Scanner sc){
        System.out.printf("\t Nhap vao ho ten: "); HoTen=sc.nextLine();
        System.out.printf("\t Nhap vao CCCD: "); CCCD=sc.nextLine();
        System.out.printf("\t Nhap vao phong ban: "); PhongBan=sc.nextLine();
    }
    // Hien thi thong tin nhan vien
    public void HienThiThongTin(){
        System.out.printf("\t Ho ten: %s",HoTen);
        System.out.printf("\t CCCD  : %s",CCCD);
        System.out.printf("\t Phong ban: %s",PhongBan);
    }
    public String GetHoten(){
        return HoTen;
    }

}
