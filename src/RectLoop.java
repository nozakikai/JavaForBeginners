
public class RectLoop extends MyFrame{
	public void run() {
		setColor(0,128,0);
		int x = 10;
		
		for(int i=0 ; i<15 ; i++) {
			///4-1
			///fillRect(x,80+x,10,100);
			///x+=15;
			
			///4-2
			///fillRect(x,80,10,100-(100-x));
			///x+=15;
			
			///4-3
			setColor(0+x,0+x,0+x);
			fillRect(x,80,10,100);
			x+=15;
		}
	}
	
}
