package co.micol.prj;

public class Calculator { // Class ����
	private int firstNum; // �ܺο��� �������� > 1. �����ڸ� ���� 2. setter/getter�� ����
	private int secondNum;

	public Calculator() { // �⺻������ >> 2���� ���

	}

	public Calculator(int n, int m) { // ������ �������̵�, 1���� ���
		this.firstNum = n;
		this.setSecondNum(m);

	}
	
	public Calculator(int n) { //������
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
