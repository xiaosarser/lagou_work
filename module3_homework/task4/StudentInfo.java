package module_homework.task4;
/*
学生信息类
 */

public class StudentInfo {
    private String number;
    private String name;
    private int age;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StudentInfo(String number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }
}
