package co.micol.prj;

public class CompareMax {
	private int n;
	private int m;

	public CompareMax(int n, int m) {
		this.n = n;
		this.m = m;
	}

	public int getMax() {
		int max = 0; // 두 수가 같을 때는 0을 리턴한다
		if (n > m) {
			max = n;
		} else if (n < m) {
			max = m;
		}
		return max;
	}
}
