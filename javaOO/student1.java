package test;
public class student1 {

    String major;
    int no;

    public static void main(String[] args) {
        student1 student = new student1();
        student.major = "��ǻ�Ͱ��а�";
        student.no = 20130668;

        System.out.println("�й�: " + student.no + ", �а�: " + student.major);
    }
}