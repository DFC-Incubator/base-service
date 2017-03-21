package org.irods.jargon.rest.base;

import org.irods.jargon.rest.base.model.Ping;
import org.irods.jargon.rest.base.service.ServerApiService;
import org.irods.jargon.rest.exception.IrodsRestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-21T10:48:32.605-04:00")

@Controller
@Component
public class ServerApiController implements ServerApi {

	@Autowired
	private ServerApiService serverApiService;

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public ResponseEntity<Ping> server(
			@ApiParam(value = "causes ping to only reach the REST mid tier and not query the back-end, provides a simple heartbeat of the mid-tier.  By default a ping will talk to the back end iRODS server", defaultValue = "false") @RequestParam(value = "midTierOnly", required = false, defaultValue = "false") final Boolean midTierOnly

	) throws IrodsRestException {
		log.info("doing ping");
		Ping ping = serverApiService.ping(midTierOnly);
		log.info("got ping:{}", ping);
		return new ResponseEntity<Ping>(ping, HttpStatus.OK);
	}

	public ServerApiService getServerApiService() {
		return serverApiService;
	}

	public void setServerApiService(ServerApiService serverApiService) {
		this.serverApiService = serverApiService;
	}

}
