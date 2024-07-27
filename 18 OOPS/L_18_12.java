// INTERFACES 

package lecture;

public class L_18_12 {

	public static void main(String[] args) {
		Queen q1=new Queen();
		q1.moves();
	}
	
	interface ChessPlayer{
		void moves(); 
		// here only bluprint ki move kaisa hona chahiye define nahi kiya
	}

	static class Queen implements ChessPlayer{
		public void moves() {
			System.out.println("up,down,left,right,diagonal");
		}
	}
	
	class Rook implements ChessPlayer{
		public void moves() {
			System.out.println("up,down,left,right");
		}
	}
	
	class king implements ChessPlayer{
		public void moves() {
			System.out.println("up,down,left,right,diagonal(-by one step)");
		}
	}
	
}
