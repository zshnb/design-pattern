package bridge;

public class Pencil extends Pen {
	private  Color color;

	public Pencil(Color color) {
		super(color);
		this.color = color;
	}

	@Override
	void write() {
		System.out.println("write " + color.paint());
	}
}
