package NguyenMinhTri_Buoi6;
import java.util.List;
import java.util.ArrayList;
public class ListPhongHoc {
	private List<PhongHoc> ds;
	public ListPhongHoc(int initialCapacity) {
		ds=new ArrayList<PhongHoc>(initialCapacity);
	}
	public int TongSoPhongHoc() {
		return ds.size();
	}
	public boolean themPhongHoc(PhongHoc ph) {
		if(ds.contains(ph)) {
			return false;
		}else {
			ds.add(ph);
			return true;
		}
	}
	public boolean XoaPhongHoc(String maPhong) {
		for(PhongHoc ph:ds)
			if(ph.getMaPhong().equalsIgnoreCase(maPhong)) {
				ds.remove(ph);
				return true;
			}else {
				return false;
			}
		return false;
	}
	public void InPhongMayTinhTren60() {
		for(PhongHoc ph: ds)
			if(ph instanceof PhongThucHanh && ((PhongThucHanh)ph).getSoMayTinh()>=60) {
				System.out.println(ph);
			}
	}
	public PhongHoc timKiem(String maPhong) {
		for(PhongHoc ph:ds)
			if(ph.getMaPhong().equalsIgnoreCase(maPhong)) {
				return ph;
			}else {
				return null;
			}
		return null;
	}
	public void dsPhongHocDatChuan() {
		for(PhongHoc ph:ds)
			if(ph.datChuan()) {
				System.out.println(ph);
			}		
	}
	public boolean capNhatSoMay(String maPhong,int soMay) {
		for(PhongHoc ph:ds)
		if(maPhong.equalsIgnoreCase(ph.getMaPhong()) && ph instanceof PhongThucHanh) {
			((PhongThucHanh)ph).setSoMayTinh(soMay);
			return true;
		}
		return false;
	}
	public boolean capNhatSoBongDen(String maPhong,int soBongDen) {
		for(PhongHoc ph:ds)
			if(maPhong.equalsIgnoreCase(ph.getMaPhong())) {
				ph.setSoBongDen(soBongDen);
				return true;
			}
		return false;
	}
	public List<PhongHoc> XuatDanhSachPhongHoc() {
		return ds;
		
	}
	public List<PhongHoc> layDanhSachPhongHocDatChuan(){
		List<PhongHoc> danhSachDatChuan=new ArrayList<>();
		for(PhongHoc phongHoc:ds) {
			if(phongHoc.getDienTich()>=50 && phongHoc.getSoLuongBanGhe()>=20) {
				danhSachDatChuan.add(phongHoc);
			}
		}
		return danhSachDatChuan;
	}
	
}