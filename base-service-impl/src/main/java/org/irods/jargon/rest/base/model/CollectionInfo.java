package org.irods.jargon.rest.base.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.irods.jargon.rest.base.model.Acl;
import org.irods.jargon.rest.base.model.Avu;
import org.irods.jargon.rest.base.model.PathComponent;
import org.irods.jargon.rest.base.model.Tag;




/**
 * CollectionInfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-21T10:48:32.605-04:00")

public class CollectionInfo   {
  private Boolean file = null;

  private Integer id = null;

  private String absolutePath = null;

  private String lastPathComponent = null;

  private String collectionParentAbsolutePath = null;

  private List<PathComponent> pathComponents = new ArrayList<PathComponent>();

  private String collectionOwnerName = null;

  private String collectionOwnerZone = null;

  private Boolean inheritance = null;

  private String createdDate = null;

  private String modifiedDate = null;

  private Boolean starred = null;

  private Boolean shared = null;

  private List<Tag> tags = new ArrayList<Tag>();

  private List<Avu> avus = new ArrayList<Avu>();

  private List<Acl> acls = new ArrayList<Acl>();

  public CollectionInfo file(Boolean file) {
    this.file = file;
    return this;
  }

   /**
   * true if this is a file
   * @return file
  **/
  @ApiModelProperty(value = "true if this is a file")
  public Boolean getFile() {
    return file;
  }

  public void setFile(Boolean file) {
    this.file = file;
  }

  public CollectionInfo id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * unique id of the collection
   * @return id
  **/
  @ApiModelProperty(value = "unique id of the collection")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CollectionInfo absolutePath(String absolutePath) {
    this.absolutePath = absolutePath;
    return this;
  }

   /**
   * absoluteIrodsPath
   * @return absolutePath
  **/
  @ApiModelProperty(value = "absoluteIrodsPath")
  public String getAbsolutePath() {
    return absolutePath;
  }

  public void setAbsolutePath(String absolutePath) {
    this.absolutePath = absolutePath;
  }

  public CollectionInfo lastPathComponent(String lastPathComponent) {
    this.lastPathComponent = lastPathComponent;
    return this;
  }

   /**
   * the last part of the collection path, which is the display name of the actual collection being viewed
   * @return lastPathComponent
  **/
  @ApiModelProperty(value = "the last part of the collection path, which is the display name of the actual collection being viewed")
  public String getLastPathComponent() {
    return lastPathComponent;
  }

  public void setLastPathComponent(String lastPathComponent) {
    this.lastPathComponent = lastPathComponent;
  }

  public CollectionInfo collectionParentAbsolutePath(String collectionParentAbsolutePath) {
    this.collectionParentAbsolutePath = collectionParentAbsolutePath;
    return this;
  }

   /**
   * fully qualified absolute path, with no trailing slash, of the parent of the given collection
   * @return collectionParentAbsolutePath
  **/
  @ApiModelProperty(value = "fully qualified absolute path, with no trailing slash, of the parent of the given collection")
  public String getCollectionParentAbsolutePath() {
    return collectionParentAbsolutePath;
  }

  public void setCollectionParentAbsolutePath(String collectionParentAbsolutePath) {
    this.collectionParentAbsolutePath = collectionParentAbsolutePath;
  }

  public CollectionInfo pathComponents(List<PathComponent> pathComponents) {
    this.pathComponents = pathComponents;
    return this;
  }

  public CollectionInfo addPathComponentsItem(PathComponent pathComponentsItem) {
    this.pathComponents.add(pathComponentsItem);
    return this;
  }

   /**
   * array of path components without slashes
   * @return pathComponents
  **/
  @ApiModelProperty(value = "array of path components without slashes")
  public List<PathComponent> getPathComponents() {
    return pathComponents;
  }

  public void setPathComponents(List<PathComponent> pathComponents) {
    this.pathComponents = pathComponents;
  }

  public CollectionInfo collectionOwnerName(String collectionOwnerName) {
    this.collectionOwnerName = collectionOwnerName;
    return this;
  }

   /**
   * iRODS user name of the owner of the collection
   * @return collectionOwnerName
  **/
  @ApiModelProperty(value = "iRODS user name of the owner of the collection")
  public String getCollectionOwnerName() {
    return collectionOwnerName;
  }

  public void setCollectionOwnerName(String collectionOwnerName) {
    this.collectionOwnerName = collectionOwnerName;
  }

  public CollectionInfo collectionOwnerZone(String collectionOwnerZone) {
    this.collectionOwnerZone = collectionOwnerZone;
    return this;
  }

   /**
   * iRODS zone of the owner of the collection
   * @return collectionOwnerZone
  **/
  @ApiModelProperty(value = "iRODS zone of the owner of the collection")
  public String getCollectionOwnerZone() {
    return collectionOwnerZone;
  }

  public void setCollectionOwnerZone(String collectionOwnerZone) {
    this.collectionOwnerZone = collectionOwnerZone;
  }

  public CollectionInfo inheritance(Boolean inheritance) {
    this.inheritance = inheritance;
    return this;
  }

   /**
   * indicates whether permissions are inherited by child objects
   * @return inheritance
  **/
  @ApiModelProperty(value = "indicates whether permissions are inherited by child objects")
  public Boolean getInheritance() {
    return inheritance;
  }

  public void setInheritance(Boolean inheritance) {
    this.inheritance = inheritance;
  }

  public CollectionInfo createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * date-time when collection was created
   * @return createdDate
  **/
  @ApiModelProperty(value = "date-time when collection was created")
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public CollectionInfo modifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * date-time when collection was last modified
   * @return modifiedDate
  **/
  @ApiModelProperty(value = "date-time when collection was last modified")
  public String getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public CollectionInfo starred(Boolean starred) {
    this.starred = starred;
    return this;
  }

   /**
   * indicates if the collection was starred by the user
   * @return starred
  **/
  @ApiModelProperty(value = "indicates if the collection was starred by the user")
  public Boolean getStarred() {
    return starred;
  }

  public void setStarred(Boolean starred) {
    this.starred = starred;
  }

  public CollectionInfo shared(Boolean shared) {
    this.shared = shared;
    return this;
  }

   /**
   * indicates that the collection has been shared by the user
   * @return shared
  **/
  @ApiModelProperty(value = "indicates that the collection has been shared by the user")
  public Boolean getShared() {
    return shared;
  }

  public void setShared(Boolean shared) {
    this.shared = shared;
  }

  public CollectionInfo tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public CollectionInfo addTagsItem(Tag tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * User defined tags
   * @return tags
  **/
  @ApiModelProperty(value = "User defined tags")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public CollectionInfo avus(List<Avu> avus) {
    this.avus = avus;
    return this;
  }

  public CollectionInfo addAvusItem(Avu avusItem) {
    this.avus.add(avusItem);
    return this;
  }

   /**
   * Raw AVU metadata
   * @return avus
  **/
  @ApiModelProperty(value = "Raw AVU metadata")
  public List<Avu> getAvus() {
    return avus;
  }

  public void setAvus(List<Avu> avus) {
    this.avus = avus;
  }

  public CollectionInfo acls(List<Acl> acls) {
    this.acls = acls;
    return this;
  }

  public CollectionInfo addAclsItem(Acl aclsItem) {
    this.acls.add(aclsItem);
    return this;
  }

   /**
   * User permissions
   * @return acls
  **/
  @ApiModelProperty(value = "User permissions")
  public List<Acl> getAcls() {
    return acls;
  }

  public void setAcls(List<Acl> acls) {
    this.acls = acls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionInfo collectionInfo = (CollectionInfo) o;
    return Objects.equals(this.file, collectionInfo.file) &&
        Objects.equals(this.id, collectionInfo.id) &&
        Objects.equals(this.absolutePath, collectionInfo.absolutePath) &&
        Objects.equals(this.lastPathComponent, collectionInfo.lastPathComponent) &&
        Objects.equals(this.collectionParentAbsolutePath, collectionInfo.collectionParentAbsolutePath) &&
        Objects.equals(this.pathComponents, collectionInfo.pathComponents) &&
        Objects.equals(this.collectionOwnerName, collectionInfo.collectionOwnerName) &&
        Objects.equals(this.collectionOwnerZone, collectionInfo.collectionOwnerZone) &&
        Objects.equals(this.inheritance, collectionInfo.inheritance) &&
        Objects.equals(this.createdDate, collectionInfo.createdDate) &&
        Objects.equals(this.modifiedDate, collectionInfo.modifiedDate) &&
        Objects.equals(this.starred, collectionInfo.starred) &&
        Objects.equals(this.shared, collectionInfo.shared) &&
        Objects.equals(this.tags, collectionInfo.tags) &&
        Objects.equals(this.avus, collectionInfo.avus) &&
        Objects.equals(this.acls, collectionInfo.acls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, id, absolutePath, lastPathComponent, collectionParentAbsolutePath, pathComponents, collectionOwnerName, collectionOwnerZone, inheritance, createdDate, modifiedDate, starred, shared, tags, avus, acls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionInfo {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    absolutePath: ").append(toIndentedString(absolutePath)).append("\n");
    sb.append("    lastPathComponent: ").append(toIndentedString(lastPathComponent)).append("\n");
    sb.append("    collectionParentAbsolutePath: ").append(toIndentedString(collectionParentAbsolutePath)).append("\n");
    sb.append("    pathComponents: ").append(toIndentedString(pathComponents)).append("\n");
    sb.append("    collectionOwnerName: ").append(toIndentedString(collectionOwnerName)).append("\n");
    sb.append("    collectionOwnerZone: ").append(toIndentedString(collectionOwnerZone)).append("\n");
    sb.append("    inheritance: ").append(toIndentedString(inheritance)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    starred: ").append(toIndentedString(starred)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    avus: ").append(toIndentedString(avus)).append("\n");
    sb.append("    acls: ").append(toIndentedString(acls)).append("\n");
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

