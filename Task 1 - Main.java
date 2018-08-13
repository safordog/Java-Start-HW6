/* Существуют такие последовательности чисел
 * 0,2,4,6,8,10,12
 * 1,4,7,10,13
 * 1,2,4,8,16,32
 * 1,3,9,27
 * 1,4,9,16,25
 * 1,8,27,64,125
 * Реализуйте программу которая выведет следующий член этой
 * последовательности (либо подобной им). Например пользователь вводит
 * строку 0,2,4,6,8,10,12 ответом программы должно быть число 14. (6 часов)
 */

package com.gmail.safordog;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sequence of numbers: ");
		String str = sc.nextLine();
		String[] strArr = str.split(",");
		int[] intArr = new int[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		if (intArr[intArr.length - 1] - intArr[intArr.length - 2] 
				== intArr[1] - intArr[0]) {
			System.out.println(intArr[intArr.length - 1] 
					+ (intArr[1] - intArr[0]));
		}
		if (intArr[intArr.length - 1] / intArr[intArr.length - 2] 
				== intArr[1]) {
			System.out.println(intArr[intArr.length - 1] * intArr[1]);
		}
		if ((intArr[intArr.length - 1] - intArr[intArr.length - 2]) 
				== ((intArr[intArr.length - 2] 
						- intArr[intArr.length - 3]) + 2)) {
			System.out.println(((intArr[intArr.length - 1] 
					- intArr[intArr.length - 2]) + 2) 
					+ intArr[intArr.length - 1]);
		}
		if (Math.cbrt(intArr[intArr.length - 1]) 
				== (Math.cbrt(intArr[intArr.length - 2])) + 1) {
			System.out.println((int) 
					Math.pow(Math.cbrt(intArr[intArr.length - 1]) + 1, 3));
		}
		
		sc.close();
	}

}
