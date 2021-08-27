package pattern.observer;

import java.util.Scanner;

public class StartGame {

	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		String selectChamp = String.valueOf(scanner.next());
//		
		
		// observerList 생성
		SkillMachine machine = new SkillMachine();
		
		// publisher 추가 
		Anny anny = new Anny(machine);
		LeeSin leesin = new LeeSin(machine);
		
		SkillVO vo = new SkillVO();
		vo.setSkill("qSkill");
		vo.setSkillName("fire ball");
		
		machine.setSkillInfo(vo);
	}

}
