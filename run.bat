call mvn package -DskipTests

SET mode=%1
SET file="compose.yaml"
IF DEFINED mode (
    IF "%mode%"=="--dev" SET file="compose-dev.yaml"
)

call docker compose -f %file% up --build