package pr.senac.br.jpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import pr.senac.br.modelo.Cliente;
import pr.senac.br.modelo.Conta;

public class AdicionaCliente {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opc = 0;
		
		System.out.println("\nDeseja cadastrar um cliente ? (1 - SIM | 2 - NÃO)");
		opc = leia.nextInt();
		
		leia.nextLine();
		
		while(opc == 1) {
			
			Cliente cliente = new Cliente();
			Conta conta = new Conta();
			
			System.out.println("\nDigite o CPF: ");
			cliente.setCpf(leia.nextLine());
			
			System.out.println("\nDigite o ano de nascimento: ");
			cliente.setAnoNascimento(leia.nextInt());
			
			leia.nextLine();
			
			System.out.println("\nDigite o nome: ");
			cliente.setNome(leia.nextLine());
			
			System.out.println("\nDigite o e-mail: ");
			cliente.setEmail(leia.nextLine());
			
			System.out.println("\nDigite o saldo: ");
			conta.setSaldo(leia.nextFloat());
			
			cliente.setConta(conta);
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("trabalho2");
			EntityManager manager = factory.createEntityManager();
			
			try {
				manager.getTransaction().begin();
				manager.persist(cliente);
				manager.getTransaction().commit();
			}catch (PersistenceException e) {
				System.out.println("Erro na inclusão do cliente " + cliente.toString());
				System.out.println(e.getMessage());
			}
			
			manager.close();
			
			System.out.println("\nDeseja cadastrar mais um cliente ? (1 - SIM | 2 - NÃO)");
			opc = leia.nextInt();
			
			leia.nextLine();
		}
		
		System.out.println("\nInforme um CPF existente: ");
		String cpfBusca = leia.nextLine();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("trabalho2");
		EntityManager manager = factory.createEntityManager();
		Cliente encontrada = manager.find(Cliente.class, cpfBusca);
		
		if(encontrada != null) {
			System.out.println(encontrada.toString());
			manager.close();
		}else {
			System.out.println("\nCPF inexistente !");
		}
	}
}
