package pr.senac.br.jpa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import pr.senac.br.modelo.Tarefa;

/**
 * Classe que controla as Tarefas: permite cadastrar, alterar, excluir.
 * Faz o acesso ao banco de dados. 
 */

public class PersisteTarefa {

	private EntityManager manager;

	
	public PersisteTarefa() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
		manager = factory.createEntityManager();
	}

	
	public ArrayList<Tarefa> listarTodos() {
		return null;
	}

	
	public boolean cadastrarTarefa(Tarefa tarefa) {	
		Scanner entrada = new Scanner(System.in);
		try {
			manager.getTransaction().begin();
			manager.persist(tarefa);
			manager.getTransaction().commit();
			return true;
		}catch(PersistenceException e){
			System.out.println("Erro ao cadastrar tarefa: " + tarefa.toString());
			System.out.println(e.getMessage());
			return false;
		}
	}

	public Tarefa buscarTarefaCodigo(Long codigo) {		
		Tarefa encontrada = manager.find(Tarefa.class, codigo);
		
		return encontrada;
	}
	
	public boolean excluirTarefa(Long codigo) {
		try {
			manager.getTransaction().begin();
			Tarefa encontrada = manager.find(Tarefa.class, codigo);
			manager.remove(encontrada);
			manager.getTransaction().commit();
			return true;
		} catch(PersistenceException e) {
			System.out.println("Erro na exclusão da tarefa.");
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean concluirTarefa(Long codigo) {
		LocalDate dataConclusao = LocalDate.now();
		Tarefa encontrada = manager.find(Tarefa.class, codigo);
		if(encontrada.isFinalizado() == false) {
			encontrada.setFinalizado(true);
			encontrada.setDataConclusao(dataConclusao);
			manager.getTransaction().begin();
			manager.merge(encontrada);
			manager.getTransaction().commit();
			return true;
		} else {
			return false;
		}
	}
	

}