# camel-cxf-code-first

Project camel-cxf-code-first

## Getting Started


### Prerequisites

antes de instalar a fuse debes generar el wsdl para luego llevarlos a src/resources
...
mvn process-classes 
...

luego ejecute install sin TEST [en proceso de revision]
...
mvn -DskipTests install
...

por ultimo deployar con bat
...
deploy.bat
...

revisar si esta el servicio web en linea
...
http://localhost:8181/cxf/order/OrderEndpoint?wsdl
...

