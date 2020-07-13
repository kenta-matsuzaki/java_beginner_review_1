public class Wizard {
  private int hp;
  private int mp;
  private String name;
  private Wand wand;

  // hpのゲッターとセッター
  public int getHp(){ return this.hp; }
  public void setHp(int hp){
    if(hp < 0){
      this.hp = 0;
    } else {
      this.hp = hp;
    }
  }

  // mpのゲッターとセッター
  public int getMp(){ return this.mp; }
  public void setMp(int mp){
    if(mp < 0){
      throw new IllegalArgumentException("MPが不正な値です。処理を中断します。");
    }
    this.mp = mp;
  }

  // nameのゲッターとセッター
  public String getName(){ return this.name; }
  public void setName(String name){
    if(name == null || name.length() < 3){
      throw new IllegalArgumentException("魔法使いに設定されようとしている名前が異常です。処理を中断します。");
    }
    this.name = name;
  }

  // wandのゲッターとセッター
  public Wand getWand(){ return this.wand; }
  public void setWand(Wand wand){
    if(wand == null){
      throw new IllegalArgumentException("設定されようとしている杖がnullです");
    }
    this.wand = wand;
  }

  void heal(Hero h){
    int basePoint = 10;
    int recovPoint = (int) (basePoint * this.wand.getPower());

    h.setHp(h.getHp() + recovPoint);
    System.out.println(this.name + "はhealを唱えた！" + h.getName() + "のHPを" + recovPoint + "回復した！");
  }
}