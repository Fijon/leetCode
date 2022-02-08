package cn.xuhuiqiang.algo.flashBack;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *  求子集
 * @ClassName: SubSets 
 * @Description: TODO
 * @author huiqiangxu@126.com
 * @date 2020年7月19日 下午11:04:47 
 *
 */
public class SubSets {
	static List<Integer> ARRAY = new LinkedList<Integer>() {{
		add(1);
		add(2);
		add(3);
		add(4);
	}};
	
	/**
	 *  普通解法 
	 * @Title: common 
	 * @Description: TODO   
	 * @return 
	 * List<Integer[]>     
	 * @throws
	 */
	static List<Integer[]> common() {
		List<Integer[]> result = new LinkedList();
		result.add(new Integer[0]);
		for(int i = 0; i< ARRAY.size(); i++) {
			Iterator<Integer[]> it = result.iterator();
			List<Integer[]> tmpList = new LinkedList();
			while(it.hasNext()) {
				Integer[] tmp = it.next();
				Integer[] target =  Arrays.copyOf(tmp, tmp.length + 1);
				target[target.length - 1] = ARRAY.get(i);
				tmpList.add(target);
			}
			result.addAll(tmpList);
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<Integer[]> result = common();
		for(Integer[] tmp: result) {
			System.out.println(Arrays.toString(tmp));
		}
		
	}
	
}
