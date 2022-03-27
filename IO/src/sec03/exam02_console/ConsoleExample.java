package sec03.exam02_console;

import java.io.Console;

public class ConsoleExample {
	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.print("아이디: ");
		String id = console.readLine();
		
		System.out.print("비밀번호: ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass);
		
		System.out.println("---------------------");
		System.out.println(id);
		System.out.println(strPassword);
	}
}
