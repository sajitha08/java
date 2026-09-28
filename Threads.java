class A extends Thread {
public void run() {
for (int i = 1; i <= 10; i++) {
System.out.println(i + "*" + 1 + "=" + (i * 1));
}
System.out.println("End of Tables Thread of 1");
}
}
class B extends Thread {
public void run() {
for (int i = 1; i <= 10; i++) {
System.out.println(i + "*" + 2 + "=" + (i * 2));
}
System.out.println("End of Tables Thread of 2");
}
}
class C extends Thread {
public void run() {
for (int i = 1; i <= 10; i++) {
System.out.println(i + "*" + 3 + "=" + (i * 3));
}
System.out.println("End of Tables Thread of 3");
}
}
public class Threads {
public static void main(String args[]) {
A ThreadA = new A();
B ThreadB = new B();
C ThreadC = new C();
ThreadA.setPriority(Thread.MIN_PRIORITY);
ThreadB.setPriority(Thread.NORM_PRIORITY);
ThreadC.setPriority(Thread.MAX_PRIORITY);
ThreadA.start();
ThreadB.start();
ThreadC.start();
}
}