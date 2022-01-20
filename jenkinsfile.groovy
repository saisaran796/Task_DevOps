pipeline {
    agent {
        node {
            label 'my_server'
            customWorkspace '/projects/'
        }
    }
    stages {
        stage('Static Code Checking') {
            steps {
                script {
                      import pandas as pd
                      dataframe1 = pd.read_excel('Individual parameter coverage - Template.xlsx')
                      print(dataframe1)
                    )
                }
            }
        }
    }
}