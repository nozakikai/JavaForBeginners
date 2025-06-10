
public class Truck extends Vehicle{
	
	public Truck(int x, int y, int vx, int vy) {
		super(x,y,vx,vy);
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x, y, 90, 20);
		frame.fillRect(x+70, y-20, 20, 20);
		frame.fillOval(x + 5, y + 20, 10, 10);
		frame.fillOval(x + 15, y + 20, 10, 10);
		frame.fillOval(x + 75, y + 20, 10, 10);
		
	}
}
