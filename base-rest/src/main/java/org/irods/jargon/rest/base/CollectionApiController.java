package org.irods.jargon.rest.base;

import org.irods.jargon.rest.base.model.CollectionInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-21T10:48:32.605-04:00")

@Controller
public class CollectionApiController implements CollectionApi {

	@Override
	public ResponseEntity<CollectionInfo> collectionInfo(
			@ApiParam(value = "Absolute path to the collection in iRODS", required = true) @PathVariable("absoluteLogicalPath") final String absoluteLogicalPath

			,
			@ApiParam(value = "Request a full listing of collection information, including gathering metadata and extended attributes, by setting brief to false.", defaultValue = "true") @RequestParam(value = "brief", required = false, defaultValue = "true") final Boolean brief

	) {
		// do some magic!
		return new ResponseEntity<CollectionInfo>(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Void> collectionListing(
			@ApiParam(value = "Absolute path to the collection in iRODS", required = true) @PathVariable("absoluteLogicalPath") final String absoluteLogicalPath

	) {
		// do some magic!
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
