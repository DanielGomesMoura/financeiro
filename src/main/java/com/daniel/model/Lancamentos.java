package com.daniel.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Lancamentos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 20, nullable = false)
    private String mes;

    @Column(length = 10, nullable = false)
    private String ano;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;
    
    @Column(length = 200, nullable = false)
    private String descricao;
    
    private BigDecimal valor;
    
     @Column(length = 10, nullable = false)
    private String tipo;  //entrada ou saida
    
}
