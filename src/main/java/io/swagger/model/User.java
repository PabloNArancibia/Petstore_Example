package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-30T04:00:03.965Z[GMT]")


public class User   {
  @JsonProperty("username")
  private String username = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("role")
  private String role = null;

  @JsonProperty("mail")
  private String mail = null;

  @JsonProperty("birthday")
  private String birthday = null;

  public User username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  @Schema(example = "user1234", description = "")
  
    public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  @Schema(example = "pass1234", description = "")
  
    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   **/
  @Schema(example = "administrador", description = "")
  
    public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public User mail(String mail) {
    this.mail = mail;
    return this;
  }

  /**
   * Get mail
   * @return mail
   **/
  @Schema(example = "mail@m.com", description = "")
  
    public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public User birthday(String birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * Get birthday
   * @return birthday
   **/
  @Schema(example = "dd/mm/yy", description = "")
  
    public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.username, user.username) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.role, user.role) &&
        Objects.equals(this.mail, user.mail) &&
        Objects.equals(this.birthday, user.birthday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, role, mail, birthday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
