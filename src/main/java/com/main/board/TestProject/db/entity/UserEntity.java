package com.main.board.TestProject.db.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Table(name = "user", indexes = {
        @Index(name = "email", columnList = "email", unique = true)
})
@Entity
@Getter
@Setter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "password", nullable = false, length = 300)
    private String password;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "createDate", nullable = false)
    private Instant createDate;

    @Column(name = "modifyDate")
    private Instant modifyDate;
}