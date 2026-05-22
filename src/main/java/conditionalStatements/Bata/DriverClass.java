package conditionalStatements.Bata;
import java.util.Scanner;
public class DriverClass{

    public static void main(String[] args) {

                             
             Scanner input = new Scanner(System.in);
             Pos obj = new Pos(input, 8000, 7000, 5400, 3500, 4500, 500, 800);
             obj.calculateBill();
         }
}
