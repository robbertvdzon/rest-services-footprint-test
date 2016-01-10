**REST implementations**

This projects contains 5 different rest service implementations and is used to test the footprint of the different implementations

**Rest using a tomee container:**
- Deploy the war in a tomee container
- Test the call using: http://localhost:8080/tomee-1.0-SNAPSHOT/customers/22
- Memory footprint of tomee: 145mb
- Memory footprint with application deployed: 217mb
- Deploy time: 4sec

**jee7:**
- Deploy the war in a jee7 container
- I testes this using wildfly, glassfish and liberty profile
- Test the call using: http://localhost:8080/jee7-1.0-SNAPSHOT/rest/customers/22 (for libertyprofile use port 9080 )
- Memory footprint of wildfly: 200mb, glassfish: 263mb and libertyprofile: 260mb
- Memory footprint with application deployed of wildfly: 300mb, glassfish: 397mb and libertyprofile: 345mb
- Deploy time: 11sec (for all 3 tested jee containers)

**spring boot:**
- Run the application as a standalone application
- Test the call using http://localhost:8080/customers/22
- Memory footprint: 280mb
- Application start time: 30 sec

**spark:**
- Run the application as a standalone application
- Test the call using http://localhost:4567/customer/312
- Memory footprint: 36mb
- Application start time: 1,5 sec

**jetty-jersey:**
- Run the application as a standalone application
- Test the call using http://localhost:8080/customers/1
- Memory footprint: 80mb
- Application start time: 4 sec
