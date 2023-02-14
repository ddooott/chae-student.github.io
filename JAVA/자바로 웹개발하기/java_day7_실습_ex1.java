//가위바위보 게임 -> 사용자 입력으로 사용자가 가위 또는 바위 또는 보를 입력하는 것만으로 동작.

public static void ex1() {
  String player;
  String computer = "";
  int[] score = new int[3]; // 0: 승, 1: 패, 2: 무
  String[] sArr = {"가위", "바위", "보"};
  boolean exitFlag = false;
  
  while(true) {
    System.out.print("가위, 바위, 보 중 하나 입력(게임 종료를 원하면 종료 입력) : ");
    player = sc.nextLine();
    if(player.equals("가위") || player.equals("바위") || player.equals("보") || player.equals("종료")) {
      if(player.equals("종료")) {
        exitFlag = true;
      }
      break;
    }
  }
  
  if(exitFlag) {
    break;
  }
  
  computer = sArr[rd.nextInt(3)];
  
  if(player.equals("가위")) {
    if(computer.equals("바위")) {
      System.out.println("컴퓨터 승");
      score[1] +=1;
    } else if (computer.equals("보")) {
      System.out.println("플레이어 승");
      score[0] += 1;
    } else if(computer.equals("가위")) {
      System.out.println("무승부");
      score[2] += 1;
    }
    
  } else if(player.equals("바위")) {
    if(computer.equals("바위")) {
      System.out.println("무승부");
      score[2] += 1;
    } else if(computer.equals("보")) {
      System.out.println("컴퓨터 승");
      score[1] += 1;
    } else if (computer.equals("가위")) {
      System.out.println("플레이어 승");
      score[0] += 1;
    }
    
  } else if(player.equals("보")) {
    if(computer.equals("바위")) {
      System.out.println("플레이어 승");
      score[0] += 1;
    } else if(computer.equals("보")) {
      System.out.println("무승부");
      score[2] += 1;
    } else if(computer.equals("가위")) {
      System.out.println("컴퓨터 승");
      score[1] +=1;
    }
  
  }
  
  System.out.println("현재 플레이어의 스코어는 : " + score[0] + " 승 " + score[1] + " 패 " + score[2] + "무 입니다.");
}
}
public static void main(String[] args) {
  ex1();
}
