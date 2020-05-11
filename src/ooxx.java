
public class ooxx {
	//0:空白
	//1: O
	//2: X
	int[][] ooxx = new int[3][3];
	
	
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

}
