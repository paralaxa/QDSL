package sk.stopangin.specification;

import javax.persistence.*;

@Entity
public class Usr {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    private String username;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
