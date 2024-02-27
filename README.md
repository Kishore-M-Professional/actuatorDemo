# actuatorDemo
This project is for basic understanding of actuator implementation in spring boot microservices. 
<p>1. To update the actuator endpoint port alone<br>
<p> <i>management.server.port = 8090</i> <br>
eg: http://localhost:8090/actuator </p>
<p>2. To expose additional predefined endpoints of actuator, by default health endpoint is exposed<br>
<p> <i>management.endpoints.web.exposure.include = env,info,beans,health</i> <br>
eg: <br>
http://localhost:8090/actuator/env <br>
http://localhost:8090/actuator/info <br>
http://localhost:8090/actuator/beans <br>
http://localhost:8090/actuator/health</p>
<p>3. To update the base path (or) endpoint of the actuator <br>
<p><i>management.endpoints.web.base-path = /manage</i> <br>
eg: http://localhost:8090/manage</p>
<p>4. To update the endpoint value <br>
<p>health endpoint "/health" is changed to "/apphealth" <br>
<i>management.endpoints.web.path-mapping.health = apphealth </i><br>
eg: http://localhost:8090/manage/apphealth</p>

![img.png](src/main/resources/templates/img.png)
