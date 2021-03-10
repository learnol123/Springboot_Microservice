package com.priyanka.microservices.currecncyexchangeservice;


import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EXCHANGE")
public class ExchangeValue {
	
	@Id
	private Long id;
	
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;
	
	@Column(name="conversion_val")
	private Double conversionMultiple;
	private int port;
	
	public ExchangeValue() {
		
	}
	

	
	public ExchangeValue(long id, String from, String to, double conversionMultiple) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple= conversionMultiple;
	}


	public Long getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public Double getConversionMultiple() {
		return conversionMultiple;
	}
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}