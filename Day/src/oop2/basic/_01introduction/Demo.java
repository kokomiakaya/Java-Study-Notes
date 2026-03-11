package oop2.basic._01introduction;

public class Demo {
    public static void main(String[] args) {
        Employer employer = new Employer();
        employer.setAge(25);
        employer.setName("Jack");
        employer.setSalary(6000);
        employer.print();
    }
}

class Employer{
    private String name;
    private int age;
    private double salary;

    // 构造器

    public Employer(){

    }

//    public Employer(String name, int age, double salary) {
//        this.name = name;
//        this.age =age;
//        this.salary = salary;
//    }

    public  String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age >= 1 && age <= 100 ){
            this.age = age;
        }else{
            this.age = 18;
        }
    }

    public void setSalary(double salary){
        if (salary >= 1000 && salary <= 15000){
            this.salary = salary;
        }
        else {
            this.salary = 1000;
        }
    }

    public void print(){
        System.out.println("Name = " + this.name + ",Age =  " + this.age + ",Salary = " + this.salary);
    }

}
