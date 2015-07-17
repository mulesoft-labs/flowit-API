# flowit
Execute and share mule flows in the browser.

**How it works?** Deploys a mule app with the provided flow in a mule instance running on [CloudHub](https://www.mulesoft.com/platform/saas/cloudhub-ipaas-cloud-based-integration). Then try your flow by pinging an http endpoint we provide.

This is the API project, which runs under Java 8.

### Install

```sh
mvn clean install
```

### Run

```sh
mvn jetty:run
```

### Test

```sh
mvn clean test
```
