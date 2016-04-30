package pigGame;
public class Die1 {
	
		private int faceValue;
		private int numFaces;
		
		public Die1 (){
			numFaces = 6;
			faceValue = 1;
		}
		
		public Die1 (int numberofFaces){
			if (numberofFaces < 4){
				numFaces = 4;
			}
			else {
				numFaces = numberofFaces;
				//faceValue = 1;
			}
			roll();
		}
		
		public void roll(){
			faceValue = (int) (Math.random()* numFaces +1);
		}
		
		public int getFaceValue(){
			return faceValue;
		}
		
		public int getNumFaces(){
			return numFaces;
		}
		
		public String toString(){
			return "" + faceValue;
			
		}
	}