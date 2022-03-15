package day4;

import java.util.Scanner;

public class day4 {
	public static void main(String[] args) {

		// VÒNG LẶP for
		// cú pháp
		// for([giá trị khoi tao];[dieu kien lap];[buoc nhay]){
		// noi dung }
		// ví dụ
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("while :::::::::::");

		// VÒNG LẶP WHILE
		// cú pháp
		// while(dieu kien lap){
		// noi dung
		// buoc nhay }
		// ví dụ
		int i = 1;
		while (i < 6) {
			System.out.println(i);
			i++;
		}
		System.out.println("do - while :::::::::::");
		// VÒNG LẶP DO WHILE
		// cú pháp
		// do{
		// nội dung thực thi
		// }
		// while(dieu kien thuc thi);
		// ví dụ
		int a = 1;
		do {
			System.out.println(a);
			a++;
		} while (a <= 5);

		System.out.println("break - for :::::::::::");
		for (int x = 1; x < 6; x++) {
			if (x == 4) {
				break;
			}
			System.out.println(x);
		}
		// break giúp thoát ra khỏi vòng lăp mà nó dang thuc thi

		System.out.println("continue - for :::::::::::");
		for (int j = 1; j < 6; j++) {
			if (j == 4) {
				continue;
			}
			System.out.println(j);
		}
		// continue giúp bỏ qua vòng lặp hiện tại (chỉ bỏ qua nội dung dưới nó ) và tiếp
		// túc vòng lặp

		System.out.println("continue - for- for :::::::::::");
		for (int e = 1; e < 6; e++) {
			for (int f = 1; f < 6; f++) {
				if (f == 3) {
					continue;
				}
				System.out.print(f);
			}
			System.out.println(e);
		}
		// 1.Run As --> bỏ qua breakpoint
		// 2. debug As --> dừng lại tai điểm breakpoint
		// break point -- dc dat tai dong muon kiem tra loi
		// f6--> di den dong ke tiep
		// f8 --> đi đến breakpoint tiep theo
		// f5 --> nhay vao trong phuong thuc
		Scanner scanner = new Scanner(System.in);
		int myInt = scanner.nextInt();// int
		double myFloat = scanner.nextDouble();
		String myString = scanner.next();
		System.out.println(myInt);
		System.out.println(myFloat);
		System.out.println(myString);

		
	}

}
