package cn.xuhuiqiang.algo.greddy;
/**
 * 
 * @ClassName: RemoveKDigits 
 * @Description: 移除k个数字
 * 如果当前的数据比前面的数据小，那么就把前面的数据去掉
 * @author huiqiangxu@126.com
 * @date 2020年6月27日 上午11:49:41 
 *
 */
public class RemoveKDigits {
	
	public static void main(String[] args) {
		int[] test = new int[] {1,4,3,2,2,1,9};
		
		System.out.println(moveK(test, 1));
		System.out.println(moveK(test, 2));
		System.out.println(moveK(test, 3));
		System.out.println(moveK(test, 4));


	}
	
	private static String moveK(int[] value, int k) {
		int[] toRemove = new int[k];
		int index = 0;
		for(int i = 1; i < value.length; i++) {
			if(value[i - 1] >= value[i]) {
				toRemove[index] = value[i-1];
				index++;
			}
			if(index >= k) {
				break;
			}
			
		}
		String result = "";
		for(int i = 0; i< toRemove.length; i++) {
			result = result + toRemove[i];
		}
		return result;
	}
}
