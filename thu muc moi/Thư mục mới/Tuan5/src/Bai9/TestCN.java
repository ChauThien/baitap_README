package Bai9;

import java.util.Scanner;

public class TestCN {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// Nhập số lượng công nhân
			System.out.print("Nhập số lượng công nhân: ");
			int n = sc.nextInt();
			// Tạo đối tượng DanhSachCongNhan và khởi tạo n phần tử
			DanhSachCN ds = new DanhSachCN(n);
			// Nhập thông tin các công nhân
			for (int i = 0; i < n; i++) {
				System.out.println("Nhập thông tin công nhân thứ " + (i + 1) + ":");
				System.out.print("Họ: ");
				String ho = sc.next();
				System.out.print("Tên: ");
				String ten = sc.next();
				System.out.print("Số sản phẩm: ");
				int soSP = sc.nextInt();
				// Tạo đối tượng CongNhan và thêm vào danh sách
				CongNhan cn = new CongNhan(ho, ten, ten, soSP);
				ds.themCN(cn);
			}
			// Xuất toàn bộ thông tin công nhân viên
			System.out.println("Thông tin toàn bộ công nhân viên:");
			ds.xuatThongTin();
			// Tính số lượng công nhân viên trong danh sách
			int soLuongCN = ds.soLuongCN();
			System.out.println("Số lượng công nhân viên trong danh sách: " + soLuongCN);
			// Xuất thông tin các công nhân làm trên 200 sản phẩm
			System.out.println("Thông tin các công nhân làm trên 200 sản phẩm:");
			ds.cnLamTren200SP();
			// Sắp xếp công nhân theo số sản phẩm giảm dần
			System.out.println("Danh sách công nhân được sắp xếp theo số sản phẩm giảm dần:");
			ds.cnTheoSoSPGiamDan();
			ds.xuatDanhSach();
		}
	}
}