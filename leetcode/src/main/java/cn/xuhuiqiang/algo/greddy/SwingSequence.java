package cn.xuhuiqiang.algo.greddy;

/**
 * 
 * @ClassName: SwingSequence 
 * @Description: 摇摆子序列问题
 * @author huiqiangxu@126.com
 * @date 2020年6月27日 上午11:23:59 
 *
 */
public class SwingSequence {

	public static void main(String[] args) {

	}

	private int maxSwingLength(int[] value) {
		if (value.length <= 2) {
			return value.length;
		}
		int begin = 0;
		int down = -1;
		int up = 1;
		int maxLength = 1;
		int[] sequence = new int [value.length];
		int state = begin;
		for (int i = 1; i < value.length; i++) {
			switch (state) {
			case 0:
				if (value[i - 1] == value[i]) {
					state = begin;
					maxLength = 1;
				} else if (value[i - 1] < value[i]) {
					state = up;
					maxLength++;
				} else {
					state = down;
					maxLength++;
				}
				break;
			case 1:
				 if(value[i - 1] < value[i]) {
					 state = down;
					 maxLength++;
				 }
				 break;
			case -1:
				if(value[i - 1] > value[i]) {
					state = up;
					maxLength ++;
				} 
			default:
			} 
			sequence[maxLength - 1 ] = value[i - 1]; 
		}
		return 0;
	}
}
