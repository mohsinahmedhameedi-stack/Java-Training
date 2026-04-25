package syantax;

public class SyntaxJava {
    int age;
    String name;
    int id;
    SyntaxJava(int age, String name, int id)
    {
        System.out.println("object Created");
        this.age = age;
        this.name = name;
        this.id = id;
    }

    //------------------------------------> this is the method here i define the name as camle case
    public void printDetails()
    {
        System.out.println("my name is: "+name);
        System.out.println("my age is: "+age);
        System.out.println("my id is: "+id);
    }

}
