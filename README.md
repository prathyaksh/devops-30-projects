Java application.
Tech stach used:
  -Maven
  -github actions
  -sonarqube
  -docker
  -trivy

1) While using GITHUB actioons the connfiguration yaml file should always be in the root directory of the repo.(./repo_name/.github/workflows/actions.yml)
2) if you have multiple projects in same repo that use different github actions YML files, you will you field "paths" and "working-directory" in the yml file to define the which folder needs to run.
3) yaml files follow good intendation and fields you give are case sensitive.

