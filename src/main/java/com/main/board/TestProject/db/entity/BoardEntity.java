package com.main.board.TestProject.db.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Table(name = "board")
@Entity
@Getter
@Setter
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "userId", nullable = false)
    private UserEntity userId;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "content", nullable = false, length = 4000)
    private String content;

    @Column(name = "count", nullable = false)
    private Integer count;

    @Column(name = "createDate", nullable = false)
    private Instant createDate;

    @Column(name = "modifyDate")
    private Instant modifyDate;
}