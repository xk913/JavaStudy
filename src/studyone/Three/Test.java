package studyone.Three;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
    public class Test {
        private static List<Student> students = new ArrayList<Student>();
        public static void init() {
            students.add(new Student(2018212649, "向康", 99, "wu","男"));
            students.add(new Student(2018212640, "李四", 67, "wu","攻"));
            students.add(new Student(2018212641, "王五", 88, "wu","攻"));
            students.add(new Student(2018212642, "赵六", 44, "wu","攻"));
            students.add(new Student(2018212643, "朱七", 51, "wu","受"));
            students.add(new Student(2018212644, "倩倩", 89, "wu","受"));
        }

        @SuppressWarnings("unchecked")
        public static void sort()	{
            Collections.sort(students, new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    int one = ((Student)o1).getScore();
                    int two = ((Student)o2).getScore();
                    return one - two;
                }
            });
        }
        public static void main(String[] args) {
            init();
//            sort();


         Collections.sort(students);
         for(Student s : students) {
              System.out.println("学号:" + s.getId() + " 姓名:" + s.getName() + " Score:" + s.getScore() + " habby:"+ s.getHabby() + " 性别:" + s.getSex());
            }

            System.out.println("-----------");

        }
    }
    
  class Student implements Comparable<Student> {
        private int id;
        private String name;
        private int score;
        private String habby;
        private String sex;
        public Student(int id, String name, int score,String habby,String sex) {
            setId(id);
            setName(name);
            setScore(score);
            setHabby(habby);
            setSex(sex);



        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getScore() {
            return score;
        }
        public void setScore(int score) {
            this.score = score;
        }
        public String getHabby(){
            return habby;
        }
        public void setHabby(String habby){
            this.habby= habby;
        }
        public String getSex(){
            return sex;
        }
        public void setSex(String sex){
            this.sex= sex;

        }

        @Override
        public int compareTo(Student o) {
            return o.getId()-this.id;
        }
    }

