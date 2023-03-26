package Bai9;

public class CongNhan {
	private String maCN;
	private String mHo;
	private String mTen;
	private int mSoSP;

	public CongNhan() {
	}

	public CongNhan(String ma, String ho, String ten, int soSP) {
		this.maCN = ma;
		this.mHo = ho;
		this.mTen = ten;
		this.mSoSP = soSP;
	}

	// dong goi ma
	public String getMaCN() {
		return maCN;
	}

	public void setMaCN(String maCN) {
		this.maCN = maCN;
	}

	// dong goi ho
	public String getMHo() {
		return mHo;
	}

	public void setMHo(String ho) {
		this.mHo = ho;
	}

	// dong goi ten
	public String getMTen() {
		return mTen;
	}

	public void setMTen(String ten) {
		this.mTen = ten;
	}

	// dong goi so sp
	public int getMSoSP() {
		return mSoSP;
	}

	public void setMSoSP(int soSP) {
		this.mSoSP = soSP;
	}

	// tinh luong
	public double tinhLuong() {
		double dongia;
		if (mSoSP < 200)
			dongia = 0.5;
		else if (mSoSP < 400)
			dongia = 0.55;
		else if (mSoSP < 600)
			dongia = 0.6;
		else
			dongia = 0.65;
		return mSoSP * dongia;
	}

	@Override
	public String toString() {
		return "Ma CN: " + maCN + ", Ho: " + mHo + ", Ten: " + mTen + ", So SP: " + mSoSP + ", Luong: " + tinhLuong();
	}
}