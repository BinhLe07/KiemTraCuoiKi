package TieuLuanCuoiKi;

import java.util.Scanner;

public class HangHoa {
    private String tenHang;
    private String maHang;
    private int soLuongTonKho;
    private double donGia;

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setSoLuongTonKho(int soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }

    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDonGia() {
        return donGia;
    }

    public HangHoa() {

    }

    public HangHoa(String maHang, String tenHang, int soLuongTonKho, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTonKho = soLuongTonKho;
        this.donGia = donGia;
    }

    Scanner scanner = new Scanner(System.in);

    public void nhap() {
        System.out.print("Nhap ten hang: ");
        this.tenHang = scanner.nextLine();
        System.out.print("Nhap ma hang: ");
        this.setMaHang(scanner.nextLine());
        System.out.print("Nhap so luong ton kho: ");
        this.soLuongTonKho = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap don gia: ");
        this.donGia = scanner.nextDouble();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ten hang: " + this.tenHang + "/" + " ID: " + this.maHang + "|" + " So luong ton kho: "
                + this.soLuongTonKho + " Don gia: " + donGia + "|";
    }

    public double tinhVAT(double VAT) {
        VAT = this.donGia * (10 / 100);
        return VAT;
    }

}
