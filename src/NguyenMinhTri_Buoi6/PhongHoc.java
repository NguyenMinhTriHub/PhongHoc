package NguyenMinhTri_Buoi6;
public abstract class PhongHoc {
	protected String maPhong,dayNha;
	protected float dienTich;
	protected int soBongDen;
	public PhongHoc(String maPhong, String dayNha, float dienTich, int soBongDen) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}
	public float getDienTich() {
		return dienTich;
	}
	public void setDienTich(float dienTich) throws Exception {
		if(dienTich>0) {
			this.dienTich = dienTich;
		}else {
			throw new Exception("Loi");
		}
		
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}
	protected abstract boolean datChuan();
	public boolean duAnhSang(float dienTich,int soBongDen) {
		if(getDienTich()/getSoBongDen()==10) {
			return true;
		}else {
			return false;
		}
	}
	protected abstract int getSoLuongBanGhe();
	
}