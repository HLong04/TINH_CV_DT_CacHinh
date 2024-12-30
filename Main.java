package HINHHOC;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.print("Nhap chieu dai: ");
		float d = cs.nextFloat();
		System.out.print("Nhap chieu rong: ");
		float r = cs.nextFloat();
		System.out.print("Nhap ban kinh: ");
		float bk = cs.nextFloat();
		System.out.print("Nhap do dai canh: ");
		float canh = cs.nextFloat();
		
		System.out.println("- Chu vi va dien tich HCN: ");
		System.out.println("Chu vi: "+ HinhChuNhat.Chuvi(d, r));
		System.out.println("Dien tich: "+HinhChuNhat.dientich(d, r));
		
		System.out.println("- Chu vi va dien tich HT: ");
		System.out.println("Chu vi: "+ HinhTron.Chuvi(bk));
		System.out.println("Dien tich: "+ HinhTron.dientich(bk));
		
		System.out.println("- Chu vi va dien tich HV: ");
		System.out.println("Chu vi: "+ HinhVuong.Chuvi(canh));
		System.out.println("Dien tich: "+ HinhVuong.dientich(canh));
		
		
	}

}
