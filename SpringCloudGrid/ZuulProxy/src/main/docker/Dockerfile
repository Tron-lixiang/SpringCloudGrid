# Docker image for springboot file run
# VERSION 0.0.1
# Author: lixiang
# 基础镜像使用java
FROM java:8
# 作者
MAINTAINER lixiang <tron.lixiang@gmail.com>
# VOLUME 指定了临时文件目录为/tmp。
VOLUME /tmp
# 将jar包添加到容器中并更名为app.jar
ADD zuulproxy.jar app.jar
# 运行jar包
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]