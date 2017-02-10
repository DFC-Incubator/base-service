package org.irods.jargon.rest.base.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import org.irods.jargon.rest.base.model.Acl;
import org.irods.jargon.rest.base.model.Avu;
import org.irods.jargon.rest.base.model.PathComponent;
import org.irods.jargon.rest.base.model.Tag;




@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-02-10T11:17:25.080-05:00")
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

  /**
   * true if this is a file
   **/
  
  @JsonProperty("file")
  public Boolean getFile() {
    return file;
  }
  public void setFile(Boolean file) {
    this.file = file;
  }

  /**
   * unique id of the collection
   **/
  
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * absoluteIrodsPath
   **/
  
  @JsonProperty("absolutePath")
  public String getAbsolutePath() {
    return absolutePath;
  }
  public void setAbsolutePath(String absolutePath) {
    this.absolutePath = absolutePath;
  }

  /**
   * the last part of the collection path, which is the display name of the actual collection being viewed
   **/
  
  @JsonProperty("lastPathComponent")
  public String getLastPathComponent() {
    return lastPathComponent;
  }
  public void setLastPathComponent(String lastPathComponent) {
    this.lastPathComponent = lastPathComponent;
  }

  /**
   * fully qualified absolute path, with no trailing slash, of the parent of the given collection
   **/
  
  @JsonProperty("collectionParentAbsolutePath")
  public String getCollectionParentAbsolutePath() {
    return collectionParentAbsolutePath;
  }
  public void setCollectionParentAbsolutePath(String collectionParentAbsolutePath) {
    this.collectionParentAbsolutePath = collectionParentAbsolutePath;
  }

  /**
   * array of path components without slashes
   **/
  
  @JsonProperty("pathComponents")
  public List<PathComponent> getPathComponents() {
    return pathComponents;
  }
  public void setPathComponents(List<PathComponent> pathComponents) {
    this.pathComponents = pathComponents;
  }

  /**
   * iRODS user name of the owner of the collection
   **/
  
  @JsonProperty("collectionOwnerName")
  public String getCollectionOwnerName() {
    return collectionOwnerName;
  }
  public void setCollectionOwnerName(String collectionOwnerName) {
    this.collectionOwnerName = collectionOwnerName;
  }

  /**
   * iRODS zone of the owner of the collection
   **/
  
  @JsonProperty("collectionOwnerZone")
  public String getCollectionOwnerZone() {
    return collectionOwnerZone;
  }
  public void setCollectionOwnerZone(String collectionOwnerZone) {
    this.collectionOwnerZone = collectionOwnerZone;
  }

  /**
   * indicates whether permissions are inherited by child objects
   **/
  
  @JsonProperty("inheritance")
  public Boolean getInheritance() {
    return inheritance;
  }
  public void setInheritance(Boolean inheritance) {
    this.inheritance = inheritance;
  }

  /**
   * date-time when collection was created
   **/
  
  @JsonProperty("createdDate")
  public String getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * date-time when collection was last modified
   **/
  
  @JsonProperty("modifiedDate")
  public String getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  /**
   * indicates if the collection was starred by the user
   **/
  
  @JsonProperty("starred")
  public Boolean getStarred() {
    return starred;
  }
  public void setStarred(Boolean starred) {
    this.starred = starred;
  }

  /**
   * indicates that the collection has been shared by the user
   **/
  
  @JsonProperty("shared")
  public Boolean getShared() {
    return shared;
  }
  public void setShared(Boolean shared) {
    this.shared = shared;
  }

  /**
   * User defined tags
   **/
  
  @JsonProperty("tags")
  public List<Tag> getTags() {
    return tags;
  }
  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  /**
   * Raw AVU metadata
   **/
  
  @JsonProperty("avus")
  public List<Avu> getAvus() {
    return avus;
  }
  public void setAvus(List<Avu> avus) {
    this.avus = avus;
  }

  /**
   * User permissions
   **/
  
  @JsonProperty("acls")
  public List<Acl> getAcls() {
    return acls;
  }
  public void setAcls(List<Acl> acls) {
    this.acls = acls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionInfo collectionInfo = (CollectionInfo) o;
    return Objects.equals(file, collectionInfo.file) &&
        Objects.equals(id, collectionInfo.id) &&
        Objects.equals(absolutePath, collectionInfo.absolutePath) &&
        Objects.equals(lastPathComponent, collectionInfo.lastPathComponent) &&
        Objects.equals(collectionParentAbsolutePath, collectionInfo.collectionParentAbsolutePath) &&
        Objects.equals(pathComponents, collectionInfo.pathComponents) &&
        Objects.equals(collectionOwnerName, collectionInfo.collectionOwnerName) &&
        Objects.equals(collectionOwnerZone, collectionInfo.collectionOwnerZone) &&
        Objects.equals(inheritance, collectionInfo.inheritance) &&
        Objects.equals(createdDate, collectionInfo.createdDate) &&
        Objects.equals(modifiedDate, collectionInfo.modifiedDate) &&
        Objects.equals(starred, collectionInfo.starred) &&
        Objects.equals(shared, collectionInfo.shared) &&
        Objects.equals(tags, collectionInfo.tags) &&
        Objects.equals(avus, collectionInfo.avus) &&
        Objects.equals(acls, collectionInfo.acls);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

