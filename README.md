## WHERE IS MY PET

### Overview
This project is to provide a platform for owners register their lovely lost pets

#### Techs
- [Java Jakarta EE](https://jakarta.ee/specifications/)
- [Hibernate](https://hibernate.org/orm/documentation/6.1/)
- [PostgreSQL](https://www.postgresql.org/docs/)
- [Wiremock](https://wiremock.org/docs/)
- [React](https://reactjs.org/docs/getting-started.html)
- [Github Actions](https://docs.github.com/en/actions)
- [Jenkins](https://www.jenkins.io/doc/)
- [Nexus](https://help.sonatype.com/repomanager3)
- [Sonarqube](https://docs.sonarqube.org/latest/)
- [Docker](https://docs.docker.com/)
- [Kubernetes](https://kubernetes.io/docs/home/)
- [Terraform](https://developer.hashicorp.com/terraform/docs)
- [Azure Cloud](https://learn.microsoft.com/en-us/azure/)

#### About project
- Architectural Pattern: [Entity-Control-Boundary pattern (ECB)](https://en.wikipedia.org/wiki/Entity-control-boundary)
- Git Branching Strategy: [Github Flow](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow)
- Coding Style: [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
- Design Api: [API First](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#oasObject)
- Project Structure:
  - root/
    - cicd/
      - .github/
      - jenkins/
    - database/
    - k8s/
    - postman/
      - collection/
      - environment/
    - spec/
    - application/
    - .gitignore
    - changelog.md
    - docker-compose.yml
    - Dockerfile
    - README.md

#### How to run this project
(Pre-Requisites: Docker Desktop, Maven)

    - Clone the project: https://github.com/davids13/where-is-my-pet.git
    - Create package: mvn clean package -DskipTests
    - Run container: docker compose up --build
    - Test it using curl: curl --location --request GET 'http://localhost:8080/where-is-my-pet-application/api/v1/pets'

#### Contributing
The easiest way to contribute is by opening an [issue](https://github.com/davids13/where-is-my-pet/issues) that contains
feedback and review comments.

#### How to make a pull request
(Pre-Requisites: Docker Desktop, Maven, JDK17)

    1 - Clone the project: https://github.com/davids13/where-is-my-pet.git
    2 - Create a feature branch: e.g feature/implement-delete-action-on-crud
    3 - Squash the commits
    4 - Open a pull request

#### Links
- [where-is-my-pet](https://github.com/davids13/where-is-my-pet.git)
- [Git rebase](https://git-scm.com/docs/git-rebase)