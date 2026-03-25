package Thread_Game;

public class Character extends Unit implements GameAction {
    public Character(String name, int strength, int intelligence, double dexterity, double wisdom, int ultimateSkill, int healthPower) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.wisdom = wisdom;
        this.ultimateSkill = ultimateSkill;
        this.healthpower = healthPower;
    }

    @Override
    public double pAttack() { return strength * dexterity; }

    @Override
    public double mAttack() { return intelligence * wisdom; }

    @Override
    public int ultimate() { return ultimateSkill; }

    @Override
    public boolean setDamage(double damage) {
        if (healthpower > damage) {
            healthpower -= damage;
            System.out.println("남아 있는 " + name + "의 체력은 " + healthpower + "입니다.");
            return false;
        } else {
            System.out.println(name + "이 사망하였습니다. 게임을 종료합니다.");
            return true;
        }
    }
}
