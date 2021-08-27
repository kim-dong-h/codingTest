package pattern.observer;

import java.util.ArrayList;

public class SkillMachine implements Publisher {

	private ArrayList<Observer> observerList;
	private SkillVO skillVO;
	
	public SkillMachine() {
		observerList = new ArrayList<Observer>();
	}
	
	@Override
	public void add(Observer observer) {
		observerList.add(observer);

	}

	@Override
	public void delete(Observer observer) {
		int index = observerList.indexOf(observer);
		observerList.remove(index);

	}

	@Override
	public void notifyObserver() {
		for(Observer observer : observerList) {
			observer.update(skillVO);
		}

	}
	
	public void setSkillInfo(SkillVO vo) {
		this.skillVO = vo;
		notifyObserver();
	}
	
	

}
