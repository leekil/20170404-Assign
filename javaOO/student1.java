package test;
public class student1 {

    String major;
    int no;

    public static void main(String[] args) {
        student1 student = new student1();
        student.major = "컴퓨터공학과";
        student.no = 20130668;

        System.out.println("학번: " + student.no + ", 학과: " + student.major);
    }
}