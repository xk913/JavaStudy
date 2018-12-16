package studyone.youxi;

public class Main {

    /**
     * Java 四大特性
     * 抽象 封装    重点： 继承 多态
     *
     *
     * 重写（父子：重写父亲方法） 重载（当前类：方法名相同，体现在参数不同）
     *
     * 链接:https://pan.baidu.com/s/1FZetnxYT03u0pFQiClQnPA  密码:ti98
     *
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("xk");
        student.setAge(10);
        student.setSex("man");
        student.setNum("2019xxx");
        student.setSchoolAddr("cqupt");

        System.out.println(student.toString());
    }


}
