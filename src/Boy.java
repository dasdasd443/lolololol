import java.util.Random;
public class Boy {
    public static String[] randomBoyNames;
    public Boy(String names[]){
        randomBoyNames = names;
    }

    public static String returnName(){
        Random rand = new Random();

        return randomBoyNames[rand.nextInt(randomBoyNames.length)];
    }
}
