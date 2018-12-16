package studyone.Three;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        List<String> nList=new ArrayList<>();
        nList.add("姓名：向康");
        nList.add("班级：4班");
        nList.add("学号：2018212639");
        nList.add("性别：男");
        nList.add("爱好：无");
        nList.add(3,"专业：自动化");//替换
        nList.set(3,"年龄：18");//替换，从0开始

        Iterator<String> it=nList.iterator();  //遍历
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }

           // for (String name:nList){
           //     System.out.println(name);
                
         //   }


    }
}
