package pr.senac.br.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Aluno {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int matricula;
	
	@Column(nullable = false, length = 11, unique = true)
	private String cpf;
	
	@Column(nullable = false, length = 60)
	private String nome;
	
	@Column(nullable = false, length = 40)
	private String email;
	
	@Column(nullable = false, length = 1)
	private String sexo;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="cpf_aluno")
	private List <Disciplina> disciplinas;
	
	public Aluno() {
		
	}

	public Aluno(String cpf, String nome, String email, String sexo, List<Disciplina> disciplinas) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.disciplinas = disciplinas;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String toString() {
		return "Aluno [matricula=" + matricula + ", cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", sexo="
				+ sexo + "]";
	}
}
