public class Peasant {
    int id;
    int healthLevel;
    String name;

    public Peasant(int id, int healthLevel, String name) {
        this.id = id;
        this.healthLevel = healthLevel;
        this.name = name;
    }
    public void step(){

    }
    public String getInfo(){
        return ("NAME: " + name + " " +  "ID: " + id + " " + "HEALTH: " + healthLevel + " " );
    }
}
