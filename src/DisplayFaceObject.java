
public class DisplayFaceObject extends MyFrame {
	public void run() {
		Face[] faces = new Face[4];
		faces[0] = new Face(30, 30, 10, 5);
		faces[1] = new Face(200, 200, -10, -5);
		faces[2] = new Face(0, 100, 5, 0);
		faces[3] = new Face(200, 100, -5, 0);

		for (int i = 0; i < 30; i++) {
			clear();
			for (int j = 0; j < faces.length; j++) {
				faces[j].draw(this);
				faces[j].move();
			}
			sleep(0.1);

		}
	}

}
