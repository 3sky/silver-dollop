def call(def context, String content) {
    echo "||------ EXECUTE SOME COMAND -------||"
    executeCommand(context, content)

}


def executeCommand(context, String command) {
    stdout = script.sh(script: command, returnStdout: true)
    return stdout.trim()
}
