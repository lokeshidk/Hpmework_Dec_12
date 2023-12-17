package model;

public class Students {
    String name;
    int age;
    int marks[];
    int grade;

    public Students(String name, int age, int[] marks, int grade) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void Result() {
        double total = 0;
        for (int i = 0; i < 6; i++) {
            total = total + marks[i];
        }
        double percentage = total / 6;
        String total_grade;
        double gpa;
        if (percentage > 90) {
            total_grade = "A+";
            gpa = 4.0;
        } else if (percentage > 80) {
            total_grade = "A";
            gpa = 3.6;
        } else if (percentage > 70) {
            total_grade = "B+";
            gpa = 3.2;
        } else if (percentage > 60) {
            total_grade = "B";
            gpa=2.8;
        } else if (percentage > 50) {
            total_grade = "C+";
            gpa=2.4;
        } else if (percentage > 40) {
            total_grade = "C";
            gpa=2.0;
        } else {
            total_grade = "fail";
            gpa=0;
        }
        System.out.println("\t\tSchool");
        System.out.println("Name : "+this.name);
        System.out.println("Grade : "+this.grade);
        System.out.println("Age : "+this.age);
        System.out.println("Subjects : ");
        System.out.println("\tEnglish : " + this.marks[0]);
        System.out.println("\tComputer : " + this.marks[1]);
        System.out.println("\tNepali : " + this.marks[2]);
        System.out.println("\tPhysics : " + this.marks[3]);
        System.out.println("\tChemistry : " + this.marks[4]);
        System.out.println("\tMaths : " + this.marks[5]);
        System.out.println("\tPercentage : "+percentage);
        System.out.println("\tGrade : "+total_grade);
        System.out.println("\tGPA : "+gpa);
    }
}
