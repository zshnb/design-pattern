package bridge;

public class Main {

	public static void main(String[] args) {
		Color red = new Red();
		Pen pen = new Pencil(red);
		pen.write();
	}

}
