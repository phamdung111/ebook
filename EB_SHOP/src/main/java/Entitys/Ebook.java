package Entitys;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Ebook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String isbn;
	private	String description;
	@Temporal(TemporalType.DATE)
	private Date publication;
	private	int page;
	private Long price;
	private int quantity;
	private boolean delete;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_author")
	private	Author author;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_publisher")
	private Publisher publisher;
	
	@OneToOne(mappedBy = "ebook")
	private OrdersDetails ordersDetails;

	public Ebook() {
		super();
	}

	public Ebook(Long id, String title, String isbn, String description, Date publication, int page, Long price,
			int quantity, boolean delete, Author author, Publisher publisher, OrdersDetails ordersDetails) {
		super();
		this.id = id;
		this.title = title;
		this.isbn = isbn;
		this.description = description;
		this.publication = publication;
		this.page = page;
		this.price = price;
		this.quantity = quantity;
		this.delete = delete;
		this.author = author;
		this.publisher = publisher;
		this.ordersDetails = ordersDetails;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPublication() {
		return publication;
	}

	public void setPublication(Date publication) {
		this.publication = publication;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isDelete() {
		return delete;
	}

	public void setDelete(boolean delete) {
		this.delete = delete;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public OrdersDetails getOrdersDetails() {
		return ordersDetails;
	}

	public void setOrdersDetails(OrdersDetails ordersDetails) {
		this.ordersDetails = ordersDetails;
	}

	
}
