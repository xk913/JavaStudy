package hard.xk.com.second;

import java.io.Serializable;

public class Student implements Serializable{
    private String stuName;
    private int stuAge;
    private String id;
    private int score;

    public Student() {

    }

    public Student(String stuName, String id) {
        this.stuName = stuName;
        this.id = id;
    }

    public Student(String stuName, int stuAge, String id, String address) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.id = id;
        this.score = score;

    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int address) {
        this.score = address;
    }

    public void show() {
        System.out.println("姓名" + this.stuName + "\t 年龄" + this.stuAge
                + "\t 学号" + this.id + "\t 成绩" + this.score);
    }

}
