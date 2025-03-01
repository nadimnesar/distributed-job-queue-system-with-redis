start: mvn-build docker-up

stop: docker-down

reload: docker-down docker-up

mvn-build:
	mvn clean install -DskipTests

docker-up:
	 docker-compose up -d

docker-down:
	docker-compose down

# To add new instances while not stopping existing ones
# Add new producer/worker in docker-compose.yml file and run scale (edit numbers)
scale:
	docker-compose up -d producer_4 worker_6

# Add new producer/worker cluster in nginx.conf file, then reload nginx
reload-nginx:
	docker exec nginx-lb nginx -s reload
