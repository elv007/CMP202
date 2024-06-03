package OOP_1;

public class User {
    String name;
    String password;


    String login(){
      return "logged In";
    }

    String Register(){
        if(name.equals("Elvis") || password.equals("1234")){
            return "can't be Empty";
        }
        else {
            return "Successfully Registered";
        }
    }
}

public class Admin extends User{
    String staffNo;
    String uploadResult(String course,Float score){
        System.out.println(course=" "+ score);
        return course;
    }
}
Admin

public class Student extends User{

    String matric_no;
    String admission_no;


    String login() {

        if (admission_no.equals("") || matric_no.equals("")){
            return "Can't be empty";
        }
        else {
            return "Success";
        }
    }
    void registerCourses() {
        System.out.println("Course");
    }
    String checkResult() {
        return "cmp202" + "" +70;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.registerCourses();
        System.out.println(student.checkResult());
    }
}
Student