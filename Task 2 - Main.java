/*
 * Число-палиндром с обеих сторон (справа налево и слева направо)
 * читается одинаково. Самое большое число-палиндром, полученное
 * умножением двух двузначных чисел – 9009 = 91 × 99.
 * Найдите самый большой палиндром, полученный умножением двух
 * трехзначных чисел. (4 часа)
 */
package level2task2;

/**
 *
 * @author safordog
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int palindrom = 0;
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                int num = i * j;
                String str = Integer.toString(num);
                String[] strArr = str.split("");
                int[] intArr = new int[strArr.length];
                for (int k = 0; k < strArr.length; k++) {
                    intArr[k] = Integer.parseInt(strArr[k]);
                }
                if (intArr[0] == intArr[intArr.length - 1] 
                        && intArr[1] == intArr[intArr.length - 2]
                        && intArr[2] == intArr[3]) {
                    if (palindrom < num) {
                        palindrom = num;
                    }  
                }
            }
        }
        System.out.println(palindrom);
    }

}
