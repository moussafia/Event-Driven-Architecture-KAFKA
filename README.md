<h2>Kafka cmd</h2>


UUID

JRBzyPS2T6yG0Q_44gRMRQ


→ ID du cluster KRaft.

Format du stockage

.\bin\windows\kafka-storage.bat format -t JRBzyPS2T6yG0Q_44gRMRQ -c .\config\kraft\server.properties


→ Initialise le log Kafka (obligatoire la première fois).



Démarrer Zookeeper
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties


➡️ Laisser la fenêtre ouverte

3️⃣ Démarrer Kafka Server

Dans une nouvelle fenêtre CMD :

.\bin\windows\kafka-server-start.bat .\config\server.properties


➡️ Laisser la fenêtre ouverte

4️⃣ Tester Producer / Consumer
a) Créer un topic
.\bin\windows\kafka-topics.bat --create --topic test-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

b) Lancer le consumer
.\bin\windows\kafka-console-consumer.bat --topic test-topic --bootstrap-server localhost:9092 --from-beginning

c) Lancer le producer
.\bin\windows\kafka-console-producer.bat --topic test-topic --bootstrap-server localhost:9092


➡️ Tape un message :

hello kafka


➡️ Tu dois voir hello kafka dans la fenêtre du consumer

.\bin\windows\kafka-console-consumer.bat --topic T3 --bootstrap-server localhost:9092 --from-beginning --property print.key=true --key-deserializer org.apache.kafka.common.serialization.StringDeserializer --value-deserializer org.apache.kafka.common.serialization.LongDeserializer


.\bin\windows\kafka-console-consumer.bat --topic T4 --bootstrap-server localhost:9092 --property print.key=true --key-deserializer org.apache.kafka.common.serialization.StringDeserializer --value-deserializer org.apache.kafka.common.serialization.LongDeserializer