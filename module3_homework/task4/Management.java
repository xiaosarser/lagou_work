package module_homework.task4;
/*
操作学生信息类
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Management {
    static ArrayList<StudentInfo> StudentList =new ArrayList<StudentInfo>();
    public void add(ArrayList<StudentInfo> StudentList)
    {
        System.out.println("增加");

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学号");
        String num=sc.nextLine();
        System.out.println("请输入姓名");
        String name=sc.nextLine();
        System.out.println("请输入年龄");
        int age=sc.nextInt();
        StudentInfo s=new StudentInfo(num,name,age);
        StudentList.add(s);
        System.out.println("学生信息添加成功！");
        allInfo(StudentList);
        sc.close();
    }
    public void delete(ArrayList<StudentInfo> StudentList)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学号");
        String num=sc.nextLine();
        for(StudentInfo e:StudentList)
        {
            if(e.getNumber()==num)
            {
                StudentList.remove(e);
                System.out.println("学生信息删除成功！");
                break;
            }
        }
        allInfo(StudentList);
        sc.close();
    }
    public void replace(ArrayList<StudentInfo> StudentList)
    {
        System.out.println("修改学生的信息");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学号");
        String num=sc.nextLine();
        System.out.println("请输入姓名");
        String name=sc.nextLine();
        System.out.println("请输入年龄");
        int age=sc.nextInt();
        for(StudentInfo e:StudentList)
        {
            if(e.getNumber()==num)
            {
               e.setName(name);
               e.setAge(age);
               break;
            }
        }
        allInfo(StudentList);
        sc.close();
    }
    public void find(ArrayList<StudentInfo> StudentList)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学号");
        String num=sc.nextLine();
        for(StudentInfo e:StudentList)
        {
            if(e.getNumber()==num)
            {
               System.out.println("学生的学号为"+num+"姓名为"+e.getName()+"年龄为"+e.getAge());
            }
        }
        sc.close();
    }
    public void allInfo(ArrayList<StudentInfo> StudentList)
    {
        for(StudentInfo e:StudentList)
        {
            System.out.println("学生的学号为"+e.getNumber()+"姓名为"+e.getName()+"年龄为"+e.getAge());
        }
    }

}
