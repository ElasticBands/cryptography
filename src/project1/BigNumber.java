package project1;

import java.util.*;

/**
 * 
 * @author Tony Toscano, Anand Patel, Adam Jasper
 *
 */
public class BigNumber {
	
	int[] digits;

	/**
	 * Constructor of the BigNumber class
	 * @param number 
	 */
	public BigNumber(String number)
	{
		digits = new ArrayList<String>();
		if(number.matches("[0-9]+") && number.length() > 2){
			for(int i = 0; i < number.length(); i++) {
				char c = number.charAt(i);
				String charToString = Character.toString(c);
				digits.add(charToString);
			}
//			digits = Arrays.asList(number);
		}
		
	}
	
	public void add(BigNumber two)
	{
//		StringBuilder buf = new StringBuilder();
//		int carry = 0;
//		for(int i = digits.size() - 1; i > 0; i--){
//			for(int j = two.digits.size() - 1; j > 0; j--){
//				int digit1 = i < 0 ? 0 : Integer.parseInt((digits.get(i)));
//				int digit2 = j < 0 ? 0 : Integer.parseInt((two.digits.get(j)));
//				int digit = digit1 + digit2 + carry;
//				
//			}
//		}
	}
	
	public BigNumber multiply(BigNumber x){
		BigNumber product = new BigNumber(0);
		//TODO check this. might/probably is off by 1
		//also starts at 1 to ignore sign digit...if we do that
		for(int i,j=1;i<digits.length; i++,j++){
			//keeps counter right for each 10's place
			int count = x[i]*Math.pow(10, j);
			while(count!=0){
				product = product.add(digits);
				count--;
			}
		}
		return product;
	}
	
	public BigNumber divide(BigNumber x){
		BigNumber quotient = new BigNumber(0);
		BigNumber temp = digits;
		//TODO make sure compare to works this way
		while (temp.compareTo(x)>=0){
			temp=temp.subtract(x);
			quotient=quotient.add(1);
		}
		//rest is remainder.
		return quotient;
	}
	
	public BigNumber mod(BigNumber x){
		BigNumber temp = digits;
		//TODO make sure compare to works this way
		while (temp.compareTo(x)>=0){
			temp=temp.subtract(x);
		}
		return temp;
		
	}
	
	public BigNumber factor(BigNumber x){
		//TODO it.
	}
	
	
}
