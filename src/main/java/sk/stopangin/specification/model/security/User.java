package sk.stopangin.specification.model.security;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 6441513930357796625L;

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "username", length = 50)
    private String username;

    @Column(name = "real_name", length = 50)
    private String name;

    @Column(name = "password", length = 100)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "user_authority",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_id", referencedColumnName = "id")})
    private Set<Authority> authorities = new HashSet<>();

    @Column(name = "ios")
    private boolean ios;

    @Column(name = "default_delivery_address", length = 500)
    private String defaultDeliveryAddress;

    @Column(name = "default_billing_address", length = 500)
    private String defaultBillingAddress;

    @Column(name = "phone_number", length = 100)
    private String phoneNumber;

    @Column(name = "addresses")
    private String addresses;

    @Column(name = "country", length = 20)

    private String country;

    @Column(name = "lang", length = 20)

    private String language;

    @Column(name = "email_confirmation")

    private boolean emailConfirmation;

    @Column(name = "enabled")

    private boolean enabled;

    @Column(name = "operational")

    private boolean operational = true;

    @Column(name = "parent_user")
    private Long parentUser;

    @Column(name = "can_pay_online")

    private boolean canPayOnline;

    @Column(name = "maintenance_login_privileges")
    private boolean maintenanceLoginPrivileges;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<VerificationToken> verificationTokens = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String firstname) {
        this.name = firstname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }

    public String getDefaultDeliveryAddress() {
        return defaultDeliveryAddress;
    }

    public void setDefaultDeliveryAddress(String defaultDeliveryAddress) {
        this.defaultDeliveryAddress = defaultDeliveryAddress;
    }

    public String getDefaultBillingAddress() {
        return defaultBillingAddress;
    }

    public void setDefaultBillingAddress(String defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddresses() {
        return addresses;
    }

    public void setAddresses(String addresses) {
        this.addresses = addresses;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Set<VerificationToken> getVerificationTokens() {
        return verificationTokens;
    }

    public void setVerificationTokens(Set<VerificationToken> verificationTokens) {
        this.verificationTokens = verificationTokens;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public boolean getIos() {
        return ios;
    }

    public void setIos(boolean ios) {
        this.ios = ios;
    }

    public boolean isEmailConfirmation() {
        return emailConfirmation;
    }

    public void setEmailConfirmation(boolean emailConfirmation) {
        this.emailConfirmation = emailConfirmation;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Long getParentUser() {
        return parentUser;
    }

    public void setParentUser(Long parentUser) {
        this.parentUser = parentUser;
    }

    public boolean getOperational() {
        return operational;
    }

    public void setOperational(boolean operational) {
        this.operational = operational;
    }

    public boolean getCanPayOnline() {
        return canPayOnline;
    }

    public void setCanPayOnline(boolean canPayOnline) {
        this.canPayOnline = canPayOnline;
    }

    public boolean isMaintenanceLoginPrivileges() {
        return maintenanceLoginPrivileges;
    }

    public void setMaintenanceLoginPrivileges(boolean maintenanceLoginPrivileges) {
        this.maintenanceLoginPrivileges = maintenanceLoginPrivileges;
    }
}