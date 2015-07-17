package org.mulesoft.service;

import org.mulesoft.domain.Flow;
import org.mulesoft.muleprovider.CloudHubMuleProvider;
import org.mulesoft.muleprovider.MuleProvider;

import java.io.File;

public class FlowService {

    MuleProvider muleProvider = new CloudHubMuleProvider();

    public Flow create(String flow) {
        muleProvider.getMule().deploy(buildMuleApp(flow));
        return null;
    }

    private File buildMuleApp(String flow) {
        return null;
    }

    public Flow getById(String id) {
        return null;
    }
}
