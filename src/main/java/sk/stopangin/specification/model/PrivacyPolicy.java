package sk.stopangin.specification.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "privacy_policy")
public class PrivacyPolicy implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "version", nullable = false)
    private String version;

    @Column(name = "create_time", nullable = false)
    private Long createTime;

    @Type(type="text")
    @Column(name = "text_dentist_en")
    private String textDentistEn;

    @Type(type="text")
    @Column(name = "text_dentist_fr")
    private String textDentistFr;

    @Type(type="text")
    @Column(name = "text_dlp_en")
    private String textDlpEn;

    @Type(type="text")
    @Column(name = "text_dlp_fr")
    private String textDlpFr;

    @Column(name = "active", nullable = false)
    private Boolean active;

    public PrivacyPolicy() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getTextDentistEn() {
        return textDentistEn;
    }

    public void setTextDentistEn(String textDentistEn) {
        this.textDentistEn = textDentistEn;
    }

    public String getTextDentistFr() {
        return textDentistFr;
    }

    public void setTextDentistFr(String textDentistFr) {
        this.textDentistFr = textDentistFr;
    }

    public String getTextDlpEn() {
        return textDlpEn;
    }

    public void setTextDlpEn(String textDlpEn) {
        this.textDlpEn = textDlpEn;
    }

    public String getTextDlpFr() {
        return textDlpFr;
    }

    public void setTextDlpFr(String textDlpFr) {
        this.textDlpFr = textDlpFr;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
