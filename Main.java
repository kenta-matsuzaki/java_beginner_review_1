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
    System.out.println("お化けキノコ" + m1.suffix + "が現れた！");
    Matango m2 = new Matango();
    m2.hp = 14;
    m2.suffix = 'B';
    System.out.println("お化けキノコ" + m2.suffix + "が現れた！");

    // 聖職者のインスタンスの作成
    Cleric c = new Cleric();
    c.name = "美穂子";
    System.out.println("聖職者" + c.name + "を生み出した！");

    // 冒険の始まり
    h.slip();
    c.selfAid();
    c.selfAid();
    c.selfAid();
    c.selfAid();
    c.pray(6);
    m1.run();
    m2.run();
    h.run();
  }
}