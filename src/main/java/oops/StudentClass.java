package oops;

public class StudentClass {
    public static class Student{
        String name;
        int roll;
        double percentage;
    }
    public static void fun(Student s1){
        s1.name = "new";
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Vivek";
        s1.roll = 97;
        s1.percentage = 98.8;
        System.out.println(s1.name);
        s1.name = "mittal";
        System.out.println(s1.name);
        fun(s1);
        System.out.println(s1.name);
    }
}


