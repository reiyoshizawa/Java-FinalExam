package Day2;

public class Dog {

    String name;
    int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Dog(String name){
        this.name = name;
        this.age = age;
    }

    public String getUserInfo(){
        return this.name + this.age;
    }

    public void setUserInfo(String name, int age){
        this.name = name;
        this.age = age;
    }

}
