public class Main {
    public static void main(String args[]){
        Boy boy = new Boy();
        Girl girl = new Girl();
        Relationship relationship = new Relationship();

        System.out.println(boy.returnName() + " " + relationship.returnRelationships() + " " + girl.returnName());
    }
}
