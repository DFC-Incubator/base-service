package org.irods.jargon.rest.base.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;




@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-02-10T11:17:25.080-05:00")
public class Acl   {
  
  private String userName = null;
  private String userZone = null;
  private Integer userId = null;
  private String userType = null;
  private String permission = null;

  /**
   * User name in the given zone that has the permission
   **/
  
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * User zone for this user that has the permission
   **/
  
  @JsonProperty("userZone")
  public String getUserZone() {
    return userZone;
  }
  public void setUserZone(String userZone) {
    this.userZone = userZone;
  }

  /**
   * Unique id of the user
   **/
  
  @JsonProperty("userId")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * Type of user (rodsadmin | rodsuser)
   **/
  
  @JsonProperty("userType")
  public String getUserType() {
    return userType;
  }
  public void setUserType(String userType) {
    this.userType = userType;
  }

  /**
   * Level of permission (OWN | WRITE | READ)
   **/
  
  @JsonProperty("permission")
  public String getPermission() {
    return permission;
  }
  public void setPermission(String permission) {
    this.permission = permission;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Acl acl = (Acl) o;
    return Objects.equals(userName, acl.userName) &&
        Objects.equals(userZone, acl.userZone) &&
        Objects.equals(userId, acl.userId) &&
        Objects.equals(userType, acl.userType) &&
        Objects.equals(permission, acl.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, userZone, userId, userType, permission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Acl {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userZone: ").append(toIndentedString(userZone)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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

