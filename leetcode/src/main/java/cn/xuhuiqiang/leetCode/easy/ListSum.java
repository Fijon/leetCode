package cn.xuhuiqiang.leetCode.easy;

public class ListSum {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode begin = new ListNode();
		ListNode tmp = begin;
		ListNode pre = null;
		while (l1 != null && l2 != null) {
			if (tmp == null) {
				tmp = new ListNode();
				pre.next = tmp;
			}
			int sum = l1.val + l2.val + tmp.val;
			if (sum >= 10) {
				tmp.val = sum - 10;
				tmp.next = new ListNode();
				tmp.next.val = 1;
			} else {
				tmp.val = sum;
			}
			l1 = l1.next;
			l2 = l2.next;
			pre = tmp;
			tmp = tmp.next;
		}
		repare(l1, pre);
		repare(l2, pre);
		return begin;
	}
	
	public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
		ListNode begin = new ListNode();
		ListNode tair = begin;
		while(l1 != null && l2 != null) {
			tair = repare(l1, l2, tair);
			l1 = l1.next;
			l2 = l2.next;
		}
		tair = repare(l1, l2, tair);
		begin= begin.next;
		return begin;
	}
	
    private static ListNode repare(ListNode n1, ListNode n2, ListNode result) {
    	if(null == n1) {
    		result.next = n2;
    	}
    	if(null == n2) {
    		result.next = n1;
    	}
    	int sum = n1.val + n2.val;
    	ListNode tmp = result.next;
    	if(tmp != null) {
    		sum += tmp.val;
    	}
    	if(sum >= 10) {
    		tmp.val = sum - 10;
    		tmp.next = new ListNode();
    		tmp.next.val = 1;
    	}else {
    		tmp.val = sum;
    	}
    	return tmp;
    }

	private static void repare(ListNode rest, ListNode pre) {
		if (pre.next == null) {
			pre.next = rest;
			return;
		}
		while (rest != null) {
			if (pre.next == null) {
				pre.next = rest;
				return;
			}
			int sum = pre.next.val + rest.val;
			if (sum >= 10) {
				pre.next.val = sum - 10;
				pre.next.next = new ListNode();
				pre.next.next.val = 1;
			} else {
				pre.next.val = sum;
			}
			rest = rest.next;
			pre = pre.next;
		}
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

		ListNode(int[] i) {

			val = i[0];
			ListNode tmp = new ListNode();
			next = tmp;
			for (int index = 1; index < i.length; index++) {
				tmp.val = i[index];
				if (index < i.length - 1) {
					tmp.next = new ListNode();
					tmp = tmp.next;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] i = {9};
		int[] b = { 1,9,9,9,9,9,8,9,9,9};
		ListNode l1 = new ListNode(i);
		ListNode l2 = new ListNode(b);

		addTwoNumbers(l1, l2);

	}

}
