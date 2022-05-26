package Entitys;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class OrdersDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private	Long id;
	private	Long orderId;
	private	Long ebookId;
	private	int quantity;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_order")
	private Orders orders;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_ebook")
	private Ebook ebook;
	public OrdersDetails(Long id, Long orderId, Long ebookId, int quantity, Orders orders, Ebook ebook) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.ebookId = ebookId;
		this.quantity = quantity;
		this.orders = orders;
		this.ebook = ebook;
	}
	public OrdersDetails() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getEbookId() {
		return ebookId;
	}
	public void setEbookId(Long ebookId) {
		this.ebookId = ebookId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public Ebook getEbook() {
		return ebook;
	}
	public void setEbook(Ebook ebook) {
		this.ebook = ebook;
	}
	
}
