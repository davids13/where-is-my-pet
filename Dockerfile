FROM payara/micro:5.2022.3-jdk11
COPY where-is-my-pet-application/target/where-is-my-pet-application.war $DEPLOY_DIR
EXPOSE 4848 8080 8443 9009
ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,address=*:9009,server=y,suspend=n", "-jar", "/opt/payara/payara-micro.jar", "--deploy", "/opt/payara/deployments/where-is-my-pet-application.war"]