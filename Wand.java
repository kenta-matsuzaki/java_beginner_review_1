public class Wand {
  private String name;
  private double power;

  // nameのゲッターとセッター
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    if(name == null || name.length() < 3){
      throw new IllegalArgumentException("杖に設定されようとしている名前が以上です。処理を中断します。");
    }
    this.name = name;
  }

  // powerのゲッターとセッター
  public double getPower(){
    return this.power;
  }
  public void setPower(double power){
    if(power > 100.0 || 0.5 > power){
      throw new IllegalArgumentException("杖の増幅値が不正です。処理を中断します。");
    }
    this.power = power;
  }
}