import java.util.Vector;

public class DisplayCarVector extends MyFrame {
	public void run() {
		Vector<Car> cars = new Vector<Car>();
		cars.add(new Car(50, 50, 1, 5));
		cars.add(new Car(50, 110, 2, 5));
		cars.add(new Car(50, 170, 3, 5));
		cars.add(new Car(50, 230, 4, 5));
		cars.add(new Car(50, 290, 5, 5));

		for (int i = 0; i < 30; i++) {
			clear();
			for (int j = 0; j < cars.size(); j++) {
				cars.get(j).draw(this);

				cars.get(j).move();
			}

			sleep(0.05);

		}
	}
}
