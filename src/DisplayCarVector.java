import java.util.Vector;

public class DisplayCarVector extends MyFrame {
	public void run() {
		Vector<Car> cars = new Vector<Car>();
		for (int i = 0; i < 5; i++) {
			cars.add(new Car(50, 70 * i + 50, i + 1, 0));
		}

		while (true) {
			clear();
			for (int j = 0; j < cars.size(); j++) {
				cars.get(j).draw(this);
				cars.get(j).move();
			}

			sleep(0.05);

		}

	}
}
