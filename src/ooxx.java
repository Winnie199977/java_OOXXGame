
public class ooxx {
	//0:�ť�
	//1: O
	//2: X
	int[][] ooxx = new int[3][3];
	
	
	//�L�Xooxx�}�C = {{1,1,1},{1,1,1},{1,1,1}};
		//void���|�^�ǪF��
		public void printooxx() {
			for(int[] a:ooxx) {  //int[]�N��]�Ĥ@�Ӥ@���}�C�Aooxx�}�C�a�J
				System.out.print("|");
				for(int b:a) {   //b�N��A�i�Jint[]�̭����Ĥ@�ӼƦrint�Aa�O�~�������A
					System.out.print(b==2?"X":b==1?"O":""+" ");	//²�u����if,else�g�k(if b��2�N�Lx,else if�Lo,else�L�ť�)
					System.out.print("|");
				}
				System.out.println("\n-------");	//����
			}	
		}

}
