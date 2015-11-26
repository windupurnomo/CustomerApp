package com.sciencom.training.customerapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	private String id;
	private String name;
	private String email;
	private String phone;
	
//	@OneToMany(mappedBy="customer", fetch = FetchType.LAZY, cascade={CascadeType.ALL})
//	private List<Pemesanan> orders;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public List<Pemesanan> getOrders() {
//		return orders;
//	}
//	public void setOrders(List<Pemesanan> orders) {
//		this.orders = orders;
//	}
	
	
}
