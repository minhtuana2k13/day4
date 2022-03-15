package day4;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {

		cau1();

		// cau 2
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap n : ");
		int n = scanner.nextInt();
		System.out.println("nhap x : ");
		int s = cau2(n);
		System.out.println("tong s là : " + s);

		// cau 3
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("nhap x : ");
		int x = scanner1.nextInt();
		System.out.println("nhap n3 : ");
		int n3 = scanner1.nextInt();
		int s3 = cau3(x, n3);
		System.out.println("tong s(n) = " + s3);

		// cau 4
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("nhap n4 : ");
		int n4 = scanner2.nextInt();
		if (cau4(n4) == true) {
			System.out.println(n4 + " la so nguyen to");
		} else {
			System.out.println(n4 + " khong phai la so nguyen to");
		}

		// cau 5

		for (int i = 2; i < n4; i++) {
			if (cau4(i) == true) {
				System.out.println(i + " la so nguyen to nho hon " + n4);
			}
		}

		// cau 6
		Scanner scanner6 = new Scanner(System.in);
		System.out.println("nhap n6 : ");
		int n6 = scanner6.nextInt();
		int ULeLN = cau6(n6);
		System.out.println("uoc so le lon nhat cua " + n6 + " la : " + ULeLN);

		// cau 7
		int tongChan = cau7(n6);
		System.out.println("tong uoc chan cua so " + n6 + " là : " + tongChan);

		// cau 8
		Scanner scanner8 = new Scanner(System.in);
		System.out.println("nhap n8 : ");
		int n8 = scanner8.nextInt();
		int tongCSC = cau8(n8);
		System.out.println("tong chu so chan cua so " + n8 + " là :" + tongCSC);
	}

	public static void cau1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap ho ten : ");
		String hoTen = scanner.next();
		System.out.println("nhap lop : ");
		String lop = scanner.next();
		System.out.println("nhap diem toan : ");
		float diemToan = scanner.nextFloat();
		System.out.println("nhap diem van : ");
		float diemVan = scanner.nextFloat();
		float DTB = (diemToan + diemVan) / 2;
		System.out.println("diem trung binh cua " + hoTen + "lop " + lop + "là : " + DTB);
	}

	public static int cau2(int n) {
		int tong = 0;
		for (int i = 1; i <= n; i++) {
			tong = tong + i;
		}
		return tong;
	}

	public static int cau3(int x, int n) {
		int s = 0;
		int tam = 1;

		for (int i = 1; i <= n; i++) {
			tam = tam * x;
			// tam =Math.pow(x,i);(phải khai báo kiêu double)
			s = s + tam;
		}
		return s;
	}

	public static boolean cau4(int a) {
		if (a < 2) {
			return false;
		}
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static int cau6(int a) {
		int tam = a;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && i % 2 != 0) {
				tam = i;
			}
		}
		return tam;
	}

	public static int cau7(int a) {
		int tong = 0;
		for (int i = 2; i <= a; i++) {
			if (a % i == 0 && i % 2 == 0) {
				tong = tong + i;
			}
		}
		return tong;
	}

	public static int cau8(int a) {
		int tong = 0;
		do {
			int tam = a % 10;
			if (tam % 2 == 0) {
				tong = tong + tam;
			}
			a = a / 10;
		} while (a != 0 );
		return tong;

	}
}
