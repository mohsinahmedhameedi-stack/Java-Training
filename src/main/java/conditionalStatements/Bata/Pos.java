package conditionalStatements.Bata;
import org.w3c.dom.ls.LSOutput;

import javax.security.auth.x500.X500PrivateCredential;
import java.util.Scanner;
public class Pos {

    int formalShoes;
    int casualShoes;
    int sneakers;
    int ladiesSandals;
    int schoolShoes;
    int shoePolish;
    int polishBrush;
    private Scanner input;

    public Pos (Scanner input, int formalShoes, int casualShoes, int sneakers, int ladiesSandals, int schoolShoes, int shoePolish, int polishBrush) {
        this.input = input;
        this.formalShoes = formalShoes;
        this.casualShoes = casualShoes;
        this.sneakers = sneakers;
        this.ladiesSandals = ladiesSandals;
        this.schoolShoes = schoolShoes;
        this.shoePolish = shoePolish;
        this.polishBrush = polishBrush;
    }

    void calculateBill () {
        int count = 0;
        double Price = 0;
        double totalPrice = 0;
        double discount = 0;
        System.out.println("Welcome to the Bata Store");
        System.out.println("What you're having today");
        System.out.println();
         System.out.println("1. formalShoes\n2. casualShoes\n3. sneakers\n4. ladiesSandals\n5. schoolShoes\n6. shoePolish\n7. polishBrush");
         System.out.println("Select your choice:");
         int choice = input.nextInt();
         if (choice == 1){
             System.out.println("Enter the count of formal Shoes you want: ");
             count = input.nextInt();
             Price = formalShoes * count;

         } else if (choice == 2){
             System.out.println("Enter the count of Casual Shoes you want: ");
             count = input.nextInt();
             Price = casualShoes * count;

         } else if (choice == 3) {
             System.out.println("Enter the count of Sneakers you want: ");
             count = input.nextInt();
             Price = sneakers * count;

         } else if (choice == 4) {
             System.out.println("Enter the count of Ladies Sandals you want: ");
             count = input.nextInt();
             Price = ladiesSandals * count;

         } else if (choice == 5) {
             System.out.println("Enter the count of School Shoes you want ");
             count = input.nextInt();
             Price = schoolShoes * count;

         } else if (choice == 6) {
             System.out.println("Enter the count of Shoe Polish you want: ");
             count = input.nextInt();
             Price = shoePolish * count;

         } else if (choice == 7) {
             System.out.println("Enter the count of Polish Brush you want: ");
             count = input.nextInt();
             Price = polishBrush * count;
         }
            else {
             System.out.println("Invalid Choice");
         }
         if (Price>10000 && Price<20000){
             discount = Price * 0.10;
             totalPrice = Price - discount;
             System.out.println("your bill after 10% discount: "+totalPrice);

         } else if (Price>20000 && Price<30000){
             discount = Price * 0.20;
             totalPrice = Price - discount;
             System.out.println("Your bill after 20% discount: "+totalPrice);

         } else{totalPrice = Price;
             System.out.println("your total bill without discount: "+totalPrice);
         }
     }
}



