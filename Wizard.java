public class Wizard {
  private int hp;
  private int mp;
  private String name;
  private Wand wand;

  // hpのゲッターとセッター
  public int getHp(){
    return this.hp;
  }
  public void setHp(int hp){
    this.hp = hp;
  }

  // mpのゲッターとセッター
  public int getMp(){
    return this.mp;
  }
  public void setMp(int mp){
    this.mp = mp;
  }

  // nameのゲッターとセッター
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }

  // wandのゲッターとセッター
  public Wand getWand(){
    return this.wand;
  }
  public void setWand(Wand wand){
    this.wand = wand;
  }

  void heal(Hero h){
    int basePoint = 10;
    int recovPoint = (int) (basePoint * this.wand.getPower());

    h.setHp(h.getHp() + recovPoint);
    System.out.println(this.name + "はhealを唱えた！" + h.getName() + "のHPを" + recovPoint + "回復した！");
  }
}