package question;

import java.util.Scanner;

public class BankApplication {
	//static 필드
	
	//계좌객체를 저장 할수있는 배열 (디폴트 값 null)
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3. 예금 | 4.출금 | 5. 종료");
			System.out.println("---------------------------------------------");
			System.out.println("선택>");
			int selectNo = scanner.nextInt();
			
			switch (selectNo) {
			case 1: 
				//계좌등록
				createAccount();
				break;
			case 2:
				//계좌목록
				accountList();
				break;
			case 3:
				//예금
				deposit();
				break;
			case 4:
				//출금
				withdraw();
				break;
			case 5:
				//종료
				run = false;
				break;
			default:
				System.out.println("1~5 사이의 숫자를 입력해주세요");
				break;
			}
		}
	}
	//계좌 생성하기
	private static void createAccount() {
		System.out.println("----------");
		System.out.println("계좌 생성");
		System.out.println("----------");
		
		System.out.println("계좌 번호:");
		String ano = scanner.next(); // String타입으로 입력을 받는다.
		
		System.out.println("계좌주:");
		String owner = scanner.next();
		
		System.out.println("초기입금액:");
		int balance = scanner.nextInt();
		
		//계좌생성
		Account newAccount = new Account(ano, owner, balance);
		
		//참고 String이 참조 타입이기 때문에 아래와 같이 사용하는 것 처럼 Account도 참조 타입이다.
//		String[] arr = {"a", "b"};
//		
//		for(String a : arr) {
//			System.out.println(a);
//		}
//		
		
		//중요. 배열안에 객체를 넣는게 포인트.
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
			accountArray[i] = newAccount; //계좌객체를 배열에 넣어준다.
			System.out.println("결과: 계좌가 생성되었습니다.");
			break; //계좌를 생성하면 for문을 나온다.
		}
	}
		//힌트
//		//계좌가 잘 생성이 되었나 확인
//		for(Account account : accountArray) {
//			System.out.println(account);
//		}
		
	}
	
	//계좌목록 보여주기
	private static void accountList() {
		System.out.println("------------");
		System.out.println("계좌목록");
		System.out.println("------------");
				
		
		for(Account account : accountArray) {
			//배열이 null값일때 실행하는 걸 방지하기 위해
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print(" ");
				System.out.print(account.getOwner());
				System.out.print(" ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	
	}
	
	//예금하기 
	private static void deposit() {
		System.out.println("---------------");
		System.out.println("예금");
		System.out.println("---------------");
		
		//계좌번호, 예금액 입력
		System.out.println("계좌번호: ");
		String ano = scanner.next(); //String타입으로 입력을 받는다.
		
		System.out.println("예금액: ");
		int money = scanner.nextInt(); //int타입으로 입력을 받는다.
		
		//계좌찾기
		
		//리턴해 주는 값을 같은 타입인 account에 받는다.
		//account 변수에는 찾은 계좌가 들어있다.
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return; //메소드를 끝낸다.
		}
		
		account.setBalance(account.getBalance() + money);
		System.out.println("결과: 예금이 성공되었습니다.");		
	}
	
	//출금하기 
	private static void withdraw() {
		System.out.println("---------------");
		System.out.println("출금");
		System.out.println("---------------");
			
			//계좌번호, 예금액 입력
			System.out.println("계좌번호: ");
			String ano = scanner.next(); //String타입으로 입력을 받는다.
			
			System.out.println("출금액: ");
			int money = scanner.nextInt(); //int타입으로 입력을 받는다.
			
			//계좌찾기
			
			//리턴해 주는 값을 같은 타입인 account에 받는다.
			//account 변수에는 찾은 계좌가 들어있다.
			Account account = findAccount(ano);
			
			if(account == null) {
				System.out.println("결과: 계좌가 없습니다.");
				return; //메소드를 끝낸다.
			}
			
			account.setBalance(account.getBalance() - money);
			System.out.println("결과: 출금이 성공되었습니다.");
	}
	
	

	//계좌찾기 메소드
	private static Account findAccount(String ano) {
		Account resultAccount = null;
		for(Account account : accountArray) {
			//배열의 길이 null이 아닐때만 실행한다. => account 객체를 가지고 있을때
			if(account != null) {				
				if (ano.equals(account.getAno())) {
					//여기서 return을 하면 안되므로 아래와 같이 찾은 계좌를
					//account 타입의 변수인 resultAccount에 넣어준다.
					resultAccount = account;
					break;
				}
			}
		}
		
		return resultAccount; //찾은 계좌를 리턴해준다.
	}

}