package com.ogeid.santanderDevWeek2023.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name= "td_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public Card getCard() {
        return card;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public List<News> getNews() {
        return news;
    }
}