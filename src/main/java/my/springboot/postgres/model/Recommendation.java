package my.springboot.postgres.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Саша on 18.05.2017.
 */
@Entity
@Table(name="recommendations")
public class Recommendation implements Serializable {
    @Id
    @GeneratedValue(generator = "recommendations_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "recommendations_seq", sequenceName = "public.recommendations_seq", allocationSize = 1)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String description;
    @NotNull
    @Column(name = "user_id")
    private Integer userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
