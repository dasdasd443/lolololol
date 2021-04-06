import java.util.Random;

public class Girl {
    public static String returnName(){
        Random rand = new Random();
        String[] randomGirlNames = {"Trisha","Martha","Maria","Czarina","Julianna"};
        return randomGirlNames[rand.nextInt(5)];
    }
}
