public class Hero {
  private String name;
  private int hp;
  static int money;
  Sword sword;
  
  Hero(String name){
    this.name = name;
    this.hp = 28;
  }
  Hero(){
    this("だみー");
  }

  public String getName(){
    return this.name;
  }
  public void setName(String name){
    if(name == null){
      throw new IllegalArgumentException("名前がnullです。処理を中断します。");
    }
    if(name.length() <= 1){
      throw new IllegalArgumentException("名前が短すぎます。処理を中断します。");
    }
    if(name.length() >= 8){
      throw new IllegalArgumentException("名前が長すぎます。処理を中断します");
    }
    this.name = name;
  }
  
  public int getHp(){
    return this.hp;
  }
  public void setHp(int hp){
    this.hp = hp;
  }

  static void setRandomMoney(){
    Hero.money = (int) (Math.random() * 1000 );
  }

  public void attack(Matango m){
    System.out.println(this.name + "は攻撃した！");
    System.out.println("的に5ポイントのダメージを与えた！");
    System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた！");
    this.hp -= 2;
    if(this.hp <= 0){
      this.die();
    }
  }

  void sleep(){
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
  }

  void sit(int sec){
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った！");
    System.out.println(this.name + "のHPが" + sec + "ポイント回復した。");
  }

  void slip(){
    this.hp -= 5;
    System.out.println(this.name + "は転んだ！");
    System.out.println("5のダメージ！");
  }

  void run(){
    System.out.println(this.name + "は、逃げ出した！");
    System.out.println("GAMEOVER");
    System.out.println("最終HPは" + this.hp + "でした。");
  }

  private void die(){
    System.out.println(this.name + "は死んでしまった！");
    System.out.println("GAME OVERです。");
  }
}