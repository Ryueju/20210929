package co.eju.prj;

import java.util.Scanner;

public class FriendExe {

	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		System.out.println("===================");
		System.out.println("== 1.입력 하기 ==="); // 1입력 2수정 3조회 4종료
		System.out.println("== 2.수정 하기 ===");
		System.out.println("== 3.조회 하기 ===");
		System.out.println("== 4.종료 하기 ===");
		System.out.println("====================");
		System.out.println("원하는 작업번호를 입력하세요>>>");
		
		
	}
	
	private void firstMenu() {
		System.out.println("===============================");
		System.out.println("== 여기는 입력하는 화면입니다. ===");
		System.out.println("===============================");
			addFriend();
	}
	private void secondMenu() {
		System.out.println("===============================");
		System.out.println("== 여기는 수정하는 화면입니다. ===");
		System.out.println("===============================");
			ModifyFriend();
	}
	private void thirdMenu() {
		System.out.println("===============================");
		System.out.println("== 여기는 조회하는 화면입니다. ===");
		System.out.println("===============================");
			ShowListFriend();

	}
	private void endMenu() {
		System.out.println("===============================");
		System.out.println("===    종료합니다. Good Bye    ===");
		System.out.println("===============================");

	}
	private void doWhileMenu() {
		boolean b = true; //디폴드 값이 true; //*1보통은 false;로 설정해야함
		do {
			mainMenu();
			int key = sc.nextInt(); //입력받은것
			sc.nextLine(); //엔터를 클리어시키고 대기시하고있자 버퍼 클리어의 역할을 함
			
			//4개나 되니까 switch케이스를 써야함
			switch(key) {
			case 1 : 
				firstMenu();
				break;	 //1번을 선택하면 이렇게 보여줘 
			case 2 : 
				secondMenu();
				break;
			case 3 : 
				thirdMenu();
				break;
			case 4 : 
				endMenu();
				b = false; // *3그러면 상대적으로 true;가되어야함
				break;
			}
			
		} while(b);  //*2false로 설정하고 !b를 넣음
	}
	public void run() {
		doWhileMenu();
		sc.close();
	}
	
	public void addFriend() {
		System.out.println("1.친구 2. 학교친구 3. 회사친구 ");
		switch(key) {
		case 1 : 
			
		}
	}
}
