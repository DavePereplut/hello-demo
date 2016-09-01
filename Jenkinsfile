staging="192.168.1.3"
registry="192.168.1.2:5000"
image="$registry/exchange-rate:${env.BUILD_NUMBER}"
container="exchange-rate"

node {
    stage 'checkout'
    git url: 'https://github.com/DavePereplut/hello-demo.git'

    stage 'build'
    sh 'chmod +x mvnw'
     //sh './mvnw build'
    sh './mvnw clean install'

    stage 'docker build'
    sh "docker build -t $image ."
    sh "docker push $image"

    stage 'deploy to staging'
    sh "docker -H $staging:2375 stop $container |true"
    sh "docker -H $staging:2375 rm $container |true"
    sh "docker -H $staging:2375 run -p 8080:8080 -d --name $container $image"
    sleep 180

    stage 'smoke'
    sh "test \'1.00\' = 'curl $staging:8080/usd/exchange-rate'"
    
}