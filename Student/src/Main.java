public class Main {
    public static void main(String args[]){
        Student margaret = new Student();
        margaret.setName("Margaret");
        margaret.setId(1234);
        margaret.setCurriculum("BS Architect");

        System.out.println("Student = "+ margaret.getName() + " with ID no: "+margaret.getId() + " has a Curriculum "+ margaret.getCurriculum());

        Student viktor = new Student();
        viktor.setName("Viktor");
        viktor.setId(1235);
        viktor.setCurriculum("BSCS");
        System.out.println("Student = "+ viktor.getName() + " with ID no: "+viktor.getId() + " has a Curriculum "+ viktor.getCurriculum());

        Student marko = new Student();
        viktor.setName("Marko");
        viktor.setId(1236);
        viktor.setCurriculum("BS CE");
        System.out.println("Student = "+ viktor.getName() + " with ID no: "+viktor.getId() + " has a Curriculum "+ viktor.getCurriculum());
    }
}
