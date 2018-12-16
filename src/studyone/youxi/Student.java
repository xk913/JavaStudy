package studyone.youxi;

import studyone.youxi.Person;

public class Student extends Person {

    private String num;

    private String schoolAddr;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getSchoolAddr() {
        return schoolAddr;
    }

    public void setSchoolAddr(String schoolAddr) {
        this.schoolAddr = schoolAddr;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "num='" + num + '\'' +
                ", schoolAddr='" + schoolAddr + '\'' +
                '}';
    }
}
