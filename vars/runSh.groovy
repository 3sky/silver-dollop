def call(def context, String command) {
    echo "||------ EXECUTE SOME COMAND -------||"
    sh """
    $command
    """

}
