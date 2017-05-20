package com.example.android.reportcard;

/**
 * This @param ReportCard shows every students name, class and grades of Maths, History, Literature, English and Science one by one
 */

public class ReportCard {

    // Name of the Student
    private String nameOfStudent;
    // Class of the Student
    private String classOfStudent;
    // Grade of Maths, int 1-5 (1 = fail, 5 = excellent) following hungarian grading system
    private int gradeOfMaths;
    // Grade of History, int 1-5 (1 = fail, 5 = excellent) following hungarian grading system
    private int gradeOfHistory;
    // Grade of Literature, int 1-5 (1 = fail, 5 = excellent) following hungarian grading system
    private int gradeOfLiterature;
    // Grade of English, int 1-5 (1 = fail, 5 = excellent) following hungarian grading system
    private int gradeOfEnglish;
    // Grade of Science, int 1-5 (1 = fail, 5 = excellent) following hungarian grading system
    private int gradeOfScience;

    public ReportCard(String nameOfStudent, String classOfStudent, int gradeOfMaths, int gradeOfHistory, int gradeOfLiterature, int gradeOfEnglish, int gradeOfScience) {
        this.nameOfStudent = nameOfStudent;
        this.classOfStudent = classOfStudent;
        this.gradeOfMaths = gradeOfMaths;
        this.gradeOfHistory = gradeOfHistory;
        this.gradeOfLiterature = gradeOfLiterature;
        this.gradeOfEnglish = gradeOfEnglish;
        this.gradeOfScience = gradeOfScience;
    }


    // Getter and Setter methods to get and set informations what we would like to present
    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public String getClassOfStudent() {
        return classOfStudent;
    }

    public void setClassOfStudent(String classOfStudent) {
        this.classOfStudent = classOfStudent;
    }

    public int getGradeOfMaths() {
        return gradeOfMaths;
    }

    public void setGradeOfMaths(int gradeOfMaths) {
        this.gradeOfMaths = gradeOfMaths;
    }

    public int getGradeOfHistory() {
        return gradeOfHistory;
    }

    public void setGradeOfHistory(int gradeOfHistory) {
        this.gradeOfHistory = gradeOfHistory;
    }

    public int getGradeOfLiterature() {
        return gradeOfLiterature;
    }

    public void setGradeOfLiterature(int gradeOfLiterature) {
        this.gradeOfLiterature = gradeOfLiterature;
    }

    public int getGradeOfEnglish() {
        return gradeOfEnglish;
    }

    public void setGradeOfEnglish(int gradeOfEnglish) {
        this.gradeOfEnglish = gradeOfEnglish;
    }

    public int getGradeOfScience() {
        return gradeOfScience;
    }

    public void setGradeOfScience(int gradeOfScience) {
        this.gradeOfScience = gradeOfScience;
    }

    // toString() method will show on the screen the outcoming informations of this class, such as student name, class and grades of 5 subjects
    @Override
    public String toString() {
        return "Name of Student: " + nameOfStudent +
                "\nClass of Student: " + classOfStudent +
                "\nGrade of Maths: " + gradeOfMaths +
                "\nGrade of History: " + gradeOfHistory +
                "\nGrade of Literature: " + gradeOfLiterature +
                "\nGrade of English: " + gradeOfEnglish +
                "\nGrade of Science: " + gradeOfScience;
    }
}

