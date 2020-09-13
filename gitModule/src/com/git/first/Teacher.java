package com.git.first;

/**
 * @ClassName Teacher
 * @Description TODO
 * @Author yahao
 * @Date 2020/9/13 20:54
 * @Version 1.0
 */
public class Teacher {
    public static final String FIRSTGIT_NAME = "第一次用git开发";
    private String student;
    private String name;
    private String age;

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static void main(String[] args){
        say();
        System.out.println(FIRSTGIT_NAME);
    }
    public static void say(){
        System.out.println("这次提交了一些属性");
    }
}
