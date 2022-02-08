package cn.xuhuiqiang.algo.greddy;

/**
 * 贪心算法前提： 
 * @ClassName: GreddyAlgo 
 * @Description: TODO
 * @author huiqiangxu@126.com
 * @date 2020年6月26日 下午5:56:19 
 *
 */
public class GreddyAlgo {
	private static int[] meta = new int[] {200, 100, 50, 20, 10, 5 ,1};
	
	public static void main(String[] args) {
		System.out.println(cal(628));
	}
	private static String cal(int value) {
		int[] answer = new int[meta.length];
		for(int i = 0; i< meta.length ; i++) {
			int count = value / meta[i];
			if(count > 0 ) {
				answer[i] = count;
			}
			value = value % meta[i];
		}
		String result = "";
		for(int i = 0; i < meta.length; i++) {
			if(answer[i] != 0) {
				result = result + answer[i] + "张" + meta[i] + "\n";
			}
		}
		return result;
	}
}
