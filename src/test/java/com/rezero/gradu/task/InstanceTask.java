package com.rezero.gradu.task;

import com.rezero.gradu.entity.DoubleCheckedLocking;

public class InstanceTask implements Runnable {




    @Override
    public void run() {
        System.out.println(DoubleCheckedLocking.getInstace());
    }
}
