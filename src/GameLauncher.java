import java.util.Scanner;

public class GameLauncher {

	public static void main(String[] args) {
		System.out.println("**********Game Start!**********");
		//�L�Xooxx�A����ooxx����
		ooxx t = new ooxx();
		
		while(t.isgameover) {
			System.out.print("Player-"+t.who()+"  enter your move (row[1-3],column[1-3):");
			Scanner keyin = new Scanner(System.in);
			//�ϥΪ̿�J��
			String input = keyin.nextLine();
			//���I�sgo���
			t.go(input);
			//�I�sprintooxx���
			t.printooxx();
		}
		
		System.out.println("**********Game Over!**********");
	}

}
