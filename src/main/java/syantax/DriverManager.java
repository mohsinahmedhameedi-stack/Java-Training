package syantax;

public class DriverManager {
    public static void main(String[] args) {
        SyntaxJava student1 = new SyntaxJava(23,"mohsin",231);
        student1.printDetails();

        SyntaxJava student2 = new SyntaxJava(23,"zain",453);
        student2.printDetails();

        SyntaxJava student3 = new SyntaxJava(24,"Sufiyan",420);
        student3.printDetails();
    }
}
