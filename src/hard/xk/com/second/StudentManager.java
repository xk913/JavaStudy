package hard.xk.com.second;

import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<Student>();

    static int amount = 3;

    public void show() {
        ArrayList<Student> students = (ArrayList<Student>) Tools
                .input("users.shanjin");
        if (students == null) {
            students = new ArrayList<Student>();
        }
        System.out.println("姓名\t年龄\t学号\t成绩");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) != null) {
                System.out.println(students.get(i).getStuName() + "\t"
                        + students.get(i).getStuAge() + "\t"
                        + students.get(i).getId() + "\t"
                        + students.get(i).getScore());
            }
        }
    }

    public void add() {
        ArrayList<Student> students = (ArrayList<Student>) Tools
                .input("users.shanjin");

        if (students == null) {
            students = new ArrayList<Student>();
        }
        Student s = new Student();
        System.out.println("输入学生的姓名：");
        String name = scanner.next();
        s.setStuName(name);
        System.out.println("输入学生的年龄：");
        int age = scanner.nextInt();
        s.setStuAge(age);
        System.out.println("输入学生的学号：");
        String id = scanner.next();
        s.setId(id);

        System.out.println("请输入成绩：");
        int score = scanner.nextInt();
        s.setScore(score);

        students.add(s);
        Tools.output(students, "users.shanjin");
    }

    public void delete() {
        ArrayList<Student> students = (ArrayList<Student>) Tools
                .input("users.shanjin");
        if (students == null) {
            students = new ArrayList<Student>();
        }
        System.out.println("请输入要修改的学号：");
        String isDelete = scanner.next();
        for (int j = 0; j < students.size(); j++) {

            if (students.get(j).getId().equals(isDelete)) {
                students.remove(students.get(j));
                System.out.println("删除成功！");
                break;
            }
        }
        Tools.output(students, "users.shanjin");

    }

    public void modify() {
        ArrayList<Student> students = (ArrayList<Student>) Tools
                .input("users.shanjin");
        if (students == null) {
            students = new ArrayList<Student>();
        }
        System.out.println("请输入查询对象的学号：");
        String isModify = scanner.next();
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(isModify)) {

                index = i;
            }
        }
        if (index != -1) {
            System.out.println("请修改");
            System.out.println("姓名：[" + students.get(index).getStuName()
                    + "](请修改):");
            String name = scanner.next();
            if (!name.equalsIgnoreCase("n")) {
                students.get(index).setStuName(name);
            }

            System.out.println("年龄：[" + students.get(index).getStuAge()
                    + "](请修改):");
            int age = scanner.nextInt();
            if (!name.equalsIgnoreCase("n")) {
                students.get(index).setStuAge(age);
            }
            System.out.println("成绩：[" + students.get(index).getScore()
                    + "](请修改):");
            int score = scanner.nextInt();
            if (!name.equalsIgnoreCase("n")) {
                students.get(index).setScore(score);
            }
        } else {
            System.out.println("没有查询到修改的对象");
        }
        Tools.output(students, "users.shanjin");

    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        StudentManager sm = new StudentManager();
        ArrayList<Student> students = (ArrayList<Student>) Tools
                .input("users.shanjin");
        if (students == null) {
            students = new ArrayList<Student>();
        }

        do {
            System.out.println("1 查看学生信息");
            System.out.println("2 添加学生信息");
            System.out.println("3 删除学生信息");
            System.out.println("4 修改学生信息");
            System.out.println("5 退出");

            System.out.print("请输入您的选择：");
            int num = scanner.nextInt();
            if (num == 1) {
                sm.show();

            } else if (num == 2) {
                sm.add();
                System.out.println("添加成功");

            } else if (num == 3) {
                sm.delete();

            } else if (num == 4) {
                sm.modify();

            } else if (num == 5) {
                System.out.println("退出成功");
                break;

            } else {

                System.out.println("ÊäÈëÓÐÎó£¡");
            }

        } while (true);

    }
}
