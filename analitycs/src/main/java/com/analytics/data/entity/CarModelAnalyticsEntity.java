package com.analytics.data.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "car_model_analytics")

public class CarModelAnalyticsEntity {

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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

    private String model;

    private Long posts;

}

