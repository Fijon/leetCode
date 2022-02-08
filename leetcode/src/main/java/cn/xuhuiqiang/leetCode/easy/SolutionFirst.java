package cn.xuhuiqiang.leetCode.easy;

import cn.xuhuiqiang.leetCode.InputParam;
import cn.xuhuiqiang.leetCode.Question;

/**
 * 
 * @ClassName: SolutionFirst
 * @Description: 两数之和
 * @author huiqiangxu@126.com
 * @date 2019年12月22日 下午5:14:50
 *
 */
public class SolutionFirst extends Question{
	
	int[] nums;
	int target;
	
	@Override
	public void solution(InputParam param) {
		// TODO Auto-generated method stub
		
	}

	public int[] twoSum(int[] nums, int target) {
		int lastIndex = nums.length;
		int firstIndex = 0;
		int mediumIndex = nums.length / 2;
		this.nums = nums;
		this.target = target;
		return null;
	}
	
	public int judge(int firstIndex, int lastIndex, int target) {
		int tmp = this.nums[firstIndex] + this.nums[lastIndex];
		if(tmp == target) {
			return 0; 
		}else if(tmp < target) {
			return -1;
		}else {
			return 1;
		}
	}
}

