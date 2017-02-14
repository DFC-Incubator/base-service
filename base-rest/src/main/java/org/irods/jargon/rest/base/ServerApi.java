package org.irods.jargon.rest.base;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/server")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-02-10T15:05:04.724-05:00")
public class ServerApi {
	private ServerApiService serverApiService;

	@GET
	@Path("/ping")
	@Produces({ "application/json", "application/xml" })
	public Response server(@Context SecurityContext securityContext)
			throws NotFoundException {
		return serverApiService.server(securityContext);
	}

	/**
	 * @return the serverApiService
	 */
	public ServerApiService getServerApiService() {
		return serverApiService;
	}

	/**
	 * @param serverApiService
	 *            the serverApiService to set
	 */
	public void setServerApiService(ServerApiService serverApiService) {
		this.serverApiService = serverApiService;
	}
}