//사용자로부터 번호, 이름, 국어, 영어, 수학 점수를 차례대로 입력 받아
//다음처럼 출력될 수 있게 프로그램을 작성하시오
//예시)
//번호 : 002번 이름 : 박주현
//국어 : 004점 영어 : 002점 수학:001점
//총점 : 007점 평균 : 02.33점

package day0119;

import java.util.Scanner;
public class Ex13GradeBook3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("번호 입력.");
        int num = scanner.nextInt();
        
        System.out.println("이름 입력.");
        scanner.nextLine();
        String name = scanner.nextLine();
        
        System.out.println("국어점수 입력.");
        int korean = scanner.nextInt();
        
        System.out.println("영어점수 입력.");
        int english = scanner.nextInt();
        
        System.out.println("수학점수 입력.");
        int math = scanner.nextInt();
        
        int sum = korean + english + math;
        double average = sum / 3.0;
                
        System.out.printf("번호 : %03d번  이름 : %s\n", num, name);
        System.out.printf("국어 : %03d점  영어 : %03d점  수학 : %03d점\n", korean, english, math);
        System.out.printf("총점 : %03d점  평균 : %.2f점\n", sum, average);

    scanner.close();
    }
}
