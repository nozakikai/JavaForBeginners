
public class Vehicle {
	int x, y, vx, vy;

	public Vehicle(int x, int y, int vx, int vy) {
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}

	public void draw(MyFrame f) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public void move(MyFrame frame) {
		x += vx;
		y += vy;

		if (x > frame.getWidth()) {
			x -= frame.getWidth()+100;
		}

		if (x > frame.getWidth()) {
			x += frame.getWidth()-100;
		}
	}

}
