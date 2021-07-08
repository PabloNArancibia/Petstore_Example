package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Pet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-30T04:00:03.965Z[GMT]")


public class Pet   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("category")
  private String category = null;

  /**
   * pet status
   */
  public enum StatusEnum {
    LIFE("life"),
    LIFE2("Life"),
    DEAD("dead"),
	DEAD2("Dead");
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("name")
  private String name = null;

  public Pet id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Pet category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   **/
  @Schema(example = "Cat", description = "")
  
    public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Pet status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * pet status
   * @return status
   **/
  @Schema(description = "pet status")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Pet name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "Canelita", description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pet pet = (Pet) o;
    return Objects.equals(this.id, pet.id) &&
        Objects.equals(this.category, pet.category) &&
        Objects.equals(this.status, pet.status) &&
        Objects.equals(this.name, pet.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category, status, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
