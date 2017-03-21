package org.irods.jargon.rest.base.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Avu
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-21T10:48:32.605-04:00")

public class Avu   {
  private String attribute = null;

  private String value = null;

  private String unit = null;

  public Avu attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

   /**
   * avu attribute part
   * @return attribute
  **/
  @ApiModelProperty(value = "avu attribute part")
  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public Avu value(String value) {
    this.value = value;
    return this;
  }

   /**
   * avu value part
   * @return value
  **/
  @ApiModelProperty(value = "avu value part")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Avu unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * avu unit part
   * @return unit
  **/
  @ApiModelProperty(value = "avu unit part")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Avu avu = (Avu) o;
    return Objects.equals(this.attribute, avu.attribute) &&
        Objects.equals(this.value, avu.value) &&
        Objects.equals(this.unit, avu.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, value, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Avu {\n");
    
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

