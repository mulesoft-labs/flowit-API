package org.mulesoft;

import org.mulesoft.domain.Flow;
import org.mulesoft.service.FlowService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("flow")
public class FlowResource {

    FlowService flowService = new FlowService();

    /**
     * Based on a mule .xml flow code, deploys an application with that flow in a mule instance and returns OK if the
     * application started deploying.
     *
     * @return Status of the deployment.
     */
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Flow getFlow(@PathParam("id") String id) {
        return flowService.getById(id);
    }

    /**
     * Based on a mule .xml flow code, deploys an application with that flow in a mule instance and returns OK if the
     * application started deploying.
     *
     * @return Status of the deployment.
     */
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public Flow createFlow() {
        return flowService.create(null);
    }
}
