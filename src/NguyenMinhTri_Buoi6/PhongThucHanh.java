package NguyenMinhTri_Buoi6;
public class PhongThucHanh extends PhongHoc{
	private int soMayTinh;
	public PhongThucHanh(String maPhong, String dayNha, float dienTich, int soBongDen,int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh=soMayTinh;
	}
	public int getSoMayTinh() {
		return soMayTinh;
	}
	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh=soMayTinh;
	}
	@Override
	protected int getSoLuongBanGhe() {
		
		return 0;
	}
	@Override
	public String toString() {
		return super.toString()+String.format("%20d",soMayTinh);
	}
	public boolean datChuan() {
		return (duAnhSang() && (dienTich/soMayTinh>=1.5f));
	}
	private boolean duAnhSang() {
		if(getDienTich()/getSoBongDen()==10) {
			return true;
		}else {
			return false;
		}
	}
	
}
