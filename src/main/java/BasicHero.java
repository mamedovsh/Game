
    // Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
// На базе описания персонажей описать простейшую иерархию классов.
// В основной программе создать по одному экземпляру каждого класса.


    public abstract class BasicHero{
        int id;
        int healthLevel;
        String name;
        int type;
        int attackLevelBase;
        int initiative;

        public BasicHero(int id, int healthLevel, String name, int type, int attackLevelBase, int initiative) {
            this.id = id;
            this.healthLevel = healthLevel;
            this.name = name;
            this.type = type;
            this.attackLevelBase = attackLevelBase;
            this.initiative = initiative;
        }
    }


