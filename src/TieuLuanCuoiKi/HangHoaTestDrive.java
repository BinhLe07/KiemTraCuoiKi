package TieuLuanCuoiKi;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class HangHoaTestDrive {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        DanhSachHangHoa dSHangHoa = new DanhSachHangHoa();
        Date date = new Date();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String sxtp1 = "1/4/2022";
        String hhtp1 = "1/4/2023";
        String sxtp2 = "1/5/2022";
        String hhtp2 = "1/5/2023";
        String sxtp3 = "1/6/2022";
        String hhtp3 = "1/6/2023";

        String ss1 = "15/03/2022";
        String ss2 = "10/04/2022";
        String ss3 = "25/01/2022";
        HangHoa hangThucPham1 = new HangThucPham("tp1", "Gao", 10000, 50000, format.parse(sxtp1), format.parse(hhtp1),
                "VINH LONG");
        HangHoa hangThucPham2 = new HangThucPham("tp2", "Thit bo", 100, 100000, format.parse(sxtp2),
                format.parse(hhtp2), "TIEN GIANG");
        HangHoa hangThucPham3 = new HangThucPham("tp3", "Xuc xich", 500, 10000, format.parse(sxtp3),
                format.parse(hhtp3), "VUNG TAU");
        HangHoa hangThucPham4 = new HangThucPham("tp4", "Mi goi", 100000, 3000, format.parse(sxtp1),
                format.parse(hhtp1), "HAO HAO");
        HangHoa hangDienMay1 = new HangDienMay("dm1", "Tu lanh", 50, 10000000, 24, 300);
        HangHoa hangDienMay2 = new HangDienMay("dm2", "Tivi", 20, 6000000, 24, 150);
        HangHoa hangDienMay3 = new HangDienMay("dm3", "May lanh", 20, 6000000, 24, 300);
        HangHoa hangSanhSu1 = new HangSanhSu("ss1", "Chen", 100, 20000, "LANG GOM BAT TRANG", format.parse(ss1));
        HangHoa hangSanhSu2 = new HangSanhSu("ss2", "Dia", 100, 20000, "LANG GOM BAT TRANG", format.parse(ss2));
        HangHoa hangSanhSu3 = new HangSanhSu("ss3", "Ly thuy tinh", 200, 15000, "LANG GOM BAT TRANG",
                format.parse(ss3));

        int chon;
        int them;
        String tim;
        do {
            System.out.println("MENU");
            System.out.println("1.In danh sach hang hoa truoc khi them hang hoa ");
            System.out.println("2.Them hang hoa ");
            System.out.println("3.Xoa hang hoa ");
            System.out.println("4.Sua hang hoa ");
            System.out.println("5.Tim kiem hang hoa theo ID ");
            System.out.println("6.In danh sach hang hoa sau khi them hang hoa ");
            System.out.print("Nhap lua chon(1->6): ");
            chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    dSHangHoa.them(hangThucPham1);
                    dSHangHoa.them(hangThucPham2);
                    dSHangHoa.them(hangThucPham3);
                    dSHangHoa.them(hangThucPham4);
                    dSHangHoa.them(hangSanhSu1);
                    dSHangHoa.them(hangSanhSu2);
                    dSHangHoa.them(hangSanhSu3);
                    dSHangHoa.them(hangDienMay1);
                    dSHangHoa.them(hangDienMay2);
                    dSHangHoa.them(hangDienMay3);
                    System.out.println("==========DANH SACH HANG HOA==========");
                    dSHangHoa.inDSHangHoa();
                    break;
                case 2:
                    do {
                        System.out.println("0.Thoat");
                        System.out.println("1.Them hang thuc pham");
                        System.out.println("2.Them hang sanh su");
                        System.out.println("3.Them hang dien may");
                        System.out.print("Nhap lua chon(1>3): ");
                        them = scanner.nextInt();
                        switch (them) {
                            case 1:
                                dSHangHoa.themTuBP(1);
                                break;
                            case 2:
                                dSHangHoa.themTuBP(2);
                                break;
                            case 3:
                                dSHangHoa.themTuBP(3);
                                break;
                        }
                    } while (them != 0);
                    ;
                    break;
                case 3:
                    System.out.print("Nhap ma hang hoa can xoa: ");
                    scanner.nextLine();
                    tim = scanner.nextLine();
                    System.out.println("Hang hoa can xoa");
                    dSHangHoa.xoaHangHoa(dSHangHoa.timHangHoaTheoMa(tim));
                    System.out.println("Danh sach hang hoa sau khi xoa");

                    dSHangHoa.inDSHangHoa();
                    break;
                case 4:
                    dSHangHoa.timHangHoaTheoViTri(hangSanhSu1);
                    dSHangHoa.suaHangHoa(4, hangSanhSu1);
                    break;
                case 5:
                    System.out.print("Nhap ma hang hoa can tim: ");
                    scanner.nextLine();
                    tim = scanner.nextLine();
                    dSHangHoa.timHangHoaTheoMa(tim);
                    break;
                case 6:
                    System.out.println("==========DANH SACH HANG HOA==========");
                    dSHangHoa.inDSHangHoa();
                    break;
            }
        } while (chon != 0);
    }

}
