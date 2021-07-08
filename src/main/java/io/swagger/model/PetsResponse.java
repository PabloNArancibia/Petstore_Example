package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Pet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PetsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-30T04:00:03.965Z[GMT]")


public class PetsResponse   {
  @JsonProperty("pets")
  @Valid
  private List<Pet> pets = null;

  public PetsResponse pets(List<Pet> pets) {
    this.pets = pets;
    return this;
  }

  public PetsResponse addPetsItem(Pet petsItem) {
    if (this.pets == null) {
      this.pets = new ArrayList<Pet>();
    }
    this.pets.add(petsItem);
    return this;
  }

  /**
   * Get pets
   * @return pets
   **/
  @Schema(description = "")
      @Valid
    public List<Pet> getPets() {
    return pets;
  }

  public void setPets(List<Pet> pets) {
    this.pets = pets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PetsResponse petsResponse = (PetsResponse) o;
    return Objects.equals(this.pets, petsResponse.pets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PetsResponse {\n");
    
    sb.append("    pets: ").append(toIndentedString(pets)).append("\n");
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
