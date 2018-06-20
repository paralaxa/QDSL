package sk.stopangin.specification;

import javax.persistence.*;

@Entity
public class Ordr {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String uname;
    private String description;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userId")
    private Usr usr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Usr getUsr() {
        return usr;
    }

    public void setUsr(Usr usr) {
        this.usr = usr;
    }
}
