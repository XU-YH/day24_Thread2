package cn.itcast_07;

public class SetThread implements Runnable {
	private int x = 0;
	private Student s;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				s.set("ÉäÊÖ", 18);
			} else {
				s.set("·¨Ê¦", 20);
			}
			x++;
		}

	}

}
