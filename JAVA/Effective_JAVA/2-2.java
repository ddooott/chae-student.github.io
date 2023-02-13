// 선택 매개변수가 많을때 활용할 수 있는 두번째 대안 "자바빈스 패턴 (JavaBeans pattern)"
//--- 매개변수가 없는 생성자로 객체 만든 후 세터(setter)메서드 호출해 원하는 매개변수 값 설정하는 방식
//특징 : 일관성이 깨지고, 불변으로 만들 수 없다.
public class NutritionFacts {
  //매개변수들은 (기본값이 있다면) 기본값으로 초기화된다.
  private int servingSize  = -1; // 필수; 기본값 없음
  private int servings     = -1; // 필수; 기본값 없음
  private int calories     = 0;
  private int fat          = 0;
  private int sodium       = 0;
  private int carbohydrate = 0;
  
  public NutritionFacts() { }
  // 세터 메서드들
  public void setServingSize(int val) { servindSize = val; }
  public void setServings(int val)    { servinds = val;  } 
  public void setCalories(int val)    { calories = val; }
  public void setFat (int val)        { fat = val; }
  public void setSodium(int val)      { sodium = val; }
  public void setCarbohydrate(int val) { catbohydrae = val; }
  
  //점층적 생성자 패턴의 단점들이 자바빈즈에서는 더 이상 보이지 않는다.
  // 코드가 길어지긴 했지만 인스턴스 만들기 쉽고, 그 결과 더 읽기 쉬운 코드가 됐다.
  
  NutritionFacts cocaCola = new NutritionFacts();
  cocaCola.setServingSize(240);
  cocaCola.setServings(8);
  cocaCola.setCalories(100);
  cocaCola.setSodium(35);
  cocaCola.setCarbohydrate(27);
  
  //자바빈스 단독 단점: 객체 하나 만들려면 메서드 여러개 호출, 객체 완전히 생성되기 전 일관성(consistency) 무너진 상태
  //freeze메서드, 클래스불변 불가, 스레드 안전성 추가 작업
