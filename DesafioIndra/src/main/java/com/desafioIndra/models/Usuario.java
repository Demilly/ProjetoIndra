package com.desafioIndra.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
   @SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
		
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   private long id;
   
   @NotEmpty
   private String nome;
   
   @NotEmpty
   private String senha;
		
}
