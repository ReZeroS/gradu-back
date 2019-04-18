package com.rezero.gradu.entity;

public class InterfaceImplTest implements InterfaceTest {


    public static void test(){
        InterfaceImplTest test = new InterfaceImplTest();
        test.getInterfaceVariable();
    }


    public static void main(String[] args) {
        test();
    }

    public int getInterfaceVariable(){
        System.out.println(InterfaceTest.a);
        return a;
    }
}
