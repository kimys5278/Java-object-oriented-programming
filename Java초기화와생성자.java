package Java객체연습2;

class cal1 {
	
	int a,b;
	
	public cal1(int a, int b) {
		//메서드이름과 클래스이름이 같음-> 생성자 -> 어떠한 메서드보다 먼저 실행됨.
		this.a = a;
		this.b = b;
		
	}
	
	
	public void sum() {
		System.out.println(this.a+this.b);
	}
	
	public void avg() {
		
		System.out.println((this.a+this.b)/2);
	}
	
}

public class Java초기화와생성자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		             // 여기는 클래스가 아니라 생성자임.
		cal1 c1 = new cal1(50,10);
		c1.sum();
		c1.avg();
		
		cal1 c2 = new cal1(50,50);
		c2.sum();
		c2.avg();
	
	}

}
