
public class DisplayRectsSlow extends MyFrame{
	public void run() {
		setColor(0,128,0);
		int x=30;
		while(x<=170) {
			fillRect(x,80+x,10,100);
			x+=20;
			sleep(1);
			
			///書式：sleep(秒数)
			///動作：処理を指定時間止める
			///引数：止めたい時間の秒数
		}
	}

}
