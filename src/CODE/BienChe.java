package CODE;

import java.util.Scanner;

public class BienChe extends NhanVien{
    // Thuoc tinh
    private int BacLuong;
    // Khoi tao
    // Ham khoi tao khong tham so
    public BienChe(){

    }
    // Ham khoi tao co tham so
    public BienChe(String Hoten, String CCCD, String PhongBan,int BacLuong){
        super(Hoten,CCCD,PhongBan);
        this.BacLuong=BacLuong;
    }
    // Hàm nhap thong tin
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.printf("\nhap vao bac luong: "); BacLuong=sc.nextInt();sc.nextLine();
    }
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.printf("\t Bac luong: %d",BacLuong);
    }
    // Ham lay thong tin bac luong
    public int GetBacLuong(){
        return BacLuong;
    }
}
