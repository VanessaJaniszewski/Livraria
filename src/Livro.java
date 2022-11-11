

import java.util.Calendar;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Livro {
	

	public Livro(String nome, String autor, Calendar data) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.data = data;}
	
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	private String nome;
	@Column
	private String autor;
	
	@Temporal(TemporalType.DATE)
	@Column
	private Calendar data;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	@Override
	public int hashCode() {
		return Objects.hash(autor, data, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(data, other.data)
				&& Objects.equals(nome, other.nome);
	}
	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", autor=" + autor + ", data=" + data + "]";
	}
	
	
	

}
