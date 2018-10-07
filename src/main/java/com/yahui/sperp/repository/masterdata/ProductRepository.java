package com.yahui.sperp.repository.masterdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yahui.sperp.domain.Product;

public interface ProductRepository extends JpaRepository<Product, String>{

}
