package org.example.springdatasandbox;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "my_table")
public class MyEntity {
    @Id
    private Long id;

    @Column
    private String name;
}
