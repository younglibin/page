set tomcat_path=C:\workspace\om-tomcat-6.0.35\webapps
del /f /s /q "%tomcat_path%\page\WEB-INF\lib\jsp-api.jar"

del /f /s /q "%tomcat_path%\page\WEB-INF\lib\servlet-api.jar"
