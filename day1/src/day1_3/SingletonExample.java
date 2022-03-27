package day1_3;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton obj1= new Singleton();
		Singleton obj2 = new Singleton();
		
		Singleton obj1= Singleton.getInstance();
		Singleton obj2= Singleton.getInstance();
	}
}
