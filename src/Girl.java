import java.util.Random;

public class Girl extends Human{
    private static Random rand = new Random();
    private static String[] randomGirlNames = {"Trisha","Martha","Maria","Czarina","Julianna"};
    private static String girlName;
    public Girl(){
        girlName = randomGirlNames[rand.nextInt(5)];
    }
    public static String getName(){
        return girlName;
    }

    public static void setName(String name){
        girlName = name;
    }

}
