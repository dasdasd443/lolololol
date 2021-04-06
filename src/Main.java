public class Main {

    public static void main(String args[]){
        String arr[] = {"Victor","Dasd","kenny","Eren","Jagger"};
        Boy boy = new Boy(arr);
        Girl girl = new Girl();
        Relationship relationship = new Relationship();

        System.out.println(boy.returnName()+ " " + relationship.returnRelationships() + " " + girl.returnName()[0] + ",who is " + girl.returnName()[1]);
    }
}
