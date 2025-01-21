FROM apache/zeppelin:0.9.0

USER root 

RUN apt-get update && \
    apt-get install -y \
    wget \
    curl \
    tar \
    openjdk-11-jdk \
    scala \
    && apt-get clean

RUN wget https://archive.apache.org/dist/spark/spark-3.0.1/spark-3.0.1-bin-hadoop3.2.tgz -P /tmp && \
    tar -xvzf /tmp/spark-3.0.1-bin-hadoop3.2.tgz -C /opt && \
    mv /opt/spark-3.0.1-bin-hadoop3.2 /opt/spark-3.0.1 && \
    rm /tmp/spark-3.0.1-bin-hadoop3.2.tgz 
    
ENV JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
ENV SCALA_HOME=/usr/share/scala
ENV SPARK_HOME=/opt/spark-3.0.1
ENV PATH=$JAVA_HOME/bin:$SCALA_HOME/bin:$SPARK_HOME/bin:$PATH

USER 1000


