package org.irods.jargon.rest.base;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/collection")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-02-10T11:48:05.294-05:00")
public class CollectionApi {
	private CollectionApiService collectionApiService;

	@GET
	@Path("/{absoluteLogicalPath}/info")
	@Produces({ "application/json", "application/xml" })
	public Response collectionInfo(
			@PathParam("absoluteLogicalPath") String absoluteLogicalPath,
			@QueryParam("brief") Boolean brief,
			@Context SecurityContext securityContext) throws NotFoundException {
		return collectionApiService.collectionInfo(absoluteLogicalPath, brief,
				securityContext);
	}

	@GET
	@Path("/{absoluteLogicalPath}")
	@Produces({ "application/json", "application/xml" })
	public Response collectionListing(
			@PathParam("absoluteLogicalPath") String absoluteLogicalPath,
			@Context SecurityContext securityContext) throws NotFoundException {
		return collectionApiService.collectionListing(absoluteLogicalPath,
				securityContext);
	}
}
