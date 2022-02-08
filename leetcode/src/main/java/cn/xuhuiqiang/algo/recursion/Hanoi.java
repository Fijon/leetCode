package cn.xuhuiqiang.algo.recursion;

/**
 * 汉诺塔方法，从a 柱移到 c柱
 * @ClassName: Hanoi 
 * @Description: TODO
 * @author huiqiangxu@126.com
 * @date 2021年7月17日 下午5:45:59 
 *
 */
public class Hanoi {

	
	
	public void hanoi(int n, String a, String b, String c) {
		if(n > 0) {
			hanoi(n-1, a,c,b);
			System.out.println(String.format("%d moving from %s to %s",n, a,c));
			hanoi(n-1, b,a,c);
		}
		System.out.println(n + " end");
	}
	
	public static void main(String[] args) {
		new Hanoi().hanoi(3, "a", "b", "c");
	}
}
