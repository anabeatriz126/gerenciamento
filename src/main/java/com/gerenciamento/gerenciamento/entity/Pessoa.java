package com.gerenciamento.gerenciamento.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "pessoas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 50)
    private String nome;

    @Size(max = 50)
    private String sobrenome;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    private Date dataAtual;

    @NotBlank
    @Size(max = 20)
    private String login;

    @NotBlank
    @Size(max = 20)
    private String senha;

    private String phone;

}
