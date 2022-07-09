package leetcode.jianZhiOffer.dataStructure;

import java.util.LinkedList;

/**
 * @Classname Solution06
 * @Description TODO
 * @Date 2022/7/4 22:44
 * @Created by zenghui
 */

/*
* 从尾到头打印链表
输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。

示例 1：

输入：head = [1,3,2]
输出：[2,3,1]
。*/
public class Solution06 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(2);
        a1.next = a2;
        a2.next = a3;
        reversePrint(a1);
    }

    public static int[] reversePrint(ListNode head) {
        LinkedList<Integer> middle = new LinkedList<>();
        while (head != null) {
            middle.addLast(head.val);
            head = head.next;
        }
        int[] res = new int[middle.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = middle.removeLast();
//            System.out.println(res[i]);
        }
        return res;
    }
}
