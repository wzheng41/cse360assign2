
package cse360assign2;

//class for basic calculation
public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	//return the final result
	public int getTotal () {
		return total;
	}
	//perform add operation
	public void add (int value) {
		total += value;
	}
	//perform sub operation
	public void subtract (int value) {
		total -= value;
	}
	//perform multiply operation
	public void multiply (int value) {
		total *= value;
	}
	//perform divide operation
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
			total /= value;
	}
	//get the history of all the operation
	public String getHistory () {
		return "";
	}
}
