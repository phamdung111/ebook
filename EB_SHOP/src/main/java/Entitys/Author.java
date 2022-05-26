package Entitys;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstname;
	private	String lastname;
	private	int yearOfBirth;
	private	String description;
	private	String website;
	private String oganization;
	
	@OneToMany(mappedBy = "author")
	private List<Ebook> ebooks;
	
	
	
	public Author() {
		super();
	}
	public Author(Long id, String firstname, String lastname, int yearOfBirth, String description, String website,
			String oganization, List<Ebook> ebooks) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.yearOfBirth = yearOfBirth;
		this.description = description;
		this.website = website;
		this.oganization = oganization;
		this.ebooks = ebooks;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getOganization() {
		return oganization;
	}
	public void setOganization(String oganization) {
		this.oganization = oganization;
	}
	public List<Ebook> getEbooks() {
		return ebooks;
	}
	public void setEbooks(List<Ebook> ebooks) {
		this.ebooks = ebooks;
	}
	
}
