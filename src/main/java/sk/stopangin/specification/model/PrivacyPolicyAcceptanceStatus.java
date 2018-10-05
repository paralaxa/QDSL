package sk.stopangin.specification.model;

public enum PrivacyPolicyAcceptanceStatus {
    NOT_ANSWERED, // used only by DTO; represented in database as null value
    ACCEPTED,
    REFUSED,
    NOT_AVAILABLE // used by DTO; not persisted in database
}
