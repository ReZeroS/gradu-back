package com.rezero.gradu.task;

import com.rezero.gradu.entity.DoubleCheckedLocking;

import java.util.ArrayList;


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

public class InstanceTask implements Runnable {




    @Override
    public void run() {
        System.out.println(DoubleCheckedLocking.getInstace());
    }
}
