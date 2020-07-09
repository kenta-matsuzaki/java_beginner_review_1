public class Main {
  public static void main(String[] args){
    // 1.勇者のインスタンスを生成
    Hero h = new Hero();
    // 2.フィールドに初期値をセット
    h.name = "ケンタ";
    h.hp = 23;
    System.out.println("勇者" + h.name + "を生み出した！");

    // お化けキノコのインスタンスの生成
    Matango m1 = new Matango();
    m1.hp = 13;
    m1.suffix = 'A';
    Matango m2 = new Matango();
    m2.hp = 14;
    m2.suffix = 'B';

    // 冒険の始まり
    h.slip();
    m1.run();
    m2.run();
    h.run();
  }
}