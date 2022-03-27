package day1;

import java.util.Scanner;

public class user {
	public static void main(String arg[]){
		int result=0;
		System.out.println("계산식을 입력하세요.");
		Scanner scan=new Scanner(System.in);
		calculator calc = new calculator();
		int num1=scan.nextInt();
		char oper=scan.next().charAt(0);
		int num2=scan.nextInt();
		if (oper=='+'){
			result=calc.plus(num1, num2);
		}
		else if (oper=='-'){
			result=calc.minus(num1, num2);
		}
		else if (oper=='*'){
				result=calc.multi(num1, num2);
		}
		else if (oper=='/'){
			result=calc.div(num1, num2);
		}
		else {
			System.out.println("다시 입력해 주십시오.");
		}
		System.out.println("결과값: "+ result);
		
	}
}
