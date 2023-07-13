import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        if(x>=0 && x<=4)
        {
            System.out.println(menu[x]);
        } 
        else System.out.println("Invalid");       
    }

}
