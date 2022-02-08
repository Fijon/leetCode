package cn.xuhuiqiang.algo.flashBack;
/**
 * 阶乘
 * @ClassName: Factorial 
 * @Description: TODO
 * @author huiqiangxu@126.com
 * @date 2020年8月2日 上午11:29:57 
 *
 */
public class Factorial {
	
	private static int factorial(int n) {
		if(n == 1) {
			return 1;
		}
		int value = n * factorial(n - 1);
		return value;
	}

	public static void main(String[] args) {
		System.out.println(factorial(1));
		System.out.println(factorial(2));
		System.out.println(factorial(3));
		System.out.println(factorial(4));
		System.out.println(factorial(5));
		System.out.println(factorial(6));
		System.out.println(factorial(7));
		System.out.println(factorial(8));
		System.out.println(factorial(9));
		System.out.println(factorial(10));
	}
}
