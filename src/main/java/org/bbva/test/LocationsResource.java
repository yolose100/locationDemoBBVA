package org.bbva.test;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.bbva.test.beans.Location;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/locations")
public interface LocationsResource {
  @GET
  @Produces("application/json")
  List<Location> generatedMethod1();
}
