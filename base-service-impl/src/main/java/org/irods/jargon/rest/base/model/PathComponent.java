package org.irods.jargon.rest.base.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * PathComponent
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-21T10:48:32.605-04:00")

public class PathComponent   {
  private String parthPart = null;

  public PathComponent parthPart(String parthPart) {
    this.parthPart = parthPart;
    return this;
  }

   /**
   * part of a path
   * @return parthPart
  **/
  @ApiModelProperty(value = "part of a path")
  public String getParthPart() {
    return parthPart;
  }

  public void setParthPart(String parthPart) {
    this.parthPart = parthPart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathComponent pathComponent = (PathComponent) o;
    return Objects.equals(this.parthPart, pathComponent.parthPart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parthPart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathComponent {\n");
    
    sb.append("    parthPart: ").append(toIndentedString(parthPart)).append("\n");
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

