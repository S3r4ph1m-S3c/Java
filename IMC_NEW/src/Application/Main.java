package Application;
import java.util.Scanner;

import Entities.Calc;
import Entities.Health;
import Entities.Person;


public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		
		
		
		sc = new Scanner(System.in);
		System.out.println("\n Enter with your name: ");
		String name = sc.next();
		System.out.println("\n Enter with your age: ");
		int age = sc.nextInt();
		System.out.println("\n Enter with your height: ");
		double height = sc.nextDouble();
		System.out.println("\n Enter with your weight: ");
		double weight = sc.nextDouble();
		
		Person objPessoa = new Person(name, age);
		Health objSaude = new Health(height, weight);
      
        Calc objCalc = new Calc(objSaude.getHeight(), objSaude.getWeight());
        
        System.out.println("|-------------------------------------|");
        System.out.println("Resultado Final:\n");
        System.out.println("Dados do Cliente: ");
        System.out.println("Nome: " + objPessoa.getName());
        System.out.print("Idade: ");
        System.out.println(objPessoa.getAge());
        System.out.print("Altura: ");
        System.out.println(objSaude.getHeight());
        System.out.print("Peso: ");
        System.out.println(objSaude.getWeight());
        System.out.print("Resultado Final: ");
        System.out.print("Status = " + objCalc.getStatus());
        System.out.print(" | Calculo do Peso = ");
        System.out.print(objCalc.getCalc());
        
        
        
    }
    
}