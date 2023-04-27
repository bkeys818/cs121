package classArraylists;
//******************************************************************
//  Activity 17
//  Name: Ben Keys
//  Data Structures Date: 02/13/2023
//******************************************************************

import java.util.ArrayList;

public class CourseInfo {
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Float> gpas = new ArrayList<>();
    ArrayList<Float> scores = new ArrayList<>();
    ArrayList<String> letterGrades = new ArrayList<>();

    void addClass(String name, float gpa, float score, String letterGrade) {
        this.names.add(name);
        this.gpas.add(gpa);
        this.scores.add(score);
        this.letterGrades.add(letterGrade);
    }

    void display() {
        int maxClassName = 11, maxGPA = 3, maxScore = 5, maxLetterGrade = 12;
        for (String name : this.names) {
            int l = name.length();
            if (l > maxClassName) {
                maxClassName = l;
            }
        }
        for (float gpa : this.gpas) {
            int l = String.format("%.2f", gpa).length();
            if (l > maxGPA) {
                maxGPA = l;
            }
        }
        for (float score : this.scores) {
            int l = String.format("%.2f", score).length();
            if (l > maxScore) {
                maxScore = l;
            }
        }
        for (String letterGrade : this.letterGrades) {
            int l = letterGrade.length();
            if (l > maxLetterGrade) {
                maxLetterGrade = l;
            }
        }

        String format = "%-" + maxLetterGrade + "s   %-" + maxGPA + "s   %-" + maxScore + "s   %-" + maxLetterGrade + "s%n";
        System.out.printf(format, "Course Name", "GPA", "Score", "Letter Grade");
        format = "%-" + maxLetterGrade + "s   %-" + maxGPA + ".2f   %-" + maxScore + ".2f   %-" + maxLetterGrade + "s%n";
        for (int i = 0; i < this.names.size(); i++) {
            System.out.printf(format, this.names.get(i), this.gpas.get(i), this.scores.get(i), this.letterGrades.get(i));
        }
    }
}
