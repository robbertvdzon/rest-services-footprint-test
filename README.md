**REST implementations**

This projects contains 4 different rest service implementations and is used to test the footprint of the different implementations

**Java EE 7:**
- Deploy the war in a jee7 container
- I tested this using TomEE 1.7.3, Wildfly 9.0.2, Glassfish 4 and Liberty profile 8.5.5.8.
- Test the call using: http://localhost:8080/jee7-1.0-SNAPSHOT/rest/customers/22 (for libertyprofile use port 9080 )
- Memory footprint of TomEE: 145MB, wildfly: 200MB, glassfish: 263MB and libertyprofile: 260MB
- Memory footprint with application deployed of TomEE: 217MB, wildfly: 300MB, glassfish: 397MB and libertyprofile: 345MB
- Deploy time: TomEE: 3 sec, all other containers about 11sec

**Spring boot:**
- Run the application as a standalone application
- Test the call using http://localhost:8080/customers/22
- Memory footprint: 280mb
- Application start time: 30 sec

**Spark:**
- Run the application as a standalone application
- Test the call using http://localhost:4567/customer/312
- Memory footprint: 36mb
- Application start time: 1,5 sec

**Standalone Jetty with Jersey:**
- Run the application as a standalone application
- Test the call using http://localhost:8080/customers/1
- Memory footprint: 80mb
- Application start time: 4 sec
