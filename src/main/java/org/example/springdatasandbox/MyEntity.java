package org.example.springdatasandbox;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
@Table(name = "my_table")
public class MyEntity {
    @Id
    private Long id;

    @Column
    private String name;
}
