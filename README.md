## WHERE IS MY PET

### Description and motivation
This project is to provide a platform for owners register their lovely lost pets

#### Techs
    - Java Jakarta EE
    - Postgres
    - Wiremock
    - React
    - Docker
    - Jenkins
    - Github Actions
    - Kubernetes
    - Nexus
    - Sonarqube
    - Terraform
    - Azure Cloud

#### About project
    - Architecture: [Entity-Control-Boundary pattern (ECB)](https://en.wikipedia.org/wiki/Entity-control-boundary)
    - Git Branching Strategy: Github
    - Coding Style: [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
    - Design Api Approach: [API First](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#oasObject)
    - Structure: root/
                    .github/
                    database/
                    jenkins/
                    k8s/
                    postman/
                    spec/
                    application/
                    changelog.md
                    docker-compose.yml
                    Dockerfile
                    README.md

#### How to run this project
    - You must have maven and docker desktop on your machine)
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
    - https://jakarta.ee/

[//]: # (Overview)

[//]: # (    First we will shortly explain what it is the project about)

[//]: # (    briefly introduce your project.)

[//]: # (Install)

[//]: # (    then, we will continue on how to install and how to get started with it and,)

[//]: # (Usage / Getting started)

[//]: # (    The goal is to guide the reader in what to do once he has just installed your project in his environment.)

[//]: # (Documentation)

[//]: # (    Deployment good practices. How to deploy it in a production environment.)

[//]: # (    Security guidelines. How to harden any installation to avoid any cybersecurity issue.)

[//]: # (    Troubleshooting.)

[//]: # (Development)

[//]: # (    This development section is for setting up the environment in dev mode. What are the tools that you need and how to run the project in debug mode, run the unit testing, etc)

[//]: # (Contributing)

[//]: # (    This section is for providing any additional information for the reader that wants to really contribute.)

[//]: # (    )
[//]: # (    How to report a bug)

[//]: # (    Code of conduct)

[//]: # (    Coding Style guide)

[//]: # (    How to make a pull request &#40;PR&#41;)

[//]: # (    How to get support)

[//]: # (    How to make a donation)

[//]: # (    How to contact for commercial support)

[//]: # (Acknowledgements)

[//]: # (    acknowledge those who have been inspiration of your work &#40;other repos, other projects&#41; or mention those key contributors of the project, that is, those that have added new features, submitted pull requests, fixed bugs, etc.)