package org.mulesoft;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlowResourceTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(FlowResource.class);
    }

    @Test
    @Ignore
    public void testGetIt() {
        final String responseMsg = target().path("flow").request().get(String.class);

        assertEquals("OK", responseMsg);
    }
}
