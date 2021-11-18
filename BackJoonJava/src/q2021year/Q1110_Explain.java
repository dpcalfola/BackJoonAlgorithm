package q2021year;

import java.util.Scanner;

public class Q1110_Explain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int initialNum = scan.nextInt();
        scan.close();

        int count = 1;

        int[] splitNum = splitNumMethod(initialNum);

//        System.out.println(splitNum[1] * 10 + splitNum[2]);


        while (splitNum[1] * 10 + splitNum[2] != initialNum) { // 조건문 체크시 이미 한 싸이클 돌았음. ( count 1부터 시작 )
            for (int i = 0; i < splitNum.length; i++) {
                System.out.println(count + "이전 사이클 배열 넘버" + i + " " + splitNum[i]);

            }

            makeNewSplit(splitNum);
            count++;

            for (int i = 0; i < splitNum.length; i++) {
                System.out.println(count + "나중 사이클 배열 넘버" + i + " " + splitNum[i]);

            }
            System.out.println();


        }

        System.out.println("카운트 " + count);
//        System.out.println(count);


    }

    private static void makeNewSplit(int[] array) {

        int n2 = array[1];
        int n3 = array[2];

        array[0] = n2;
        array[1] = n3;
        array[2] = (n2 + n3) % 10;


    }

    private static int[] splitNumMethod(int inputNum) {
        int n1, n2, n3;

        if (inputNum == 0) {
            n1 = 0;
            n2 = 0;
        } else if (inputNum < 10) {
            n1 = 0;
            n2 = inputNum;
        } else {
            n1 = inputNum / 10;
            n2 = inputNum % 10;
        }

        n3 = (n1 + n2) % 10;


        return new int[]{n1, n2, n3};


        // 24 -> 2 , 4
        // 1 -> 01 -> 0,1
    }
}


/*
* 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.

26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.

위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.

N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.

출력
첫째 줄에 N의 사이클 길이를 출력한다.

예제 입력 1
26
예제 출력 1
4
예제 입력 2
55
예제 출력 2
3
예제 입력 3
1
예제 출력 3
60
예제 입력 4
0
예제 출력 4
1
예제 입력 5
71
예제 출력 5
12*/
