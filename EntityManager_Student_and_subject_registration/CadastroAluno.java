package pr.senac.br.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

import pr.senac.br.modelo.Aluno;
import pr.senac.br.modelo.Disciplina;

public class CadastroAluno {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("prova2");
		EntityManager manager = factory.createEntityManager();
		
		ArrayList<Disciplina> disciplinas = new ArrayList();
		ArrayList<Disciplina> disciplinas2 = new ArrayList();
		ArrayList<Disciplina> disciplinas3 = new ArrayList();
		Disciplina disc1 = new Disciplina("Banco de dados", 40, 75, 80, 80, 70);
		Disciplina disc2 = new Disciplina("Algoritimos", 60, 60, 70, 80, 60);
		Disciplina disc3 = new Disciplina("Programação", 60, 70, 70, 80, 80);
		Disciplina disc4 = new Disciplina("Algoritimos", 60, 70, 70, 80, 80);
		Disciplina disc5 = new Disciplina("Programação", 60, 70, 75, 65, 60);
		Disciplina disc6 = new Disciplina("Algoritimos", 60, 20, 30, 30, 20);
		
		disciplinas.add(disc1);
		disciplinas.add(disc2);
		disciplinas.add(disc3);
		disciplinas2.add(disc4);
		disciplinas2.add(disc5);
		disciplinas3.add(disc6);
		
		manager.getTransaction().begin();
		manager.persist(disc1);
		manager.persist(disc2);
		manager.persist(disc3);
		manager.persist(disc4);
		manager.persist(disc5);
		manager.persist(disc6);
		manager.getTransaction().commit();
		
		Aluno aluno1 = new Aluno("111", "Marcos", "m@gmail.com", "M", disciplinas);
		Aluno aluno2 = new Aluno("222", "Maria", "ma@gmail.com", "F", disciplinas2);
		Aluno aluno3 = new Aluno("333", "João", "j@gmail.com", "M", disciplinas3);
		
		manager.getTransaction().begin();
		manager.persist(aluno1);
		manager.persist(aluno2);
		manager.persist(aluno3);
		manager.getTransaction().commit();
		
		manager.remove(aluno3);
		aluno2.setEmail("maria@gmail.com");
		
		manager.getTransaction().begin();
		manager.persist(aluno2);
		manager.getTransaction().commit();
		
		Query QuantAlunos = (Query) manager.createQuery("select count(a) from Aluno a");
		Long count = (Long)((javax.persistence.Query) QuantAlunos).getSingleResult();
		System.out.println(count);
		manager.close();
		
		List<Aluno> ListarAlunos = (List<Aluno>) manager.createQuery("select a from Aluno a");
		System.out.println(ListarAlunos);
		manager.close();
		
		List<Aluno> ListarAlunosF = (List<Aluno>) manager.createQuery("select a from Aluno a where sexo = 'F'");
		System.out.println(ListarAlunosF);
		manager.close();
		
		List<Aluno> ListarAlunosM = (List<Aluno>) manager.createQuery("select a from Aluno a where sexo = 'M'");
		System.out.println(ListarAlunosM);
		manager.close();
	}
}
