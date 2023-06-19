## WHERE IS MY PET

### Overview
This project is to provide a platform for owners register their lovely lost pets

---
#### About project
- Backend applications: [Java(Jakarta EE)](https://jakarta.ee/specifications/)
- Frontend applications: [React](https://reactjs.org/docs/getting-started.html)
- ORM: [Hibernate](https://hibernate.org/orm/documentation/6.1/)
- Tests type: 
  - [Unit test](https://www.atlassian.com/continuous-delivery/software-testing/types-of-software-testing): [Junit](https://junit.org/junit5/docs/current/user-guide/), [Mockito](https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html)
  - [Integration Test](https://www.atlassian.com/continuous-delivery/software-testing/types-of-software-testing): [Wiremock](https://wiremock.org/docs/), [Arquilian](https://arquillian.org/docs/), [Testcontainers](https://www.testcontainers.org/)
  - [System Test](https://www.atlassian.com/continuous-delivery/software-testing/types-of-software-testing): [REST Assured](https://github.com/rest-assured/rest-assured/wiki/Usage)
- Database: [PostgreSQL](https://www.postgresql.org/docs/)
- Version control: [Git](https://git-scm.com/docs)
- CI/CD Pipelines: [Jenkins](https://www.jenkins.io/doc/), [Github Actions](https://docs.github.com/en/actions), [Nexus](https://help.sonatype.com/repomanager3), [Sonarqube](https://docs.sonarqube.org/latest/)
- Documentation: [OpenAPI Spec](https://swagger.io/specification/)
- Containerization: [Docker](https://docs.docker.com/)
- Container orchestration: [Kubernetes](https://kubernetes.io/docs/home/)
- Infrastructure as code: [Terraform](https://developer.hashicorp.com/terraform/docs)
- Cloud: [Azure Cloud](https://learn.microsoft.com/en-us/azure/)
- Logging, monitoring & Alerting: [Grafana](https://grafana.com/docs/grafana/latest/getting-started/build-first-dashboard/), [Prometheus](https://prometheus.io/docs/prometheus/latest/getting_started/)
- Architectures: [Microservice](https://microservices.io/patterns/microservices.html), [CI/CD](https://semaphoreci.com/blog/cicd-pipeline), [RESTful APIs](https://www.redhat.com/en/topics/api/what-is-a-rest-api)
- Architectural Pattern: [Entity-Control-Boundary pattern (ECB)](https://en.wikipedia.org/wiki/Entity-control-boundary)
- Git Branching Strategy: [Github Flow](https://medium.com/@anshita.bhasin/different-branching-strategies-a4988b24b9b5)
- Coding Style: [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
- Design Api: [API First](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#oasObject)
- Release Semantic Versioning: [Release Version](https://semver.org/spec/v2.0.0.html)
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

---
### How To:
#### - How to run this project
(<i>Pre-Requisites: Docker Desktop, Maven, JDK17</i>)

    - Clone the project: https://github.com/davids13/where-is-my-pet.git
    - Create package: mvn clean package -DskipTests
    - Run container: docker compose up --build
    - Test it using curl: curl --location --request GET 'http://localhost:8080/where-is-my-pet-application/api/v1/pets'

#### - How to make a pull request
(<i>Pre-Requisites: Docker Desktop, Maven, JDK17</i>)

    1 - Clone the project: https://github.com/davids13/where-is-my-pet.git
    2 - Create a feature branch: e.g feature/implement-delete-action-on-crud
    3 - Squash the commits
    4 - Open a pull request

---
#### Contributing
The easiest way to contribute is by opening an [issue](https://github.com/davids13/where-is-my-pet/issues) that contains
feedback and review comments.

---
#### Links
- [where-is-my-pet](https://github.com/davids13/where-is-my-pet.git)
- [Git rebase](https://git-scm.com/docs/git-rebase)

---
strucuture of readme:
- title
- description
- table of content
- installation guide
- contribution guidelines