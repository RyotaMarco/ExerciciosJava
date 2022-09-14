package Entities;

public class Entities {
    public String name;

    public double grade1;

    public double grade2;

    public double grade3;

    public double student(){
        return   grade1 + grade2 + grade3;
    }

    public double finalGrade(){
        if (student() < 60) {
            return 60 - student();
        } else {
            return 0;
        }
    }
}
