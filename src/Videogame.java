import exceptions.LowHealthException;

public class Videogame {
    public static void main(String[] args) {
    //Create characters
        try {
            Character character1 = new Character();
            Character character2 = new Character("Mago", 50);
            Character character3 = new Character("Civil", 10);
        }catch (LowHealthException e){
            System.err.println(e.getMessage());
        }

        System.out.println("The total number of character created is: " + Character.getTotalCharacters());
    }
}