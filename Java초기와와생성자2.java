package Java객체연습2;

class calcul{
	int left, right;
	
	//메서드의 이름이 클래스의 이름과 같다. === 생성자
	//생성자역할 -> 이클래스가 생성될 떄 자동으로 클래스와 똑같은 이름은 가진 생성자가 실행되도록 약속!
	//그리고 이 생성자가 어떠한 메서드보다 빨리 실행되는걸로 약속 되있음.
	public calcul(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
		
	}
	
}

public class Java초기와와생성자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calcul c = new calcul(50,10);
		c.sum();
		c.avg();



	}
}
