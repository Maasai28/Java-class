package com.class7;

public class CompoundOperatorTask1 {

	public static void main(String[] args) {
/*Declare variable and increase by 100
 * Declare variable and decrease by 67
 * Declare variable cakePiece=11 between 4 people
 * How many cakPiece left?		 
 *  cakePiece = 25 divide by 7 Find
 *  How many left?
 */ 
    int a = 10;
    a +=100;
    System.out.println(a);
     
    int b =20;
    b-=67;
    System.out.println(b);
    
    /*int cakePiece = 11;
    cakePiece/=4;
    System.out.println(cakePiece);*/
    
    int cakePiece = 25;
   /* cakePiece/=7;
    System.out.println(cakePiece);*/
    
    cakePiece%=7;
    System.out.println(cakePiece);
	}

}
