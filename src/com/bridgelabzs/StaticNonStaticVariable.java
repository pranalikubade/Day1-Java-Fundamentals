package com.bridgelabzs;

public class StaticNonStaticVariable {
    static int x = 10;
    int y = 20;

    static void staticmethod() {
        System.out.println("StaticMethod");
        System.out.println(x);

    }
    void nonstaticmethod() {
        System.out.println("NonStaticMethod");
        System.out.println(y);
    }
    public static void main(String[] args) {
        staticmethod();
        StaticNonStaticVariable.staticmethod();
        System.out.println(StaticNonStaticVariable.x);
        StaticNonStaticVariable obj1 = new StaticNonStaticVariable();
        obj1.nonstaticmethod();
        System.out.println(obj1.y);
    }
}
