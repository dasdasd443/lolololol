import java.util.Random;

public class Relationship {
    private static Random rand = new Random();
    private static String relationship;
    private static String[] relationships = {"hates","is in love with","is indifferent to","does not like","likes"};

    public Relationship(){
        relationship = relationships[rand.nextInt(5)];
    }
    public static String getRelationship(){
        return relationship;
    }

    public static void setRelationship(String relation){
        relationship = relation;
    }
}
