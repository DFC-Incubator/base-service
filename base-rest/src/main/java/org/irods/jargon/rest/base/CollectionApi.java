package org.irods.jargon.rest.base;

import org.irods.jargon.rest.base.model.CollectionInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-21T10:48:32.605-04:00")

@Api(value = "collection", description = "the collection API")
public interface CollectionApi {

	@ApiOperation(value = "List catalog info for the collection", notes = "List system metadata for the given iRODS collection. This is the catalog metadata for the collection itself, rather than a listing of the children of the collection", response = CollectionInfo.class, authorizations = {
			@Authorization(value = "basicAuth") }, tags = { "files", "browsing", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "A detailed description of the catalog and other metadata about the collection", response = CollectionInfo.class),
			@ApiResponse(code = 404, message = "Collection information not found", response = CollectionInfo.class) })
	@RequestMapping(value = "/collection/{absoluteLogicalPath}/info", produces = { "application/json",
			"application/xml" }, method = RequestMethod.GET)
	ResponseEntity<CollectionInfo> collectionInfo(
			@ApiParam(value = "Absolute path to the collection in iRODS", required = true) @PathVariable("absoluteLogicalPath") String absoluteLogicalPath

			,
			@ApiParam(value = "Request a full listing of collection information, including gathering metadata and extended attributes, by setting brief to false.", defaultValue = "true") @RequestParam(value = "brief", required = false, defaultValue = "true") Boolean brief

	);

	@ApiOperation(value = "Do listings of the contents of iRODS collections", notes = "List children of the given iRODS parent collection.  This is a pagable representation of the direct children of this iRODS parent collection, rather than a recursive listing of the entire subtree", response = Void.class, authorizations = {
			@Authorization(value = "basicAuth") }, tags = { "files", "browsing", })
	@ApiResponses(value = { @ApiResponse(code = 404, message = "Collection not found", response = Void.class) })
	@RequestMapping(value = "/collection/{absoluteLogicalPath}", produces = { "application/json",
			"application/xml" }, method = RequestMethod.GET)
	ResponseEntity<Void> collectionListing(
			@ApiParam(value = "Absolute path to the collection in iRODS", required = true) @PathVariable("absoluteLogicalPath") String absoluteLogicalPath

	);

}
