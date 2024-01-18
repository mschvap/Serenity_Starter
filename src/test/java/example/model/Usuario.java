package example.model;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class Usuario {

    @JsonProperty("data.first_name")
    public String first_name;
    @JsonProperty("data.email")
    public String email;
    @JsonIgnoreProperties("data.id")
    public String id;
    @JsonIgnoreProperties("data.last_name")
    public String last_name;
    @JsonIgnoreProperties("data.avatar")
    public String avatar;

    public String getFirstName() {
        return first_name;
    }

    public String getEmail() {
        return email;
    }
}
