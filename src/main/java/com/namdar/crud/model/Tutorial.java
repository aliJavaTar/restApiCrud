package com.namdar.crud.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = Tutorial.TABLE_NAME)
public class Tutorial {
    protected static final String TABLE_NAME = "tutorials";
    private static final String TITLE = "title";
    private static final String DESCRIPTION = "description";
    private static final String PUBLISHED = "published";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank
    @Column(name = TITLE, nullable = false)
    private String title;
    @Column(name = DESCRIPTION)
    private String description;
    @Column(name = PUBLISHED)
    private boolean published;

    @Override
    public String toString() {
        return "Tutorial{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", published=" + published +
                '}';
    }
}
