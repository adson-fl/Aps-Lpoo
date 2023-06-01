package APP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entidade.Endereço;
import Entidade.PessoaFisica;
import Entidade.PessoaJuridica;

public class Aplicação {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat std = new SimpleDateFormat("dd/MM/yyyy");
		
	
		System.out.println("-------------------------- CADASTRO -------------------------------------------");
		System.out.println();
		System.out.print(" Digite (1) para pesoa fisica Digite (2) para pesssoa juridica digite: ");	
		
		int pessoa = sc.nextInt();
		System.out.println();
		
		
		if(pessoa == 1) {
			System.out.println("-------------------------- PESSOA FISICA ----------------------------------");
			System.out.println();
			System.out.println("digite seu nome");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.print("digite seu CPF:");
			String cpf = sc.next();
			System.out.print("digite sua data de nacimento:");
			Date dataNascimento = std.parse(sc.next());
			
			PessoaFisica PF = new PessoaFisica(nome, cpf, dataNascimento);
		}
		else {
			System.out.println("-------------------------- PESSOA JURIDICA ----------------------------------");
			System.out.println();
			System.out.print("digite seu nome da empresa:");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.print("digite seu CNPJ:");
			String cnpj = sc.next();
			double limiteDeCredito = 300.00;
			sc.nextLine();
			System.out.print("digite seu incrição estadual:");
			String inscricaoEstadual = sc.nextLine();
			
			PessoaJuridica PJ = new PessoaJuridica(nome, new Endereço(), limiteDeCredito, cnpj, inscricaoEstadual);
		}
		
	    }
	}
	

	