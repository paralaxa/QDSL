package sk.stopangin.specification.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "chunk_upload")
public class ChunkUpload implements Serializable {

	private static final long serialVersionUID = -6742792336041519126L;

	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name = "token_hash")
    private String tokenHash;

    @Column(name = "counter")
    private int counter;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTokenHash() {
		return tokenHash;
	}

	public void setTokenHash(String tokenHash) {
		this.tokenHash = tokenHash;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
    
    
    
    
    
    
    
    
    

}