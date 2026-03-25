package Thread_Game;

public abstract class Unit {
    protected String name;          // 캐릭터명
    protected int strength;         // 물리
    protected int intelligence;     // 마법
    protected double dexterity;     // 물리적중
    protected double wisdom;        // 마법적중
    protected int ultimateSkill;    // 궁극기
    protected int healthpower;      // 체력
}

interface GameAction {
    double pAttack();                   // 물리 공격력
    double mAttack();                   // 마법 공격력
    int ultimate();                     // 궁극기 공격력
    // 캐릭터의 생존여부 : hp < damage = true (사망)
    boolean setDamage(double damage);   // 피해량
}