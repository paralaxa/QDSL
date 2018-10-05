package sk.stopangin.specification.model.security;

public enum AuthorityName {

    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_DOCTOR("ROLE_DOCTOR"),
    ROLE_LAB("ROLE_LAB"),
    ROLE_ASSISTANT("ROLE_ASSISTANT"),
    ROLE_OPERATOR("ROLE_OPERATOR"),
    ROLE_CUSTOMER_CARE("ROLE_CUSTOMER_CARE");

    AuthorityName(String value) {
        this.textValue = value;
    }

    private String textValue;

    public String value() {
        return textValue;
    }

    public static AuthorityName valueOfCaseInsensitive(String value) {
        for (AuthorityName s : AuthorityName.values()) {
            if (s.value().equalsIgnoreCase(value)) {
                return s;
            }
        }

        throw new IllegalArgumentException("No value found for parameter 'value': " + value);
    }

    public static AuthorityName ordinalValue(int order) {
        try {
            return AuthorityName.values()[order - 1];
        } catch (Exception e) {
            throw new IllegalArgumentException("No value found for parameter 'order': " + order + " (" + e + ")");
        }
    }

    public static AuthorityName ordinalValue(String order) {
        try {
            return AuthorityName.values()[Integer.parseInt(order) - 1];
        } catch (Exception e) {
            throw new IllegalArgumentException("No value found for parameter 'order': " + order + " (" + e + ")");
        }
    }
}