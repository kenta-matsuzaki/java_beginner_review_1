public class Hero {
  String name;
  int hp;
  Sword sword;

  void attack(){
    System.out.println(this.name + "は攻撃した！");
    System.out.println("的に5ポイントのダメージを与えた！");
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
}