public class Wizard {
  String name;
  int hp;
  
  void heal(Hero h){
    h.setHp(h.getHp() + 10);
    System.out.println(this.name + "はhealを唱えた！" + h.getName() + "のHPを10回復した！");
  }
}