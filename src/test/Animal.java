package test;

public class Animal {
    private int age ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayYourAge(){
        System.out.println("I'm "+this.age+" years old!!!");
    }
}

class Dog extends Animal{
    @Override
    public void sayYourAge() {
        System.out.println("I don't know my age");
    }
}
