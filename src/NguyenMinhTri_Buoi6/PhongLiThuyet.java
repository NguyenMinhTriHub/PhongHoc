package NguyenMinhTri_Buoi6;
public class PhongLiThuyet extends PhongHoc{
	private boolean coMayChieu;

	public PhongLiThuyet(String maPhong, String dayNha, float dienTich, int soBongDen,boolean coMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.coMayChieu=coMayChieu;
	}
	@Override
	protected int getSoLuongBanGhe() {
		
		return 0;
	}
	public boolean isCoMayChieu() {
		return coMayChieu;
	}
	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu=coMayChieu;
	}
	@Override
	public String toString() {
		String mayChieu=(coMayChieu)?"Co may chieu":"Khong co may chieu";
		return super.toString()+String.format("%20s",mayChieu);
	}
	public boolean datChuan() {
		return (duAnhSang() && coMayChieu);
	}
	public boolean duAnhSang() {
		if(getDienTich()/getSoBongDen()==10) {
			return true;
		}else {
			return false;
		}
	}
	
}