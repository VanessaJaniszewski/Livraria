

import java.util.Calendar;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Livro {
	

	public Livro(String nome, Calendar data) {
		super();
		this.nome = nome;
		this.data = data;}
	
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	private Integer id;
	@Column
	private String nome;
//	@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL, targetEntity = Autor.class)
//	@JoinColumn(name="autor_id", referencedColumnName = "id")
	@ManyToOne
	@JoinColumn(name="autor_id")
	private Autor autor_id;
	
	@Temporal(TemporalType.DATE)
	@Column
	private Calendar data;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Autor getAutor_id() {
		return autor_id;
	}
	public void setAutor_id(Autor autor_id) {
		this.autor_id = autor_id;
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(autor_id, data, id, nome);
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
		return Objects.equals(autor_id, other.autor_id) && Objects.equals(data, other.data)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}
	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", autor=" + autor_id + ", data=" + data + "]";
	}
	
	
	

}
