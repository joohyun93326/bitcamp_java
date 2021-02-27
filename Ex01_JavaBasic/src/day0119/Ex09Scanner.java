package day0119;

//기본 라이브러리에 포함되지 않는 Scanner 클래스
import java.util.Scanner;

public class Ex09Scanner {
    public static void main(String[] args) {
        
        //키보드 입력값을 String으로 읽어옴
        //읽어온 String값이 내가 호출한 메소드의 패턴과 일치하는지 체크
        //일치하면 내가 원하는 데이터타입으로 변환
        //일치하지 않으면 에러.
        Scanner scanner = new Scanner(System.in);
        
        //1. int를 입력 받을 때에는 Scanner 변수의 nextInt() 메소드 실행
        System.out.println("숫자를 입력해주세요.");
        int number = scanner.nextInt();
        System.out.println("사용자가 입력한 숫자 : " +number);
        
        //2. double을 입력 받을 때에는 Scanner 변수의 nextDouble() 메소드 실행
        System.out.println("실수를 입력해주세요.");
        double d = scanner.nextDouble();
        System.out.println("사용자가 입력한 실수 : " +d);
        //정수를 입력해도 출력은 실수로 출력됨 (20 -> 20.0)
        
        //3. String을 입력 받을 때에는 Scanner 변수의 nextLine() 메소드 실행
        
        //nextInt(), nextDouble()등의 숫자를 입력받는 메소드는
        //버퍼메모리에 엔터키(=개행문자)를 남겨두고
        //그 다음에 실행되는 nextLing() 메소드는 남겨진 엔터키를 보고
        //사용자가 입력을 종료시켰다 라고 착각하게 된다.
        //이 착각때문에 아무런 String을 입력할 수 없게 된다.
        //따라서 우리는 버퍼메모리 안의 엔터키를 없애주기 위해 
        //진짜 스트링 입력을 위한 nextLine() 전에
        //비워주는 nextLine()을 한 번 실행시켜 주어야 한다.
        
        System.out.println("이름을 입력해주세요.");
        scanner.nextLine(); //엔터키 없애주기
        String name = scanner.nextLine();
        System.out.println("사용자의 이름 : " +name);
        
        scanner.close();
        
    }
}
