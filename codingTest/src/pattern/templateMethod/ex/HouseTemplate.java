package pattern.templateMethod.ex;

public abstract class HouseTemplate {

	// 실행 부분 메인에서 이부분을 실행 시킨다.
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is Built.");
	}
	
	public void buildWindows() {
		System.out.println("Building Glass Windows");
	}
	
	public abstract void buildWalls();
	
	public abstract void buildPillars();
	
	public void buildFoundation() {
		System.out.println("Building foundation with cement, iron rods and sand");
	}
	
}
