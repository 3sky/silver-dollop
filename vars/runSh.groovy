def call(def context, String command) {
    echo "||------ EXECUTE SOME COMAND -------||"
    stdout = sh(script: command, returnStdout: true)
    return stdout.trim()

}
