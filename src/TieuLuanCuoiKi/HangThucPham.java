package TieuLuanCuoiKi;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HangThucPham extends HangHoa {
    private Date ngaySX;
    private Date ngayHetHan;
    private String nhaCungCap;

    public HangThucPham() {
    }

    public HangThucPham(String maHang, String tenHang, int soLuongTonKho, double donGia, Date ngaySX, Date ngayHetHan,
            String nhaCungCap) {
        super(maHang, tenHang, soLuongTonKho, donGia);

        this.ngaySX = ngaySX;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    @Override
    public void nhap() {
        // TODO Auto-generated method stub
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        super.nhap();
        System.out.println("Nhap ngay san xuat: ");
        try {
            this.ngaySX = simpleDateFormat.parse(scanner.nextLine());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.print("Nhap ngay het han: ");
        try {
            this.ngayHetHan = simpleDateFormat.parse(scanner.nextLine());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.print("Nhap nha cung cap: ");
        this.nhaCungCap = scanner.nextLine();
    }

    @Override
    public double tinhVAT(double VAT) {
        VAT = this.getDonGia() * (5 / 100);
        return super.tinhVAT(VAT);
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        // TODO Auto-generated method stub
        return super.toString() + " Ngay san xuat: " + simpleDateFormat.format(this.ngaySX) + "/" + " Ngay het han: "
                + simpleDateFormat.format(ngayHetHan) + "/" + "Nha cung cap: " + this.nhaCungCap;
    }
}
