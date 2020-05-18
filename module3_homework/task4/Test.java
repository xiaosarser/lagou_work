package module_homework.task4;
/*
测试类
 */

import module3_task1.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Management m=new Management();
        StudentInfo s1=new StudentInfo("20200202","张飞",30);
        StudentInfo s2=new StudentInfo("20200201","刘备",32);
        StudentInfo s3=new StudentInfo("20200101","刘备",33);
        Management.StudentList.add(s1);
        Management.StudentList.add(s2);
        Management.StudentList.add(s3);
        System.out.println("提示:输入0增加学生信息，输入1 删除特定学号的学生信息，输入2查找特定学号的" +
                "学生信息，输入3修改特定学号的学生信息，输入4遍历所有学生信息");

        Scanner sc=new Scanner(System.in);
        int select=sc.nextInt();
        switch (select)
        {
            case 0: m.add(Management.StudentList);break;
            case 1: m.delete(Management.StudentList);
            case 2: m.find(Management.StudentList);
            case 3:m.replace(Management.StudentList);
            case 4: m.allInfo(Management.StudentList);
        }
    }
}
