// 업앤 다운 -> 임의의 값 하나를 생성하고 사용자가 일정 범위의 정수 값 안에서 정수를 입력하면
//미리 생성된 값과 비교를 통해 업 또는 다운으로 힌트를 주어 최종 생성 값을 맞추는 게임


public static void ex2() {
  int num, ran, max = 100, min =1;
  
  while(true) {
    System.out.println("업 앤 다운 게임 시작!\n");
    
    ran = rd.nextInt(100)+1;
    
    while(true) {
      System.out.print(min + " ~ " + max + "사이의 수 입력 (그만하고 싶으면 0 입력후 엔터) :");
      num = sc.nextInt();    sc.nextLine();
      
      if(num == 0) break;
      
      if(num < 1 && num > 100) {
        System.out.println("1 ~ 100 사이 입력!!!\n");
        continue;
      }
      
      if(num > ran) {
        Systme.out.prinln("다운\n");
        max=num;
        continue;
      }else if(num<ran) {
        System.out.println("업\n");
        min = num;
        continue;
      } else if (num==ran) {
        System.out.println("정답!! (임의의 수: " + ran + ")\n");
        break;
      }
    }
    
    System.out.println("\n=============\n");
    break;
  }
  System.out.println("게임 종료");
}

public static void main(String[] args) {
  ex2();
}

//실제 코드
public static void ex2() {
		int num, ran, max = 100, min = 1;
		
		while(true) {
			System.out.println("업 앤 다운 게임 시작!\n");
			
			ran = rd.nextInt(100)+1;
			
			while(true) {
				System.out.print(min + " ~ " + max + "사이의 수 입력 (그만하고 싶은 0입력후 엔터) :");
				num = sc.nextInt();    sc.nextLine();
				
				if(num == 0) break;
				
				if(num < 1 && num > 100) {
					System.out.println("1 ~ 100 사이 입력!!!\n");
					continue;
				}

				if(num > ran) {
					System.out.println("다운\n");
					max = num;
					continue;
				}else if( num < ran) {
					System.out.println("업\n");
					min = num;
					continue;
				}else if(num == ran) {
					System.out.println("정답!! (임의의 수 : " + ran + " )\n" );
					break;
				}
			}
			
			System.out.println("\n=================\n");
			break;
		}
		System.out.println("게임 종료");
	}
    
 public static void main(String[] args) {
		ex2();
	}
