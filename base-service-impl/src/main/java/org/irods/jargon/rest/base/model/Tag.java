package org.irods.jargon.rest.base.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;




@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-02-10T11:17:25.080-05:00")
public class Tag   {
  
  private String userName = null;
  private String tagData = null;

  /**
   * User name that created tag (will include user#zone)
   **/
  
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * Actual tag applied by the given user
   **/
  
  @JsonProperty("tagData")
  public String getTagData() {
    return tagData;
  }
  public void setTagData(String tagData) {
    this.tagData = tagData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(userName, tag.userName) &&
        Objects.equals(tagData, tag.tagData);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

