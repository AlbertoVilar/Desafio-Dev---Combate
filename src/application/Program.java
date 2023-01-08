package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque:  ");
		int atack = sc.nextInt();
		System.out.println("Armadura: ");
		int armor = sc.nextInt();

		Champion champion1 = new Champion(name, life, atack, armor);

		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		sc.nextLine();
		System.out.print("Nome: ");
		String name2 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();
		System.out.print("Ataque:  ");
		int atack2 = sc.nextInt();
		System.out.println("Armadura: ");
		int armor2 = sc.nextInt();

		Champion champion2 = new Champion(name2, life2, atack2, armor2);

		System.out.print("Quantos turnos você deseja executar? ");

		int n = sc.nextInt();
		int turno = 1;
		
		do {

			System.out.println("Resultado do turno " + (turno) + ":");

			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);
			System.out.println();

			System.out.println(champion1.status());
			System.out.println(champion2.status());
			System.out.println();

		

			if (champion1.getLife() == 0 || champion2.getLife() == 0) {
				//System.out.println(champion1.status());
				//System.out.println(champion2.status());
				break;

			}

			turno++;
			n--;

		} while (n > 0);

		sc.close();
	}

}
