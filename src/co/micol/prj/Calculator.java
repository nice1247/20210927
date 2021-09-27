package co.micol.prj;

public class Calculator { // Class 정의
	private int firstNum; // 외부에서 넣으려면 > 1. 생성자를 통해 2. setter/getter를 통해
	private int secondNum;

	public Calculator() { // 기본생성자 >> 2번의 방법

	}

	public Calculator(int n, int m) { // 생성자 오버라이딩, 1번의 방법
		this.firstNum = n;
		this.setSecondNum(m);

	}
	
	public Calculator(int n) { //생성자
		this.firstNum = n;
	}

	public void setFirstNum(int n) { // setter
		this.firstNum = n;
	}

	public int getFirstNum() { // getter
		return firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public int sum() {
		return firstNum + secondNum;
	}
	
	public int sub() {
		return firstNum - secondNum;
	}
	
	

}
