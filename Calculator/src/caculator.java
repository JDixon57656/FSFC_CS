
public class caculator {
	private float numOne;
	private float numTwo;    
	
	public caculator (){
	}
	
	public float getNumOne(){
		return this.numOne;
	}
	
	public void setNumOne(float nOne){
		this.numOne=nOne;
	}
	
	public float getNumTwo(){
		return this.numTwo;
	}
	public void setNumTwo(float nTwo){
		this.numTwo=nTwo;
	}
	
	public float add (){
		return numOne + numTwo;
	}
	
	public float minus (){
		return numOne - numTwo;
	}
	
	public float times (){
		return numOne * numTwo;
	}
	
	public float devide (){
		return numOne / numTwo;
	}
}
 