package com.microservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Product.
 */

@Document(collection = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @NotNull
    @Field("p_name")
    private String p_name;

    @Field("description")
    private String description;

    @Field("p_price")
    private Double p_price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getp_name() {
        return p_name;
    }

    public Product p_name(String p_name) {
        this.p_name = p_name;
        return this;
    }

    public void setp_name(String p_name) {
        this.p_name = p_name;
    }

    public String getDescription() {
        return description;
    }

    public Product description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getp_price() {
        return p_price;
    }

    public Product p_price(Double p_price) {
        this.p_price = p_price;
        return this;
    }

    public void setp_price(Double p_price) {
        this.p_price = p_price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        if (product.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Product{" +
            "id=" + id +
            ", p_name='" + p_name + "'" +
            ", description='" + description + "'" +
            ", p_price='" + p_price + "'" +
            '}';
    }
}
