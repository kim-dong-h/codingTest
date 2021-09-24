package pattern.singleton.ex;

public class SingletonTest {
	
	// 게으른 초기화 변수 
	private static SingletonTest uniqueInstance;
	
	// DLC 방식 변수 
	// volatile : 불안한, 휘발성의
	// volatile 키워드를 사용하면 멀티쓰레딩을 사용하더라도 unique변수가 singleton 인스턴스로 초기화 되는 과정을 올바르게 진행
	private volatile static SingletonTest uniqueInstance2;
	
	private SingletonTest() {}
	
	/*
	 * 게으른 초기화 방식 
	 * 컴파일시점에 인스턴스를 생성하는게 아니라 인스턴스가 필요한 시점에 요청 하여 동적 바인딩을 통해 인스턴스를 생성하는 방식
	 * 성능이 100배 가량 떨어짐 
	 */
	public static synchronized SingletonTest getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new SingletonTest();
		}
		return uniqueInstance;
	}
	
	/**
	 * DLC : Double Check Locking 
	 * 인스턴스가 생성되지 않은 경우에만 동기화 블록이 실행 
	 * @return
	 */
	public SingletonTest getInstance2() {
		
		if(uniqueInstance2 == null) {
			synchronized (SingletonTest.class) {
				if(uniqueInstance2 == null) {
					uniqueInstance2 = new SingletonTest();
				}
			}
		}
		
		return uniqueInstance2;
	}
	
}
