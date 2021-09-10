package pattern.adapter.ex;

/**
 * duck 객체가 모자라서 Turkey객체를 대신 사용할때 Turkey를 adapter로 만들어 사용
 * 
 * @author kim
 *
 */
public class TurkeyAdapter implements Duck {

	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();

	}

	@Override
	public void fly() {
		turkey.fly();

	}

}
