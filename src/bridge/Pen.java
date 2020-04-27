package bridge;

abstract public class Pen {
	private Color color;

	public Pen(Color color) {
		this.color = color;
	}

	abstract void write();
}
