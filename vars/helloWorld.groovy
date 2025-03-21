// vars/helloWorld.groovy
def call(Map config = [:]) {
    sh "echo Hello ${config.name}! Welcome to Jenkins Shared Library. Today is ${config.dayOfWeek}."
    
}
