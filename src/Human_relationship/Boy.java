import java.util.Random;
public class Boy extends Human{
    private static String[] randomBoyNames;
    private static Random rand = new Random();
    private static String boyName;
    public Boy(String names[]){
        randomBoyNames = names;
        boyName = randomBoyNames[rand.nextInt(randomBoyNames.length)];
    }

    public static String getName(){
        return boyName;
    }

    public static void setName(String name){
        boyName = name;
    }

}
