public class Main {
  public static void main(String[] args){

    // Swordのインスタンスを作成
    Sword s = new Sword();
    s.name = "雷神の剣";
    s.damage = 36;
    // 勇者のインスタンスを生成
    Hero h = new Hero("健太");
    // フィールドに初期値をセット
    h.sword = s;
    System.out.println("勇者" + h.getName() + "を生み出した！");
    System.out.println("勇者" + h.getName() + "は" + h.sword.name + "を装備しています。");

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
    Cleric c = new Cleric("美穂子");
    System.out.println("聖職者" + c.name + "を生み出した！");

    // 魔法使いがしようする杖のインスタンスを作成
    Wand wand = new Wand();
    wand.setName("真紅の杖");
    wand.setPower(6);
    // 魔法使いインスタンスの作成
    Wizard w = new Wizard();
    w.setName("そうすけ");
    w.setHp(18);
    w.setWand(wand);

    // 勇者が持つ金額をランダムで取得
    Hero.setRandomMoney();

    // 冒険の始まり
    System.out.println("勇者の所持金は" + Hero.money + "円です。");
    h.slip();
    c.selfAid();
    c.selfAid();
    c.selfAid();
    c.selfAid();
    c.pray(6);
    m1.run();
    m2.run();
    w.heal(h);
    h.run();
  }
}