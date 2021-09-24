package pattern.singleton.ex;

/**
 * LazyHolder 방식의 singleton
 * OnlyOne 클래스는 초기에는 아무런 상태가 없기에 LazyHolder 클래스를 초기화하지 않지만, 
 * getInstance 메서드가 호출될 때 LazyHolder 가 로딩되며 초기화가 진행된다.
   클래스의 내부의 클래스는 외부의 클래스가 초기화될때 초기화되지 않고, 
   클래스의 static 변수는 클래스를 로딩할 때 초기화되는 것을 이용한 기법이다.
 * @author kim
 *
 */
public class OnlyOne {

	private OnlyOne() {}
	
	public static OnlyOne getInstance() {
		return LazyHolder.IT;
	}
	
	private static class LazyHolder{
		private static final OnlyOne IT = new OnlyOne();
	}
	
	public static void start(int media) {
		
	}
	
}
