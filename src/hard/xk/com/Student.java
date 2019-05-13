package hard.xk.com;

public class Student implements Comparable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String name, String id, int score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public Student() {
    }

    private String id;
    private int score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        //对引用数据类型排序，必须实现Comparable接口中的此方法.
        Student student = (Student) o;
        int num = this.getScore() - student.getScore();
        int num1 = num == 0 ? this.getName().compareTo(student.getName()) : num;
        return num1;
    }
}


