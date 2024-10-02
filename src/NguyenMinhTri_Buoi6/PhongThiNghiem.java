package NguyenMinhTri_Buoi6;
public class PhongThiNghiem extends PhongHoc{
	private String chuyenNganh;
	private int sucChua;
	private boolean coBonRua;
	public PhongThiNghiem(String maPhong, String dayNha, float dienTich, int soBongDen,String chuyenNganh,int sucChua,boolean coBonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh=chuyenNganh;
		this.sucChua=sucChua;
		this.coBonRua=coBonRua;
	}
	
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public boolean isCoBonRua() {
		return coBonRua;
	}
	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua=coBonRua;
	}
	@Override
	protected int getSoLuongBanGhe() {
		
		return 0;
	}	
	@Override
	public String toString() {
		String bonRua=(coBonRua)?"Co Bon Rua":"Khong co bon rua";
		return super.toString()+String.format("%10s  %5d   &15s",chuyenNganh,sucChua,bonRua);
	}
	public boolean datChuan() {
		return (duAnhSang() && coBonRua);
	}
	public boolean duAnhSang() {
		if(getDienTich()/getSoBongDen()==10) {
			return true;
		}else {
			return false;
		}
	}
	
}
