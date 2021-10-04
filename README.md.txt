1) Run Apache Kafka locally. Can be downloaded from https://kafka.apache.org/downloads 

2) Run producer,
	https://github.com/sr325/kafka-tracer/blob/develop/producer/src/main/java/com/demo/producer/ProducerApplication.java

3) Open browser, to send message to producer
	http://localhost:8080/publish/hello 

4) Run consumer, 
	https://github.com/sr325/kafka-tracer/blob/develop/consumer_one/src/main/java/com/demo/consumer_one/ConsumerOneApplication.java

5) Dependencies used,
		<dependency>
			<groupId>org.springframework.kafka</groupId>
			<artifactId>spring-kafka</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-sleuth</artifactId>
		</dependency>

6) Kafka, how to start/create zookeeper, kafka, topics, producer, consumer
	./zookeeper-server-start.bat ../../config/zookeeper.properties

	./kafka-server-start.bat ../../config/server.properties

	./zookeeper-server-stop.bat
	./kafka-server-stop.bat

	./kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic topic1
	./kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic topic2

	./kafka-console-producer.bat --broker-list localhost:9092 --topic topic1
	./kafka-console-producer.bat --broker-list localhost:9092 --topic topic2

	./kafka-console-consumer.bat --topic topic1 --bootstrap-server localhost:9092
	./kafka-console-consumer.bat --topic topic2 --bootstrap-server localhost:9092

