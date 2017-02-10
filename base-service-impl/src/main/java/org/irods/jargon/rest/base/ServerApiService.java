package org.irods.jargon.rest.base;

import org.irods.jargon.rest.base.*;
import org.irods.jargon.rest.base.model.*;


import org.irods.jargon.rest.base.model.Ping;

import java.util.List;
import org.irods.jargon.rest.base.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-02-10T15:05:04.724-05:00")
public abstract class ServerApiService {
      public abstract Response server(SecurityContext securityContext)
      throws NotFoundException;
}
