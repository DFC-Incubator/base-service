package org.irods.jargon.rest.base.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Tag
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-21T10:48:32.605-04:00")

public class Tag   {
  private String userName = null;

  private String tagData = null;

  public Tag userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * User name that created tag (will include user#zone)
   * @return userName
  **/
  @ApiModelProperty(value = "User name that created tag (will include user#zone)")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Tag tagData(String tagData) {
    this.tagData = tagData;
    return this;
  }

   /**
   * Actual tag applied by the given user
   * @return tagData
  **/
  @ApiModelProperty(value = "Actual tag applied by the given user")
  public String getTagData() {
    return tagData;
  }

  public void setTagData(String tagData) {
    this.tagData = tagData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(this.userName, tag.userName) &&
        Objects.equals(this.tagData, tag.tagData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, tagData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    tagData: ").append(toIndentedString(tagData)).append("\n");
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

