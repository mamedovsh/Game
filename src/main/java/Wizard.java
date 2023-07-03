public class Wizard extends BasicHero{

    public Wizard(int id, int healthLevel, String name, int type, int attackLevelBase, int initiative, int heal) {
        super(id, healthLevel, name, type, attackLevelBase, initiative);
        this.heal = heal;
    }
    public int heal;
}
