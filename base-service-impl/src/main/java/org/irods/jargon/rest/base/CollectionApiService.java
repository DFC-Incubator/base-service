package org.irods.jargon.rest.base;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-02-10T11:48:05.294-05:00")
public abstract class CollectionApiService {
	public abstract Response collectionInfo(String absoluteLogicalPath,
			Boolean brief, SecurityContext securityContext)
			throws NotFoundException;

	public abstract Response collectionListing(String absoluteLogicalPath,
			SecurityContext securityContext) throws NotFoundException;
}
