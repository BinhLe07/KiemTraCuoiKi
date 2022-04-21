package TieuLuanCuoiKi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangSanhSu extends HangHoa {
    private String nhaSX;
    private Date ngayNhapKho;

    public HangSanhSu() {

    }

    public HangSanhSu(String maHang, String tenHang, int soLuongTonKho, double donGia, String nhaSX, Date ngayNhapKho) {
        super(maHang, tenHang, soLuongTonKho, donGia);

        this.nhaSX = nhaSX;
        this.ngayNhapKho = ngayNhapKho;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    @Override
    public void nhap() {
        // TODO Auto-generated method stub
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        super.nhap();
        System.out.print("Nhap nha san xuat: ");
        this.nhaSX = scanner.nextLine();
        System.out.print("Nhap ngay nhap kho: ");
        try {
            this.ngayNhapKho = simpleDateFormat.parse(scanner.nextLine());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public double tinhVAT(double VAT) {
        // TODO Auto-generated method stub
        return super.tinhVAT(VAT);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return super.toString() + "Nha san xuat: " + this.nhaSX + "/" + "Ngay nhap kho: "
                + simpleDateFormat.format(this.ngayNhapKho);
    }
}
