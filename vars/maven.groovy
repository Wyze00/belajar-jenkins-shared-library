def call(step, String command){
    step.sh("./mvnw ${command}")
}