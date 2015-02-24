Here first you need to create a table in oracle database by using the following command-
create table customer(
c_id varchar2(10) primary key,
cname varchar2(10),
cadd varchar2(10),
cpass varchar2(10));

Secondly you need to Save the "fblogin"directory in "C:/Tomcat8/webapps/"

Thirdly copy servlet-api.jar from "C:\tomcat8\lib" to "C:\Program Files\Java\jdk1.8.0_25\jre\lib\ext"
Fourthly,paste the odbc6.jar to "C:\tomcat8\lib\"
