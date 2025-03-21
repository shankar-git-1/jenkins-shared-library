// vars/helloWorld.groovy
def call(Map config = [:]) {
    echo "Hello, ${config.name}! Welcome to Jenkins Shared Library."
    echo "Today is ${config.dayOfweek}".
}
