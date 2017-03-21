package org.irods.jargon.rest.base.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Acl
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-21T10:48:32.605-04:00")

public class Acl   {
  private String userName = null;

  private String userZone = null;

  private Integer userId = null;

  private String userType = null;

  private String permission = null;

  public Acl userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * User name in the given zone that has the permission
   * @return userName
  **/
  @ApiModelProperty(value = "User name in the given zone that has the permission")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Acl userZone(String userZone) {
    this.userZone = userZone;
    return this;
  }

   /**
   * User zone for this user that has the permission
   * @return userZone
  **/
  @ApiModelProperty(value = "User zone for this user that has the permission")
  public String getUserZone() {
    return userZone;
  }

  public void setUserZone(String userZone) {
    this.userZone = userZone;
  }

  public Acl userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Unique id of the user
   * @return userId
  **/
  @ApiModelProperty(value = "Unique id of the user")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Acl userType(String userType) {
    this.userType = userType;
    return this;
  }

   /**
   * Type of user (rodsadmin | rodsuser)
   * @return userType
  **/
  @ApiModelProperty(value = "Type of user (rodsadmin | rodsuser)")
  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }

  public Acl permission(String permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Level of permission (OWN | WRITE | READ)
   * @return permission
  **/
  @ApiModelProperty(value = "Level of permission (OWN | WRITE | READ)")
  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Acl acl = (Acl) o;
    return Objects.equals(this.userName, acl.userName) &&
        Objects.equals(this.userZone, acl.userZone) &&
        Objects.equals(this.userId, acl.userId) &&
        Objects.equals(this.userType, acl.userType) &&
        Objects.equals(this.permission, acl.permission);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

