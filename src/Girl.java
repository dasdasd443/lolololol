import java.util.Random;

public class Girl {
    public static String[] randomGirlNames = {"Trisha","Martha","Maria","Czarina","Julianna"};
    public static String[] randomGirlAge = {"13","15","19","12","35"};
    public static String[] returnName(){
        Random rand = new Random();
        String[] str = {randomGirlNames[rand.nextInt(5)],randomGirlAge[rand.nextInt(5)]};
        return str;
    }
}
