def call(def context, String repo, String branch, String path) {
    echo "||------ CLONING $repo into $path------||"
    context.checkout([
        $class: 'GitSCM',
        branches: [[name: "$branch"]],
        doGenerateSubmoduleConfigurations: false,
        extensions: [
            [$class: 'RelativeTargetDirectory', relativeTargetDir: "$path"]],
            submoduleCfg: [],
        userRemoteConfigs: [[
            credentialsId: 'access-to-ghcr',
            url: "$repo"]]
    ])
}
//
//        sh("""
//            mv dls /dls
//            mv onnxrt-dls /onnxrt-dls
//            mv objdet /objdet
//            cd /dls
//            git submodule update --init external/xbyak_aarch64
//            export GIT_SSH_COMMAND="/usr/bin/ssh -i /root/.ssh/id_rsa_lookup"
//            git submodule update --init data/lookup_files
//            git submodule update --init --recursive
//            unset GIT_SSH_COMMAND
//        """)
//    }
