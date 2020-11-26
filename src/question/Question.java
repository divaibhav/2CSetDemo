/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 26-Nov-20
 *  Time: 2:10 PM
 */
package question;

import java.util.*;

/**
 * Question: Create a list of Student object, add 5 elements in the list.
 * Sort it on the basis of first on rollNo,
 * then by Name;
 * Student class contains two fields rollNo & Name;
 * hint: Comparable<T></> and Comparator<T> with lambda expression
 */
class Student implements Comparable<Student>, Comparator<Student> {
    private int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //comparing on rollno
        return this.getRollNo() - o.getRollNo();
    }

    @Override
    public int compare(Student o1, Student o2) {
        //comparing by name
        return o1.getName().compareTo(o2.getName());
    }
}
public class Question {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            Student s = new Student();
            s.setName(sc.nextLine());
            s.setRollNo(sc.nextInt());
            sc.nextLine();
        }
        System.out.println(list);

        //sorting by roll no
        Collections.sort(list);
        System.out.println("sorted by roll number \n" + list);
        //lambda expression for Comparator
        Comparator<Student> studentComparator = (o1, o2) -> {
            //comparing by name
            return o1.getName().compareTo(o2.getName());
        };
        //sorting by name
        Collections.sort(list, studentComparator);
        System.out.println("sorted by name \n" + list);
    }
}
