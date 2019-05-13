package hard.xk.com;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Student[] stu = new Student[100];


    public static void main(String[] args) {
        System.out.println("唱跳 rap 篮球班级！");
        System.out.println("1 查看学生信息");
        System.out.println("2 添加学生信息");
        System.out.println("3 删除学生信息");
        System.out.println("4 修改学生信息");
        System.out.println("5 退出");
        System.out.println("请输入您的选择：");
        // 键盘输入
        Scanner sc = new Scanner(System.in);
        String choiceString = sc.nextLine();
        // 用switch实现选择
        ArrayList<Student> array = new ArrayList<>();
        switch (choiceString) {
            case "1":
                // 查看学生信息

                findAllStudent(array);
                break;
            case "2":
                // 添加学生信息
                addStudent(array);
                break;
            case "3":
                // 删除学生信息
                delectStudent(array);
                break;
            case "4":
                // 修改学生信息
                updateStudent(array);
                break;
            case "5":
                // 退出
                System.out.println("谢谢您的使用！");
                System.exit(0);
                break;
            default:
                System.out.println("您输入的不正确，请重新输入！");
                break;
        }
        //遍历

        String s=stu.toString();

        for (int i = 0; i < array.size(); i++) {

            System.out.println(array.get(i));
        }
    }

    //查询蔡徐坤内容！
    public static void findAllStudent(ArrayList<Student> array) {

        if (array.size() == 0) {
            System.out.println("不好意思，目前没有可供查询的学生信息");
            // \t就是一个tab键的位置
        } else {
            System.out.println("学号\t姓名\t成绩");
            for (int x = 0; x < array.size(); x++) {
                Student s = array.get(x);
                System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getScore());
            }
        }


    }

    //添加一个蔡徐坤
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("请输入学生学号：");
            id = sc.nextLine();
            boolean flag = false;
            for (int x = 0; x < array.size(); x++) {
                Student s = array.get(x);
                if (s.getId().equals(id)) {
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                System.out.println("您输入的学号已经被占用，请重新输入！");
            } else {
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();

        System.out.println("请输入学生成绩：");
        int score = sc.nextInt();


        Student s = new Student();
        // 返回学生信息
        s.setId(id);
        s.setName(name);
        s.setScore(score);

        // 将学生信息作为元素添加到集合对象

        array.add(s);

        // 给出提示
        System.out.println("添加学生信息成功！");
    }


    //删除一个蔡徐坤
    public static void delectStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除学生的学号：");
        String id = sc.nextLine();
        int index = -1;
        for (int x = 0; x < array.size(); x++) {
            Student s = array.get(x);
            if (s.getId().equals(id)) {
                index = x;
                break;
            }
        }
        if (index == -1) {
            System.out.println("您输入的学号不存在！");
        } else {
            array.remove(index);
            System.out.println("删除成功！");
        }
    }

    //修改一个蔡徐坤
    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改学生信息的学号：");
        String id = sc.nextLine();
        int index = -1;
        for (int x = 0; x < array.size(); x++) {
            Student s = array.get(x);
            if (s.getId().equals(id)) {
                index = x;
                break;
            }
        }
        if (index == -1) {
            System.out.println("您要修改的学号不存在！");
        } else {
            System.out.println("请输入新的姓名：");
            String name = sc.nextLine();
            System.out.println("请输入新的成绩：");
            int score = sc.nextInt();

            Student s = new Student();
            s.setName(name);
            s.setScore(score);


            //修改集合中的学生对象
            array.set(index, s);
            System.out.println("修改学生信息成功！");
        }
    }



}

