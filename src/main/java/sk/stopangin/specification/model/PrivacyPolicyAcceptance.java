package sk.stopangin.specification.model;


import sk.stopangin.specification.model.security.User;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "privacy_policy_acceptance")
public class PrivacyPolicyAcceptance implements Serializable {

    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "privacy_policy_id")
    private PrivacyPolicy privacyPolicy;

    @Column(name = "date", nullable = false)
    private Long date;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private PrivacyPolicyAcceptanceStatus status;

    public PrivacyPolicyAcceptance() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PrivacyPolicy getPrivacyPolicy() {
        return privacyPolicy;
    }

    public void setPrivacyPolicy(PrivacyPolicy privacyPolicy) {
        this.privacyPolicy = privacyPolicy;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public PrivacyPolicyAcceptanceStatus getStatus() {
        return status;
    }

    public void setStatus(PrivacyPolicyAcceptanceStatus status) {
        this.status = status;
    }
}
