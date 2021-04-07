public class Main {

    public static void main(String args[]){
        String arr[] = {"Victor","Dasd","Kenny","Eren","Jagger"};
        Boy boy = new Boy(arr);
        Girl girl = new Girl();
        Relationship relationship = new Relationship();
        System.out.println(boy.getName()+ " " + relationship.returnRelationships() + " " + girl.getName());

        System.out.print(boy.getName() + " says ");
        boy.talk();
        boy.setName("Victor");
        System.out.print(boy.getName() + " says ");
        boy.talk();
        System.out.print(girl.getName() + " says ");
        girl.talk();
        girl.setName("Maria");
        System.out.print(girl.getName() + " says ");
        girl.talk();
    }
}
