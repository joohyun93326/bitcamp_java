package day0120;

public class Ex12Switch {
    public static void main(String[] args) {
        int number = 2;
        
        switch(number) {
        case 1:
            System.out.println("1입니다.");
            break;
        case 3:
            System.out.println("3입니다.");
            break;
        case 2:
            System.out.println("2입니다.");
            break;
        default:
            System.out.println("그 외 숫자입니다.");
            break;
        }
        
    }
}
