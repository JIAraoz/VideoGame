import exceptions.LowHealthException;

public class Character {
    private String name;
    private int health;
    private static int totalCharacters;
    public Character(){
        health = 100;
        name = "Guerrero";
        totalCharacters++;
    }
    public Character(String name, int health) throws LowHealthException {

        if(health <= 10){
           throw new LowHealthException("the number must be greater than 10");
        }else{
            this.health=health;
            this.name = name;
            totalCharacters++;
        }

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public static int getTotalCharacters() {
        return totalCharacters;
    }

    public  void setTotalCharacters(int totalCharacters) {
        Character.totalCharacters = totalCharacters;
    }
}
