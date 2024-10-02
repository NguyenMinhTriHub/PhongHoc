package NguyenMinhTri_Buoi6;
import java.util.*;
import javax.swing.JOptionPane;
public class TestPhongHoc {
	public static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		PhongHoc p1=new PhongLiThuyet("V10.01","V",200,10,true);
		PhongHoc p2=new PhongLiThuyet("X12.01","X",160,25,false);
		PhongHoc p3=new PhongThucHanh("B1.12","B",90,20,65);
		PhongHoc p4=new PhongThiNghiem("F1.01","F",100,30,"Hoa hoc",30,true);
		ListPhongHoc ds=new ListPhongHoc(5);
		ds.themPhongHoc(p1);
		ds.themPhongHoc(p2);
		ds.themPhongHoc(p3);
		ds.themPhongHoc(p4);
		int chon;
		do {
			System.out.println("1.Xuat danh sach phong hoc");
			System.out.println("2.Tim kiem phong hoc");
			System.out.println("3.Danh sach cac phong hoc dat chuan");
			System.out.println("4.Tong so phong hoc");
			System.out.println("5.Cap nhat so may tinh cho phong thuc hanh");
			System.out.println("6.Cap nhat so bong den");
			System.out.println("7.Xoa Phong hoc theo ma phong");
			System.out.println("8.In phong hoc co so may tinh tren 60");
			System.out.println("9.Thoat!!!");
			System.out.println("=============MENU LUA CHON============");
			chon=sc.nextInt();
			switch(chon) {
			case 1:
				ds.XuatDanhSachPhongHoc();
				break;
			case 2:
				sc.nextLine();
				System.out.println("Nhap ma phong can tim");
				String maPhong = null;
				PhongHoc ph=ds.timKiem(maPhong);
				if(ph!=null) {
					System.out.println(ph);
				}else {
					System.out.println("Khong tim thay phong theo yeu cau");
				}
			case 3:
				System.out.println("Danh sach phong dat chuan:");
				ds.dsPhongHocDatChuan();
				break;
			case 4:
				System.out.println("Tong so phong hoc la:"+ds.TongSoPhongHoc());
				break;
			case 5:
				sc.nextLine();
				System.out.println("Nhap ma phong can cap nhat:");
				maPhong=sc.nextLine();
				int soMayTinh=sc.nextInt();
				if(ds.capNhatSoMay(maPhong, soMayTinh)) {
					System.out.println("Cap nhat thanh cong");
				}else {
					System.out.println("Khong cap nhat duoc");
				}
				break;
			case 6:
				sc.nextLine();
				System.out.println("Nhap ma phong can cap nhat:");
				maPhong=sc.nextLine();
				int soBongDen=sc.nextInt();
				if(ds.capNhatSoMay(maPhong, soBongDen)) {
					System.out.println("Cap nhat thanh cong");
				}else {
					System.out.println("Khong cap nhat duoc");
				}
				break;
			case 7:
				sc.nextLine();
				System.out.println("Nhap ma phong can xoa:");
				maPhong=sc.nextLine();
				int hoi=JOptionPane.showConfirmDialog(null,"Chac chan xoa khong?","Thong bao",JOptionPane.YES_NO_OPTION);
				if(hoi==JOptionPane.YES_OPTION) {
					if(ds.XoaPhongHoc(maPhong)) {
						System.out.println("Xoa thanh cong!!!");
					}else {
						System.out.println("Khong xoa duoc");
					}
				}
			case 8:
				ds.InPhongMayTinhTren60();
				break;
			}
		}while(chon!=9);
	}
}
