
public class Car {
	int x, y, vx, vy;

	public Car(int x, int y, int vx, int vy) {
		this.x = x;
		this.y = y;

		this.vx = vx;
		this.vy = vy;
	}
	
	public void draw(MyFrame frame) {
		frame.fillRect(x+20, y, 48, 20);
		frame.fillRect(x, y+20, 90, 20);
		frame.fillOval(x+15, y+40, 15, 15);
		frame.fillOval(x+50, y+40, 15, 15);
	}
	
	public void move() {
		x += vx;
		y += vy;
	}
}
