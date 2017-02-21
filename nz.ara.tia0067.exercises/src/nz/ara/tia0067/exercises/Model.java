package nz.ara.tia0067.exercises;


public class Model {
	public String checkMark(int data){
		String result;
		if(data >= 50){
			result = "PASS!";
		}else if(data < 50){
			result = "FAIL!";
		}else{
			result = "INVALID INPUT";
		}
		return result;
	}
	
	public String checkNumber(int data){
		String result;
		if(data % 2 == 1){
			result = "Odd number";
		}else if(data % 2 == 0){
			result = "Even number";
		}else{
			result = "INVALID INPUT";
		}
		return result;
	}
	
	/*
	 * Exercise 3 (using nested if and case select)
	 */
	public String printWord(int data){
		String result;
		result = "OTHER";
		if (data <= 1){
			if(data >=9){
				switch(data){
					case 1: result = "ONE"; break;
					case 2: result = "TWO"; break;
					case 3: result = "THREE"; break;
					case 4: result = "FOUR"; break;
					case 5: result = "FIVE"; break;
					case 6: result = "SIX"; break;
					case 7: result = "SEVEN"; break;
					case 8: result = "EIGHT"; break;
					case 9: result = "NINE"; break;
				}
			}
		}
		return result;
	}
	
	public String printWordFooBar(int data){
		String result;
		result = "OTHER";
		String[] numbersAsWords = {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
		if(data >= 1 && data <= 9){
			result = numbersAsWords[data];
		}				
		return result;
	}
	
	public String sumAndAverage(){
		String result = "";
		int sum = 0;
		int mean = 0;
		for(int i = 1; i <= 100; i++){
			sum += i;
			mean = sum / i;
		}
		result += "The sum is " + sum;
		result += "\r";
		result += "The average is " + mean;
		return result;
	}
	
	public String sumAndAverageWhile(){
		String result = "";
		int sum = 0;
		int mean = 0;
		int i = 1;
		while(i<=100){
			sum +=i;
			mean = sum / i;
			i++;
		}
		result += "The sum is " + sum;
		result += "\r";
		result += "The average is " + mean;
		return result;
	}
	
	public String sumAverageAndCount(int min, int max){
		String result = "";
		int sum = 0;
		int mean = 0;
		int count = 0;
		for(int i = min; i <= max; i++){
			sum += i;
			count++;
			mean = sum / count;		
		}
		result += "The sum is " + sum;
		result += "\r";
		result += "The average is " + mean;
		result += "\r";
		result += "The count was " + count;
		return result;
	}
	
	public String countOdd(){
		String result = "";
		int sum = 0;
		int mean = 0;
		int count = 0;
		for(int i = 1; i <= 100; i+=2){
			sum += i;
			count++;
			mean = sum / count;
		}
		result += "The sum is " + sum;
		result += "\r";
		result += "The average is " + mean;
		result += "\r";
		result += "The count was " + count;
		return result;		
	}
	
	public String countSevens(){
		String result = "";
		int sum = 0;
		int mean = 0;
		int count = 0;
		for(int i = 7; i <= 100; i+=7){
			sum += i;
			count++;
			mean = sum / count;
		}
		result += "The sum is " + sum;
		result += "\r";
		result += "The average is " + mean;
		result += "\r";
		result += "The count was " + count;
		return result;		
	}
	
	public String countSquares(){
		String result = "";
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			sum += i*i;
		}
		result += "The sum is " + sum;
		return result;		
	}
}
