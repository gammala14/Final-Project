@Library('Final-Project@main') _

buildAndDeploy(
    gitUrl:'https://github.com/gammala14/Final-Project.git',
    gitBranch: 'main',
    dockerhubUser: 'gammala',
    imageRepo: 'my-portfolio',
    githubRepo: 'gammala14/Final-Project'
)
