package org.bbva.test;

import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.bbva.test.beans.Location;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/location")
public interface LocationResource {
  @Path("/bbva/{id}")
  @GET
  @Produces("application/json")
  Location generatedMethod2(@PathParam("id") Object id);

  @Path("/{id}/")
  @GET
  @Produces("application/json")
  Location generatedMethod3(@PathParam("id") Integer id);

  @Path("/{id}/")
  @POST
  @Produces("application/json")
  @Consumes("application/json")
  Location generatedMethod4(@PathParam("id") Object id, String data);
}
