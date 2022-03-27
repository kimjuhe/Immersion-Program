package day1_2;

import java.util.Scanner;

public class host {
	
	public static void main(String[] args) {
		int num;
		String name;
		int count=0;

		promanage prom = new promanage();
		prom.pro();
			while(true) {
				System.out.println("1. 입고");
				System.out.println("2. 판매");
				System.out.println("3. 환불");
				System.out.println("4. 재고확인");
				Scanner scan=new Scanner(System.in);
				num=scan.nextInt();
				if(num==1) {
					System.out.println("상품이름과 개수를 입력하세요 (ex. product1 3)");
					scan=new Scanner(System.in);
					name=scan.next();
					count=scan.nextInt();
					prom.store(name, count);
				}
				else if(num==2) {
					System.out.println("원하시는 상품의 이름과 개수를 입력하세요 (ex. product1 3)");
					scan=new Scanner(System.in);
					name=scan.next();
					count=scan.nextInt();
					prom.sale(name, count);
				}
				else if(num==3) {
					System.out.println("환불할 상품의 이름과 개수를 입력하세요 (ex. product1 3)");
					scan=new Scanner(System.in);
					name=scan.next();
					count=scan.nextInt();
					prom.refund(name, count);
				}
				else if(num==4) {
					prom.check();
				}
			}
	}
	
}
