### generating code

```
java -jar /home/mconway/javalib/swagger-codegen/swagger-codegen-cli-2.2.1.jar generate \
 -i https://raw.githubusercontent.com/irods-contrib/irods_rest_services/master/base/base.yaml \
  -l jaxrs-resteasy \
  --model-package org.irods.jargon.rest.base.model \
  -o target/codegen


```