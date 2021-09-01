package pattern.strategy.ex;

public class Moving {

	private Movable movable;
	
	public void move() {
		movable.move();
	}
	
	public void setMovableStrategy(Movable movable) {
		this.movable = movable;
	}
	
}
