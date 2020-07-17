public interface Human extends Creature {
  void talk();
  void watch();
  void hear();
  // さらに親インターフェースのCreatureからrun()を継承している
}