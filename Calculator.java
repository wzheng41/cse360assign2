
package cse360assign2;

//class for basic calculation
public class Calculator {

	private int total;
	private String historyStr;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		historyStr = "0"; // string to save the calculation history
	}
	
	//return the final result
	public int getTotal () {
		return total;
	}
	//perform add operation
	//and modify the history
	public void add (int value) {
		total += value;
		historyStr += " + " + value;
	}
	//perform sub operation
	//and modify the history
	public void subtract (int value) {
		total -= value;
		historyStr += " - " + value;
	}
	//perform multiply operation
	//and modify the history
	public void multiply (int value) {
		total *= value;
		historyStr += " * " + value;
	}
	//perform divide operation
	//and modify the history
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
			total /= value;
		historyStr += " / " + value;
	}
	//get the history of all the operation
	public String getHistory () {
		return historyStr;
	}
	
	public static void main(String args[])  {
		Calculator c = new Calculator();
		c.add(4);
		c.subtract(3);
		c.multiply(4);
		c.divide(2);
		System.out.println(c.getTotal());
		System.out.println(c.getHistory());
	}
}
