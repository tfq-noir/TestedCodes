package com.company;

class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

public class JavaInnerClasses {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
//        System.out.println(myOuter.x);
        OuterClass.InnerClass myInner = myOuter.new InnerClass(); // creating object for InnerClass
        System.out.println(myInner.y + myOuter.x);
    }
}

