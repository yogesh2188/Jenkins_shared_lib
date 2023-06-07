

def call(credentialsId){
  
  waitForQualityGate abortPipeline: false, credentialsId: 'sonarqube-Api'

//waitForQualityGate abortPipeline: false, credentialsId: credentialsId

}


