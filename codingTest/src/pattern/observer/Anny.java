package pattern.observer;

public class Anny implements Observer {

	private SkillVO skillVO;
	private Publisher publisher;
	
	public Anny(Publisher publisher) {
		this.publisher = publisher;
		this.publisher.add(this);
	}
	
	@Override
	public void update(SkillVO skillVO) {
		this.skillVO = skillVO;
		display();
	}

	private void display() {
		System.out.println("anny skill 사용");
		System.out.println("skill = "+skillVO.getSkill() + " skillName" + skillVO.getSkillName());
	}
	
}
