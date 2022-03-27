package day1_2;

public class promanage {
	Product[] products=new Product[5];
	
	public void pro() {
		for (int i=0; i<5; i++) {
			products[i]=new Product();
			products[i].name="product"+i;
			products[i].price=1000;
		}
	}
	
	public void store(String name, int num){
		for (int i=0; i<5; i++) {
			if(name.equals(products[i].name)) {
				products[i].num+=num;
				break;
			}
		}
	}
	
	public void sale(String name, int num){
		for (int i=0; i<5; i++) {
			if(name.equals(products[i].name)) {
				System.out.println(products[i].price*num+"원 결제하겠습니다.");
				products[i].num-=num;
				break;
			}
		}
		
	}	
	
	public void refund(String name, int num){
		for (int i=0; i<5; i++) {
			if(name.equals(products[i].name)) {
				products[i].num+=num;
				break;
			}
		}
	}
	
	public void check(){
		System.out.print("상품 이름\t  상품 개수\n");
		for (int i=0; i<5; i++) {
			System.out.print(products[i].name+"\t"+products[i].num+"\n");
			}
	}
}
