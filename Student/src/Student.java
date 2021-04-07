public class Student {
    private static String student_name;
    private static int student_id;
    private static String student_curriculum;
    public Student(/*String name, int id, String curriculum*/){
        /*student_name = name;
        student_id = id;
        student_curriculum = curriculum;*/
    }

    public static String getName(){
        return student_name;
    }

    public static int getId(){
        return student_id;
    }

    public static String getCurriculum(){
        return student_curriculum;
    }

    public static void setName(String name){
         student_name = name;
    }

    public static void setId(int id){
         student_id = id;
    }

    public static void setCurriculum(String curriculum){
         student_curriculum = curriculum;
    }
}
