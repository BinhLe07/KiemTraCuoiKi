package TieuLuanCuoiKi;

public class HangDienMay extends HangHoa {
    private double thoiGianBaoHanh;
    private double congSuat;

    public HangDienMay() {

    }

    public HangDienMay(String maHang, String tenHang, int soLuongTonKho, double donGia, double thoiGianBaoHanh,
            double congSuat) {
        super(maHang, tenHang, soLuongTonKho, donGia);

        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    public void setThoiGianBH(double thoiGianBH) {
        if (thoiGianBH >= 0) {
            this.thoiGianBaoHanh = thoiGianBaoHanh;
        } else {
            System.out.println("thoi gian bao hanh phai lon hon hoac bang 0 !");
        }
    }

    public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public double getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    @Override
    public void nhap() {
        // TODO Auto-generated method stub
        super.nhap();
        System.out.print("Nhap thoi gian bao hanh: ");
        this.thoiGianBaoHanh = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhap cong suat: ");
        this.congSuat = scanner.nextDouble();
        scanner.nextLine();
    }

    @Override
    public double tinhVAT(double VAT) {
        // TODO Auto-generated method stub
        return super.tinhVAT(VAT);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Thoi gian bao hanh: " + this.thoiGianBaoHanh + "/" + " Cong suat: " + this.congSuat;
    }
}