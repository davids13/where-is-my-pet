## WHERE IS MY PET

### Description and motivation
This project is to provide a platform for owners register their lovely lost pets

#### Techs
    - Java EE jakarta
    - Postgres
    - Wiremock
    - React
    - Docker
    - Jenkins
    - Github Actions
    - Kubernetes
    - Nexus
    - Sonarqube

#### About project
    - Architecture: Entity-Control-Boundary (ECB)
    - Structure: root/
                    .github/
                    collections/
                    database/
                    jenkins/
                    k8s/
                    spec/
                    application/
                    changelog.md
                    docker-compose.xml
                    Dockerfile
                    README.md
    - Branching Strategy: Github
    - Coding Style: [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
    - Design Api Approach: [API First](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#oasObject)

#### How to run this project
    (You must have maven and docker desktop on your machine)
    - Clone from repo: [where-is-my-pet](https://github.com/davids13/where-is-my-pet.git)
    - Create package: mvn clean package -DskipTests
    - Run container: docker compose up --build
    - Test with a curl: curl --location --request GET 'http://localhost:8080/where-is-my-pet-application/api/v1/pets'

#### How to contribute
    1 - Clone the project: [where-is-my-pet](https://github.com/davids13/where-is-my-pet.git)
    2 - Create a feature branch: e.g feature/implement-delete-action-on-crud
    3 - Squash the commits with: git rebase -i  
    4 - Open a pull request

#### Links
    - https://github.com/davids13/where-is-my-pet