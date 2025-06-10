import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Car extends Vehicle implements KeyListener{

	public Car(int x, int y, int vx, int vy) {
		super(x,y,vx,vy);
	}

	public void draw(MyFrame frame) {
		frame.fillRect(x + 20, y, 48, 20);
		frame.fillRect(x, y + 20, 90, 20);
		frame.fillOval(x + 15, y + 40, 15, 15);
		frame.fillOval(x + 50, y + 40, 15, 15);
	}

	@Override
	//キーから文字が入力されたとき
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
		
	}

	@Override
	//キーが押されたとき
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if((e.getKeyCode()==KeyEvent.VK_LEFT ) || (e.getKeyCode()==KeyEvent.VK_A )){
			vx-=5;
		}
		if((e.getKeyCode()==KeyEvent.VK_RIGHT) ||(e.getKeyCode()==KeyEvent.VK_D )){
			vx+=5;
		}
		if((e.getKeyCode()==KeyEvent.VK_UP)|| (e.getKeyCode()==KeyEvent.VK_W )) {
			vy-=5;
		}
		if((e.getKeyCode()==KeyEvent.VK_DOWN) ||(e.getKeyCode()==KeyEvent.VK_S )){
			vy+=5;
		}
	}

	@Override
	//キーが離されたとき
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if((e.getKeyCode()==KeyEvent.VK_LEFT ) || (e.getKeyCode()==KeyEvent.VK_A )) {
			vx=0;
		}
		if((e.getKeyCode()==KeyEvent.VK_RIGHT) ||(e.getKeyCode()==KeyEvent.VK_D )) {
			vx=0;
		}
		if((e.getKeyCode()==KeyEvent.VK_UP)|| (e.getKeyCode()==KeyEvent.VK_W )) {
			vy=0;
		}
		if((e.getKeyCode()==KeyEvent.VK_DOWN) ||(e.getKeyCode()==KeyEvent.VK_S )) {
			vy=0;
		}
	}

}
