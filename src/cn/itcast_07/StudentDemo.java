package cn.itcast_07;

/**
 * Student类set()和get()方法的多线程实现
 * 一个接一个输出
 * 
 * @author XU
 *
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();

		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);

		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);

		t1.start();
		t2.start();
	}
}
