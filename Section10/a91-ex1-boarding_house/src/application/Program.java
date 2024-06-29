/*
A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo.
 */


package application;

import entities.BoardingHouse;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int totalRoom = 10;
        int rents;
        boolean ok = false;

        BoardingHouse[] bh = new BoardingHouse[totalRoom];

        System.out.print("How many rooms will be rented? ");
        rents = sc.nextInt();


        for (int i = 1; i <= rents; i++) {
            System.out.println();
            System.out.println("Next enter the name, email and room number (0-9)");
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            bh[roomNumber] = new BoardingHouse(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < bh.length; i++) {
            if (bh[i] != null) {
                System.out.println(i + ": " + bh[i]);
            }
        }

        sc.close();
    }
}
