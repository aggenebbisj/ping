FROM aggenebbisj/wildfly

MAINTAINER Remko de Jong

ADD target/ping.war /opt/wildfly/standalone/deployments/ping.war

