package Bai9;

public class DanhSachCN {
    private CongNhan[] dsCN;
    private int soLuongCN;

    public DanhSachCN(int n) {
        dsCN = new CongNhan[n];
        soLuongCN = 0;
    }

    public boolean themCN(CongNhan cn) {
        if (soLuongCN < dsCN.length) {
            dsCN[soLuongCN] = cn;
            soLuongCN++;
            return true;
        }
        return false;
    }

    public void xuatThongTin() {
        for (int i = 0; i < soLuongCN; i++) {
            System.out.println(dsCN[i]);
        }
    }

    public int soLuongCN() {
        return soLuongCN;
    }

    public void cnLamTren200SP() {
        for (int i = 0; i < soLuongCN; i++) {
            if (dsCN[i].getMSoSP() > 200) {
                System.out.println(dsCN[i]);
            }
        }
    }

    public void cnTheoSoSPGiamDan() {
        for (int i = 0; i < soLuongCN - 1; i++) {
            for (int j = i + 1; j < soLuongCN; j++) {
                if (dsCN[i].getMSoSP() < dsCN[j].getMSoSP()) {
                    CongNhan temp = dsCN[i];
                    dsCN[i] = dsCN[j];
                    dsCN[j] = temp;
                }
            }
        }
    }

    public void xuatDanhSach() {
    }
}