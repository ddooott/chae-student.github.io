//생성자에 매개변수가 많다면 빌더를 고려하라.점층적 생성사 패턴(telescoping constructor pattern), 정적 팩터리, 매개변수..//
public class NutritionFacts {
  private final int servingSize; // (ml, 1회 제공량)      필수
  private final int serving;     // (회, 총 n회 제공량)   필수
  private final int calories;    // (1회 제공량당)        선택
  private final int fat;         // (g/ 1회 제공량)       선택
  private final int sodium       // (mg/1회 제공량)       선택
  private final int carbohydrate; // (g/1회 제공량)       선택
  
  public NutritionFacts(int servingSize, int servings) {
    this(servingSize, servings, 0);
  }
  
  public NutritionFacts(int servingSize, int serving, int calories) {
    this(servingSize, servings, calories, 0);
  }
  
  public NurtitionFacts(int servingSize, int servings, int calories, int fat) {
    this(servingSize, servins, calories, fat, 0);
  }
  
  public NutritionFacts(int servingsSize, int servings, int calories, int fat, int sodium) {
    this(servingSize, servings, calories, fat, sodium, 0);
  }
  
  public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
    this.servingSize = servingSize;
    this.servings    = servings;
    this.calories    = calories;
    this.fat         = fat;
    this.sodium      = sodium;
    this.carbohydrate = carbohydrate;
    
    //이 클래스의 인스턴스를 만들려면 원하는 매개변수를 모두 포함한 생성자 중 가장 짧은것을 골라 호출하면 된다.//
    // NutritionFacts coacCola = new NutritionFacts(240, 8, 100, 0, 35, 27);
    // 요약: 점층적 생성자 패턴도 쓸 수는 있지만, 매개변수 개수가 많아지면 클라이언트 코드를 작성하거나 읽기 어렵다.
