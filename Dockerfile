FROM mysql:latest

ENV MYSQL_ROOT_PASSWORD=Hitema&2024
ENV MYSQL_HOST=0.0.0.0
ENV MYSQL_PORT=3307

EXPOSE 3307

CMD ["mysqld"]