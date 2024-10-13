import java.util.Scanner; // 클래스 임포트,Scanner 클래스는 내가 콘솔에서 입력하면 받을 수 있게 함. 파이썬의 input과 유사 

public class Datatype{
	public static void main(String[] args) {
		System.out.println(6+6 == 11); //boolean, false
		System.out.println(9); // number
		System.out.println("six"); // string
		System.out.println("lllllll".length());
		
		
		//Scanner 실습
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your name : ");
		String name = scanner.nextLine(); // 문자열 입력 받는건 nextLine
		
		System.out.println("enter your age : ");
		int age = scanner.nextInt(); // 정수 입력은 nextInt, 받는 데이터마다 정의해줘야 함
		System.out.println("hello " + name + ", your age is " + age);
		scanner.close(); // 입력이 끝난 후 스캐너를 닫아 메모리 방지 낭비
	}
}