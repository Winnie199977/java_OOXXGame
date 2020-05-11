
public class ooxx {
	//0:空白
	//1: O
	//2: X
	int[][] ooxx = new int[3][3];
	
	//判斷遊戲是否結束
		boolean isgameover = true;
	
	//紀錄輪到誰
		int turn = 2;
		public String who() {
			return turn==2?"X":"O";
		}
	
	
	//印出ooxx陣列 = {{1,1,1},{1,1,1},{1,1,1}};
		//void不會回傳東西
		public void printooxx() {
			for(int[] a:ooxx) {  //int[]代表跑第一個一維陣列，ooxx陣列帶入
				System.out.print("|");
				for(int b:a) {   //b代表再進入int[]裡面的第一個數字int，a是外面的型態
					System.out.print(b==2?"X":b==1?"O":""+" ");	//簡短版的if,else寫法(if b為2就印x,else if印o,else印空白)
					System.out.print("|");
				}
				System.out.println("\n-------");	//換行
			}	
		}
		
		
		//開始遊戲
		public void go(String input) {
			//假設使用者輸入1,2
			//split:將使用者所輸入的用逗號分開的語法
			//存在tmp_array的陣列裡
			String[] tmp_array = input.split(",");
			//因為tmp_array為字串，須將它轉為int，存使用者輸入的數值
			//陣列-1是因為使用者是輸入1~3，但陣列的排法是0~2
			//2代表X(最上面註解有提到)
			//更換玩家
			ooxx[Integer.parseInt(tmp_array[0])-1][Integer.parseInt(tmp_array[1])-1] = turn;
			if(win()) {
				System.out.println("----------"+who()+"  Win!"+"----------");
				isgameover = false;
			}
			
			
			if(turn == 2) 
				turn = 1;	
			else 
				turn = 2;
		}
		
		
		//判斷贏家
		public boolean win() {
			for(int i = 0; i < ooxx.length; i++) {
				if(ooxx[0][i] == ooxx[1][i] && ooxx[1][i] == ooxx[2][i] && ooxx[2][i] == turn) {
					return true;
				}
				if(ooxx[i][0] == ooxx[i][1] && ooxx[i][1] == ooxx[i][2] && ooxx[i][2] == turn) {
					return true;
				}
			}
				if(ooxx[0][0] == ooxx[1][1] && ooxx[1][1] == ooxx[2][2] && ooxx[2][2] == turn) {
					return true;
				}
				if(ooxx[0][2] == ooxx[1][1] && ooxx[1][1] == ooxx[2][0] && ooxx[2][0] == turn) {
					return true;
				}
			return false;
		}

	}


