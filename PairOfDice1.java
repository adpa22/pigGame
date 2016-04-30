package pigGame;

public class PairOfDice1 {
	
	private Die1 a, b;
	
	public PairOfDice1(){
		a = new Die1(6);
		b = new Die1 (6);
	}
	
	public void roll (){
		a.roll();
		b.roll();
	}
	
	public int rollTotal (){
		return a.getFaceValue() + b.getFaceValue();
	}
	
	public Die1 getA(){
		return a;
	}
	
	public Die1 getB(){
		return b;
	}
	

	
	public boolean isHalfSnakeEyes(){
		
		if ((a.getFaceValue() ==1 && b.getFaceValue()!=1)|| (a.getFaceValue() != 1 && b.getFaceValue() ==1)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isSnakeEyes(){
	
		if(a.getFaceValue() ==1 && b.getFaceValue () == 1){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String toString(){
		return "(" + a+" , " + b+ ")";
	}
	
}
