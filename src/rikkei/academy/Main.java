package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(1, "aaa");
        Student s2 = new Student(2, "bbb");
        Student s3 = new Student(3, "ccc");

        s1.display();
        s2.display();
        s3.display();
    }
}