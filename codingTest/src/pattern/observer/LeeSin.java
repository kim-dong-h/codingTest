package pattern.observer;

public class LeeSin implements Observer {

	private Publisher publisher;
	private SkillVO skillVO;
	
	public LeeSin(Publisher publisher) {
		this.publisher = publisher;
		this.publisher.add(this);
	}
	
	@Override
	public void update(SkillVO skillVO) {
		this.skillVO = skillVO;
		display();

	}
	
	private void display() {
		System.out.println("skill ="+ skillVO.getSkill());
	}

}
