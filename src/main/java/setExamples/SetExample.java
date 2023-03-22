package setExamples;

import model.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

    public void exampleHashSet() {
        HashSet<String> studentNames = new HashSet<>();

        if (studentNames.isEmpty()){
            System.out.println("Please add student names");
        }

        studentNames.add("Inga");
        studentNames.add("Sabine");
        studentNames.add("Sabine");
        studentNames.add("Karolina");
        studentNames.add("Paula");
        studentNames.add("Sabine");
        studentNames.add("Zino");
        studentNames.add("Anastasija");

        if (studentNames.contains("zino")){
            System.out.println("Zino is found");
        }

        for (String studentName: studentNames){
            System.out.println(studentName);
        }
    }

    public void exampleHashSetWithCustomType(){
        HashSet<Student> students = new HashSet<>();

        Student studentToCheck = new Student("Signe", 30);

        System.out.println(studentToCheck.hashCode() );
        System.out.println(studentToCheck.equals(new Student("Signe", 30)) );
        System.out.println(studentToCheck.equals(new Student("Zino", 23)) );
        students.add(studentToCheck);
        students.add(new Student("zino", 5));
        students.add(new Student("zino", 5));
        students.add(new Student("zino", 3));
        students.add(new Student("Rasa", 33));
        students.add(new Student("Julija", 34));
        students.add(new Student("Nadezda", 37));
        students.add(new Student("Sabina", 35));

        System.out.println("contains Signe: " + students.contains(studentToCheck));
        System.out.println("contains New Copy Of Sabina: " + students.contains(new Student("Sabina", 35)));

        System.out.println(students);

        for (Student student : students){
            System.out.println(student.getName());
            //do something more
        }

    }

    public void exampleTreeSet() {
        System.out.println("==== Tree Set Example ===");

        TreeSet<String> studentNames = new TreeSet<>();

        studentNames.add("Sabine");
        studentNames.add("Sabine");
        studentNames.add("Karolina");
        studentNames.add("Zino");
        studentNames.add("Inga");
        studentNames.add("Sabine");
        studentNames.add("Anastasija");
        studentNames.add("Paula");

        System.out.println("EExample with primitive types");
        //this line is the same as below line. values in the loop are sent directly to system.out.println
        // studentNames.forEach(studentName -> System.out.println(studentName));
        studentNames.forEach(System.out::println);


        System.out.println("Example using custom Object");

        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("zino", 5));
        students.add(new Student("Julija", 34));
        students.add(new Student("zino", 3));
        students.add(new Student("Nadezda", 37));
        students.add(new Student("zino", 5));
        students.add(new Student("Rasa", 33));
        students.add(new Student("Sabina", 35));
        students.add(new Student("John", 70));
        students.add(new Student("Mary", 70));

        students.forEach(System.out::println);

        System.out.println(students.descendingSet());

        TreeSet<Student> maybeCanCast = new TreeSet<>();
        maybeCanCast = (TreeSet<Student>) students.descendingSet();
        System.out.println(maybeCanCast);

        System.out.println(students.contains(new Student("zino", 5)));
        System.out.println(students.contains(new Student("zino", 54934993)));

        System.out.println(students.first());
        System.out.println(students.last());
        System.out.println(students.remove(new Student("John", 70)));

    }


    public void exampleLinkedHashSet(){
        LinkedHashSet<String> studentNames = new LinkedHashSet<>();

        studentNames.add("Sabine");
        studentNames.add("Inga");
        studentNames.add("Karolina");
        studentNames.add("Zino");
        studentNames.add("Sabine");
        studentNames.add("Sabine");
        studentNames.add("Anastasija");
        studentNames.add("Paula");

        studentNames.forEach(System.out::println);

        System.out.println("Example using custom Object");

        LinkedHashSet<Student> students = new LinkedHashSet<>();
        students.add(new Student("Julija", 34));
        students.add(new Student("zino", 5));
        students.add(new Student("zino", 3));
        students.add(new Student("zino", 5));
        students.add(new Student("Nadezda", 37));
        students.add(new Student("Sabina", 35));
        students.add(new Student("Rasa", 33));
        students.add(new Student("John", 70));
        students.add(new Student("Mary", 70));

        students.forEach(System.out::println);

    }



}

