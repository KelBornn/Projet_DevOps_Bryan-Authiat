#!groovy
println('------------------------------------------------------------------Import Job IaC/terraform')
def pipelineScript = new File('/var/jenkins_config/jobs/terraform-pipeline.groovy').getText("UTF-8")

pipelineJob('IaC/terraform') {
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