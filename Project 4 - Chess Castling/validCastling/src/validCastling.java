import java.io.*; 

public class validCastling {
	
	public static boolean validCastle(int myXCoor, int myYCoor, int targXCoor, int targYCoor){
		if (myYCoor != targYCoor)
			return false;
		else{
			if (myXCoor < targXCoor){
				for (int i = myXCoor+1;i<targXCoor;i++){
					/*
					 * if ( !(board.isEmpty(i,myYCoor)) ){ return false; }
					 */
				}
				return true;
			}
			else if (myXCoor > targXCoor){
				for (int i = myXCoor-1;i>targXCoor;i--){
//					if ( !(board.isEmpty(i,myYCoor)) ){
//						return false;
//					}
				}
				return true;
			}
			else{
				return false;
			}
		}
	}

	public static void main(String[] args) {

		int myXCoor = 1 ; 
		int myYCoor = 1;
		int targXCoor = 3;
		int targYCoor = 1;

		System.out.println("Can we castle?: " + validCastle(myXCoor, myYCoor, targXCoor, targYCoor));

	}

}
