package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name="tweets")
public class Tweet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id",unique=true, nullable = false)
	private Integer id;
	
	@Column(name="userid", unique=true, nullable=false)
	private Integer userid;
	
	@Column(name="tweet", nullable=false)
	private String tweet;
	
	public Integer getId() {
		return id; 
	}
	
	public void setId(Integer id) {
		this.id = id; 
	}
	
	public Integer getUserId() {
		return userid;
	}
	
	public void setUserId(Integer userid) {
		this.userid = userid;
	}
	
	public String getTweet() {
		return tweet;
	}
	
	public void setTweet(String tweet) {
		this.tweet = tweet;
	}
	
	
}
