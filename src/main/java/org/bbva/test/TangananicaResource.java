package org.bbva.test;

import java.lang.String;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/tangananica")
public interface TangananicaResource {
  @GET
  @Produces("application/json")
  String generatedMethod5();
}
