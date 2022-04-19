package KiemTraCuoiKi;

import java.text.ParseException;
import java.util.Scanner;

public class QuanLyHangHoaTestDrive {
    public static void main(String[] args) {
        hanghoainfo();
        do {
            System.out.println("-----------------MENU-------------------");
            System.out.println("1)  Thêm Hàng Hoá Vào Danh Sách         |");
            System.out.println("2)  Xem Danh Sách Hàng Hoá              |");
            System.out.println("3)  Tìm Kiếm Hàng Hoá Theo Mã Hàng      |");
            System.out.println("4)  Tìm kiếm Hàng Hoá Theo Loại         |");
            System.out.println("5)  Tìm kiếm Hàng Hoá Theo Ngày Nhập    |");
            System.out.println("6)  Xoá 1 Hàng Hoá Theo Mã              |");
            System.out.println("7)  Sửa Thông Tin Theo Mã               |");
            System.out.println("8)  Sắp Xếp Hàng Hoá Tăng Dần Theo Giá  |");
            System.out.println("9)  Sắp Xếp Hàng Hoá Giảm Dần Theo Giá  |");
            System.out.println("10) Thống Kê Danh Sách                  |");
            System.out.println("11) Kết Thúc Chương Trình               |");
            System.out.println("----------------------------------------");

            System.out.println("Chọn chức năng(nhập số): ");
            int key = bienNhap.nextInt();

            switch (key) {
                case 1:
                    themHangHoa();
                    break;
                case 2:
                    inThongTinHangHoa();
                    break;
                case 3:
                    timMaHang();
                    break;
                case 4:
                    timLoaiHangHoa();
                    break;
                case 5:
                    timNgayNhapKho();
                    break;
                case 6:
                    xoaHangHoa();
                    break;
                case 7:
                    sua();
                    break;
                case 8:
                    sapxepHangHoaTangDan();
                    break;
                case 9:
                    sapxepHangHoaGiamDan();
                    break;
                case 10:
                    qlhh.toTal();
                    break;
                case 11:
                    System.out.println("-----Cảm ơn đã sử dụng chương trình !-----");
                    System.exit(0);
                    break;
            }
            System.out.println("Về Menu(y/n)?: ");
        } while (bienNhaps.nextLine().equals("y"));
    }


    public static QuanLyHangHoa qlhh = new QuanLyHangHoa();

    public static Scanner bienNhap = new Scanner(System.in);
    public static Scanner bienNhaps = new Scanner(System.in);

    static void themHangHoa() throws ParseException {
        while (true) {
            qlhh.addFist();
            System.out.println("Thêm Hàng Hoá(y/n): ");
            bienNhap.nextLine();
            if (bienNhap.nextLine().equals("n")) {
                break;
            }
        }
    }

    static void inThongTinHangHoa() {
        qlhh.print();
        bienNhap.nextLine();
    }

    static void timMaHang() {
        System.out.println("Mã Hàng Cần tìm ?:");
        String mahang = bienNhaps.nextLine();
        System.out.println("Mã hàng đã tìm được:");
        qlhh.find_and_print(mahang);
    }

    static void timLoaiHangHoa() {
        System.out.println("Loại hàng cần tìm ?: ");
        String loai = bienNhaps.nextLine();
        qlhh.find_and_print_kind(loai);
    }

    static void timNgayNhapKho() {
        System.out.println("Ngày nhập hàng hoá cần tìm ?: ");
        String ngaynhapkho = bienNhaps.nextLine();
        qlhh.find_and_print_kind(ngaynhapkho);
    }

    static void xoaHangHoa() {
        System.out.println("Nhập mã hàng cần xoá:");
        String mahang = bienNhaps.nextLine();
        System.out.println("Đã xoá khỏi danh sách !");
        qlhh.delete(mahang);
    }

    static void sua() throws ParseException {
        System.out.println("Nhập mã hàng hoá cần sửa:");
        String mahang = bienNhaps.nextLine();
        qlhh.remake(mahang);
    }

    static void sapxepHangHoaTangDan(){
        qlhh.tangDan_Selection();
    }

    static void sapxepHangHoaGiamDan(){
        qlhh.giamDan_Selection();
    }

    static void hanghoainfo() {
        qlhh.moi("Thuc Pham", "001", "Bánh Mì", 2000, 30, "12/12/2002");
        qlhh.moi("Thuc Pham", "002", "Bánh Bèo", 5000, 20, "12/12/2002");
        qlhh.moi("Thuc Pham", "003", "Bánh Pía", 20000, 40, "12/12/2002");
        qlhh.moi("Thực phẩm", "004", "Bánh Bao", 5000, 60, "12/12/2002");
        qlhh.moi("Thuc Pham", "005", "Bánh Cam", 3000, 10, "12/12/2002");
        qlhh.moi("Thuc Pham", "006", "Bánh Kem", 10000, 29, "12/12/2002");
        qlhh.moi("Thuc Pham", "007", "Bánh Susu", 2500, 40, "12/12/2002");

        qlhh.moi("Sanh Su", "008", "Ly Sứ", 50000, 27, "12/12/2002");
        qlhh.moi("Sanh Su", "009", "Chén Sứ", 50000, 38, "12/12/2002");
        qlhh.moi("Sanh Su", "010", "Tẩu Sứ", 150000, 10, "12/12/2002");
        qlhh.moi("Sanh Su", "011", "Ấm Sứ", 200000, 22, "12/12/2002");
        qlhh.moi("Sanh Su", "012", "Bình Sứ", 400000, 17, "12/12/2002");
        qlhh.moi("Sanh Su", "013", "Tô Sứ", 7000, 127, "12/12/2002");
        qlhh.moi("Sanh Su", "014", "Muỗng Sứ", 3000, 700, "12/12/2002");

        qlhh.moi("Dien May", "015", "Ti Vi", 10000000, 90, "12/12/2002");
        qlhh.moi("Dien May", "016", "Tủ Lạnh", 7000000, 20, "12/12/2002");
        qlhh.moi("Dien May", "017", "Máy Lạnh", 15000000, 12, "12/12/2002");
        qlhh.moi("Dien May", "018", "Máy Giặt", 3000000, 7, "12/12/2002");
        qlhh.moi("Dien May", "019", "Lò vi sóng", 1000000, 32, "12/12/2002");
        qlhh.moi("Dien May", "020", "Bếp điện từ", 3000000, 11, "12/12/2002");
        qlhh.moi("Dien May", "021", "Laptop", 20000000, 3, "12/12/2002");
    }
    }
}
