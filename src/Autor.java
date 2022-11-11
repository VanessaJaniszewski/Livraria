import java.util.Calendar;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Autor {
	
	public Autor() {};
	public Autor(String name, Calendar birth) {
		super();
		this.name = name;
		this.birth = birth;
	}
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column
	private String name;
	@Column
	private Calendar birth;
	@OneToMany(targetEntity = Livro.class, mappedBy = "autor_id", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Livro> Livro;


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getBirth() {
		return birth;
	}
	public void setBirth(Calendar birth) {
		this.birth = birth;
	}
	
	public List<Livro> getLivro() {
		return Livro;
	}
	public void setLivro(List<Livro> livro) {
		this.Livro = livro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(birth, id, Livro, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(birth, other.birth) && Objects.equals(id, other.id)
				&& Objects.equals(Livro, other.Livro) && Objects.equals(name, other.name);
	}

	
	@Override
	public String toString() {
		return "Autor [id=" + id + ", name=" + name + ", birth=" + birth + ", livro=" + Livro + "]";
	}

	
}
