pipeline {
  agent any
  stages {
    stage('Stage') {
      steps {
        sh 'pwd'
        echo 'Stage Completed '
      }
    }

    stage('Build') {
      parallel {
        stage('Build') {
          steps {
            echo 'Building'
          }
        }

        stage('BuildA') {
          steps {
            echo 'Build Done'
          }
        }

      }
    }

    stage('Test') {
      steps {
        echo 'Tested'
      }
    }

    stage('Deploy') {
      steps {
        input(message: 'Yes/No', id: '1')
        echo 'Deployed'
      }
    }

  }
}