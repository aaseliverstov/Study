FROM bellsoft/liberica-openjdk-alpine:11.0.16.1-1
COPY ./src ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d ./out src/ru/hm/jcore/main/Main.java
CMD java -classpath ./out ru.hm.jcore.main.Main