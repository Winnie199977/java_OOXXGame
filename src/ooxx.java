
public class ooxx {
	//0:�ť�
	//1: O
	//2: X
	int[][] ooxx = new int[3][3];
	
	//�P�_�C���O�_����
		boolean isgameover = true;
	
	//���������
		int turn = 2;
		public String who() {
			return turn==2?"X":"O";
		}
	
	
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
		
		
		//�}�l�C��
		public void go(String input) {
			//���]�ϥΪ̿�J1,2
			//split:�N�ϥΪ̩ҿ�J���γr�����}���y�k
			//�s�btmp_array���}�C��
			String[] tmp_array = input.split(",");
			//�]��tmp_array���r��A���N���ରint�A�s�ϥΪ̿�J���ƭ�
			//�}�C-1�O�]���ϥΪ̬O��J1~3�A���}�C���ƪk�O0~2
			//2�N��X(�̤W�����Ѧ�����)
			//�󴫪��a
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
		
		
		//�P�_Ĺ�a
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


