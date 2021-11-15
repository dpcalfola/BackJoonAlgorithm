package q2021year;

import java.util.Scanner;

public class Q3052 {

    static int[] num = new int[10];


    public static void main(String[] args) {


        get10num(); // 숫자 10개를 받음


        int[] reminder = new int[42] ;
        int count = 0 ;

        for ( int i = 0 ; i < reminder.length ; i++){
            // 42번 반복
            for ( int j = 0 ; j < num.length ; j++){
                //10번 반복
                if ( num[j]%42==i) {
                    reminder[i] = 1;
                }
            }
        }

        for ( int i = 0 ; i < reminder.length ; i++) {
//            System.out.println(reminder[i]);

            if (reminder[i]!=0){
                count++;
            }
        }

        System.out.println(count);

    }

    private static void get10num() {
        // 숫자 열 개를 받아서 배열에 집어넣는다.


        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            num[i] = scan.nextInt();
        }

    }
}


/*
*
*문제
두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.

수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

입력
첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.

출력
첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.

예제 입력 1
1
2
3
4
5
6
7
8
9
10
예제 출력 1
10
각 수를 42로 나눈 나머지는 1, 2, 3, 4, 5, 6, 7, 8, 9, 10이다.

예제 입력 2
42
84
252
420
840
126
42
84
420
126
예제 출력 2
1
모든 수를 42로 나눈 나머지는 0이다.

예제 입력 3
39
40
41
42
43
44
82
83
84
85
예제 출력 3
6
각 수를 42로 나눈 나머지는 39, 40, 41, 0, 1, 2, 40, 41, 0, 1이다. 서로 다른 값은 6개가 있다.


*
*
*
*
* */