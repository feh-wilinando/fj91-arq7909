PHONY = up

up: package
	@ echo "Starting project"
	@ docker-compose up -d

down:
	@ echo "Stopping project"
	@ docker-compose down -v

package:
	@ echo "Building project"
	@ mvn -q clean package