package com.kalyani.ecommerce.models;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "productName")
    private String productName;
    @Column(name = "productId")
    private String productId;
    @Column(name = "price")
    private Double price;
    @Column(name = "createDate")
    private Date createDate;
    @Column(name = "createdBy")
    private String createdBy;

    public Product() {
    }

    public Product(Long id, String productName, String productId, Double price, Date createDate, String createdBy) {
        this.id = id;
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.createDate = createDate;
        this.createdBy = createdBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
