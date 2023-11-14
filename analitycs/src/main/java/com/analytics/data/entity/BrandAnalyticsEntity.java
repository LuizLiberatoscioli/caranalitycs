package com.analytics.data.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "brand_analytics")

public class BrandAnalyticsEntity {

	  public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Long getPosts() {
		return posts;
	}

	public void setPosts(Long posts) {
		this.posts = posts;
	}

	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    private String brand;

	    private Long posts;

}
