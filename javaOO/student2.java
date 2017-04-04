package test;

public class student2 {

    private String major;
    private int no;

    public void setMajor(String major) {
        this.major = major;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getMajor() {
        return major;
    }

    public int getNo() {
        return no;
    }

    public static void main(String[] args) {
        student2 student = new student2();
        student.setMajor("컴퓨터공학과");
        student.setNo(20130668);

        System.out.println("학번: " + student.getNo() + ", 학과: " + student.getMajor());
    }
}