package com.class24;

public class Bank {
	
	public int chargeInterest() {
		return 0;
	}

}
  //1st child class
class BOA extends Bank { // rarely done. if done - NOT PUBLIC access modifier
	@Override // annotation
	public int chargeInterest() {
		return 2;
	}
}
  //2nd child class
class PNC extends Bank {
	@Override
	public int chargeInterest() {
		return 3;
	}
}