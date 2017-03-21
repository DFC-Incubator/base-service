FROM java:8-jdk-alpine
LABEL organization="RENCI"
LABEL maintainer="michael_conway@unc.edu"
LABEL description="iRODS Core REST API."

ADD runit.sh /
ADD target/base-rest-4.2.1.1-SNAPSHOT.jar /
CMD ["/runit.sh"]
#CMD ["top"]


# build: docker build -t diceunc/irods-base-rest:4.2.1.1 .

# run:  docker run -d --rm -p 8080:8080 -v /etc/irods-ext:/etc/irods-ext  --add-host irods420.irodslocal:172.16.250.101 diceunc/irods-base-rest:4.2.1.1
