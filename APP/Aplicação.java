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
		System.out.println(" pessoa Fisica ---------------------- (1) ");
		System.out.println(" pessoa Juridica -------------------- (2) ");
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------");
		
		int pessoa = sc.nextInt();
		System.out.println();
		
		
		if(pessoa == 1) {
			// pessoa Fisica cad
			System.out.println("---------------------------PESSOA-FISICA-----------------------------------");
			System.out.println();
			System.out.println("digite seu nome");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.print("digite seu CPF:");
			String cpf = sc.next();
			System.out.print("digite sua data de nacimento:");
			Date dataNascimento = std.parse(sc.next());
			
			double limiteDeCredito = 0;// há definir
			
			sc.nextLine();
			System.out.println("Endereço ------------------------- ");
			
			System.out.println("Logradouro: ");
			String logradouro = sc.nextLine();
			System.out.println("Numero da casa");
			String numero = sc.nextLine();
			System.out.println("Bairro");
			String bairro = sc.nextLine();
			System.out.println("Municipio");
			String municipio = sc.nextLine();
			System.out.println("CEP");
			String cep = sc.nextLine();
		
			PessoaFisica PF = new PessoaFisica(nome, new Endereço(logradouro, numero, bairro, municipio, cep), limiteDeCredito, cpf, dataNascimento);
			
			System.out.println("CADASTRO CONCLUIDO");
		}
		else {
			// pessoa Pessoa cad
			System.out.println("---------------------------PESSOA-JURIDICA-----------------------------------");
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
			
			System.out.println("... Endereço ------------------------- ");
			
			System.out.println("Logradouro: ");
			String logradouro = sc.nextLine();
			System.out.println("Numero da casa");
			String numero = sc.nextLine();
			System.out.println("Bairro");
			String bairro = sc.nextLine();
			System.out.println("Municipio");
			String municipio = sc.nextLine();
			System.out.println("CEP");
			String cep = sc.nextLine();
			
			PessoaJuridica PJ = new PessoaJuridica(nome, new Endereço(logradouro, numero, bairro, municipio, cep), limiteDeCredito, cnpj, inscricaoEstadual);
			
			System.out.println("CADASTRO CONCLUIDO");
	
		}
		
	    }
	}
	

	