import java.util.Random;

public class Cleric {
  String name;
  final int MAXHP = 20;
  int hp = 20;
  final int MAXMP = 50;
  int mp = 50;

  void selfAid(){
    this.mp -= 5;
    this.hp = this.MAXHP;
    System.err.println(this.name + "はセルフエイドを唱えた！");
    System.out.println(this.name + "のHPが最大まで回復した！");
  }

  int pray(int sec){
    System.out.println(this.name + "は" + sec + "秒、天に祈った！");
    // 論理上の回復量を乱数を用いて決定する
    int recover = new Random().nextInt(3) + sec;
    // 実際の回復量を計算する
    int recoverActual = Math.min(this.MAXMP - this.mp, recover);

    this.mp += recoverActual;
    System.out.println(this.name + "のMPが" + recoverActual + "回復した！");
    return recoverActual;
  }
}