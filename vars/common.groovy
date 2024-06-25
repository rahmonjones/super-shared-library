def call(String stageName){
if ("${stageName}" == "Build")
  {
   sh "echo validating code"
   sh "echo compiling code"
   sh "echo testing code"
   sh "mvn clean package"
  }
else if ("${stageName}" == "CodeQuality Report")
     {
     sh "echo performing Code quality checks"
     sh "mvn sonar:sonar"
     sh " echo CodeQuality Report Analysis completed"
     }
 else if ("${stageName}" == "UploadArtifact backup")
     {
     sh "echo using deploy container plugin"
     sh "mvn deploy"
}
}
