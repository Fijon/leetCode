package cn.xuhuiqiang.leetCode.easy;

import cn.xuhuiqiang.leetCode.InputParam;
import cn.xuhuiqiang.leetCode.Question;

/**
 * 整数反转
 * 利用栈来处理
 * 使用的数学的方法
 * 设 x 
 * 这 x % 10 = y 第一个数
 * 则tmp  = y * 10 
* @ClassName: SolutionSecond 
* @Description: TODO
* @author huiqiangxu@126.com
* @date 2020年1月5日 上午12:10:02 
*
 */
public class SolutionSecond extends Question {

	@Override
	public void solution(InputParam param) {
		// TODO Auto-generated method stub
		
	}
	
	private int revertInt(int value) {
		int target = 0; 
		while(value != 0){
			int pop = value % 10;
			value = value / 10;
			
			 
		}
		 
		
		return 0;
	}
	
	

	
}
