package co.micol.prj.forTest;

public class Plus {
	private int n;
	private int m;

	public Plus() {
		
	}
	
	public Plus(int n, int m) {
		this.n = n;
		this.m = m;
	}

	public int sum(int n, int m) {
		int result = 0;
		for (int i = n; i <= m; i++) {
			result += i; // result += i ���ٴ� result = result +i �� �ӵ��� ������
		}
		return result;
	}

}
