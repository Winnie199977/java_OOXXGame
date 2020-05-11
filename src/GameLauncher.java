import java.util.Scanner;

public class GameLauncher {

	public static void main(String[] args) {
		System.out.println("**********Game Start!**********");
		//印出ooxx，先有ooxx物件
		ooxx t = new ooxx();
		
		while(t.isgameover) {
			System.out.print("Player-"+t.who()+"  enter your move (row[1-3],column[1-3):");
			Scanner keyin = new Scanner(System.in);
			//使用者輸入後
			String input = keyin.nextLine();
			//先呼叫go函數
			t.go(input);
			//呼叫printooxx函數
			t.printooxx();
		}
		
		System.out.println("**********Game Over!**********");
	}

}
