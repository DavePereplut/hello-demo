node {
    stage 'checkout'
    git url: 'https://github.com/DavePereplut/hello-demo.git'
    
    stage 'build'
    sh 'chmod +x mvnw'
     //sh './mvnw build'
    sh './mvnw clean install' 
     
    stage 'test'
    sh './mnvw check'
    
    
}