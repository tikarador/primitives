package oop;

public class Class0616 {

	public static int step;

    public static void todo() {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        new Class0616().method3();
    }

    public static void method3() {
        method4();
    }

    public static void method4() {
        step++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println("Class0616:   " + element);
        }
        if (step > 1) {
            return;
        }
        //main(null);
    }
}
