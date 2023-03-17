import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);

        System.out.println("Indique el nombre del usuario");
        String name= sc.nextLine();
        System.out.println("Indique el saldo de la cuenta");
        double sal= sc.nextDouble();

        Banco objBanco=new Banco(name,sal);

        System.out.println("El nombre del usuario es "+objBanco.getNombre()+" y su saldo es "+objBanco.getSaldo());

    }
}