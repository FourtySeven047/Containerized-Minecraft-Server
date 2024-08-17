FROM openjdk:24
LABEL maintainer="sthobue@glh.de"
WORKDIR /usr/src/app

ARG version
ENV env_version=${version}

COPY "versions/${version}" ./

RUN touch eula.txt
RUN echo "eula=true" >> eula.txt

CMD java -jar ${env_version} nogui