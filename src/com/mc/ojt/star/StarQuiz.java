package com.mc.ojt.star;

public class StarQuiz {

	public static void main(String[] args) {
		//printTriangle(5);
		printRectangle(7, 7);
		printNumberRectangle(5);
		printDiamond(5);
		
	}
	
	// 사용자로부터 입력받은 값을 높이로 가지는 직각삼각형을 그려봅시다.
	// *
	// **
	// ***
	// ****	
	
	// 직각삼각형의 * 개수는 1부터 1씩 순차적으로 증가하는 수열이다
	// n부터 m까지 p씩 증가하는 수열 => for
	static void printTriangle(int height) {
		
		for (int i = 1; i <= height; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");			
			}
			
			System.out.println();			
		}	
	}
	
	//	row : 5
	//	col : 5
	//	*****
	//	*****
	//	*****
	//	*****
	//	*****
	static void printRectangle(int row, int col) {
		
		System.out.println("========================================");
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("*");
			}
			
			System.out.println();			
		}		
	}
	
	//	숫자 : 5
	//	1****
	//	*2***
	//	**3**
	//	***4*
	//	****5
	static void printNumberRectangle(int num) {
		System.out.println("====================================");
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				
				if(i == j) {
					System.out.print(i);
					continue;
				}
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	static void printDiamond(int input) {
		
		System.out.println("====================================");
		
		for (int i = 1; i <= input; i++) {
			
			for (int j = 0; j < input - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 2 * i -1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
				
		}
		
		
		for (int i = 1; i <= input - 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 2 * (input - i) -1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}
	
	
}
