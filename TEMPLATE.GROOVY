// Exported from:        http://Chitrangs-MacBook-Pro.local:5516/#/templates/Release7150f71104ac4359a742e037664973e9/releasefile
// XL Release version:   8.0.2-SNAPSHOT
// Date created:         Thu Jun 07 20:39:04 CEST 2018

def scmConnectorConfig1 = 'PLEASE IMPLEMENT THIS METHOD'

xlr {
  template('TEmplate') {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-06-07T09:00:00+0200')
    scmConnectorConfig scmConnectorConfig1
    phases {
      phase('New Phase') {
        color '#08B153'
        tasks {
          manual('T1') {
            
          }
          manual('T2') {
            
          }
        }
      }
      phase('New Phase') {
        tasks {
          manual('T1') {
            
          }
          manual('T2') {
            
          }
        }
      }
    }
    teams {
      team('Release Admin') {
        permissions 'release#edit', 'release#lock_task', 'release#start', 'release#reassign_task', 'release#edit_blackout', 'template#view', 'release#edit_security', 'release#abort', 'release#view', 'release#edit_task'
      }
      team('Template Owner') {
        members 'admin'
        permissions 'template#edit', 'template#lock_task', 'template#view', 'template#edit_triggers', 'template#edit_security', 'template#create_release'
      }
    }
  }
}