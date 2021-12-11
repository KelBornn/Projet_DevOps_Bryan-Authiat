#!groovy
println('------------------------------------------------------------------Import Job CI/SB3T')
def pipelineScript = new File('/var/jenkins_config/jobs/sb3t-pipeline.groovy').getText("UTF-8")

pipelineJob('CI/sb3t') {
    description("Build .jar from sb3t java application")
    parameters {
        stringParam {
            name('BRANCH')
            defaultValue('master')
            description("branch to pull")
            trim(false)
        }
    }
    definition {
        cps {
            script(pipelineScript)
            sandbox()
        }
    }
}