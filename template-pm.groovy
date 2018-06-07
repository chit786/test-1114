// Exported from:        http://Chitrangs-MacBook-Pro.local:5516/#/templates/Folder8bd8b0fdfeea44bfbd7ebde9c295ccfc-Folderf0bbb732c8764c85949cc091531a8118-Release4c6e3395c63c4a3590c5054ab8ba613b/releasefile
// XL Release version:   8.0.2-SNAPSHOT
// Date created:         Thu Jun 07 20:54:05 CEST 2018

def scmConnectorConfig1 = 'PLEASE IMPLEMENT THIS METHOD'

xlr {
  template('Product Management Release Process') {
    folder('f1/f2')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-01-19T09:00:00+0100')
    scmConnectorConfig scmConnectorConfig1
    phases {
      phase('Before First Sprint') {
        color '#009CDB'
        tasks {
          parallelGroup('Before First Sprint Parallel Tasks') {
            tasks {
              manual('Create release overview page') {
                description '•	A summary of major features and improvements in the release, with links to the appropriate business cases and/or JIRA tickets\n' +
                            '\n' +
                            '•	An indication of which features are headline features\n' +
                            '\n' +
                            '•	Should not contain release status – instead, release status should be from weekly status email.  For now, include note on page indicating where to find/subscribe to status.\n' +
                            '\n' +
                            '•	Solutions/Feature/Thought Leadership team items should align to product rather then being set up as their own “product” with their own overview pages'
                owner 'jlenny'
                watchers 'lwells', 'ajohnston'
              }
              manual('Team review open feature requests in ZenDesk & JIRA') {
                description 'JIRA query to use:\n' +
                            '\n' +
                            'project in ("XL Release", "XL Deploy") AND labels in ("jira_escalated") AND status not in ("Closed", "Resolved")'
                owner 'jlenny'
              }
              manual('Team innovation check-in') {
                description 'From Nadia:\n' +
                            '\n' +
                            'Here couple of ideas that I have noted down as a start:\n' +
                            '\n' +
                            '1.            Organise workshops to boost ideas (similar like one with Serge. I have seen how many people were inspired by the tips he have given and started trying them immediately for the work).\n' +
                            '\n' +
                            '2.            Give people possibility to come up with solutions (and implement them). There is currently a disbelieve in Dev teams if they will thing of something cool during Tech Rally – it will not reach the core product.\n' +
                            '\n' +
                            '3.            Support people in generating ideas – show examples, encourage new ideas, etc.\n' +
                            '\n' +
                            '4.            Set clear goals and vision for the company (make sure employees understand why they are set and not the others). This one is very important for people’s motivation.\n' +
                            '                \n' +
                            '5.            Implement a IMO (in my opinion) message board on the company’s intranet, so all staff could have their say on how they would like to see things improve.\n' +
                            '                \n' +
                            '6.            Innovation days - where we can improve? Survey would be helpful here. \n' +
                            '\n' +
                            'This article describes the areas we can improve very well on my opinion: https://www.irishtimes.com/business/five-ways-to-create-a-culture-of-innovation-in-the-workplace-1.1557801'
                owner 'jlenny'
              }
              parallelGroup('Create business cases') {
                description 
                owner 'asahu'
                watchers 'lwells', 'ajohnston'
                tasks {
                  manual('Create XL Release business cases') {
                    description 'Template available at https://xebialabs.atlassian.net/wiki/spaces/XLDEP/pages/91979783/Business+Case+Template\n' +
                                '\n' +
                                'Be sure to link to appropriate release on roadmap: https://xebialabs.atlassian.net/wiki/spaces/XLDEP/pages/59015190/Roadmap\n' +
                                '\n' +
                                'Tag Lauren in business case if user research is requested'
                    owner 'mvarshney'
                    watchers 'lwells', 'ajohnston'
                  }
                  manual('Create XL Deploy business cases') {
                    description 'Template available at https://xebialabs.atlassian.net/wiki/spaces/XLDEP/pages/91979783/Business+Case+Template\n' +
                                '\n' +
                                'Be sure to link to appropriate release on roadmap: https://xebialabs.atlassian.net/wiki/spaces/XLDEP/pages/59015190/Roadmap\n' +
                                '\n' +
                                'Tag Lauren in business case if user research is requested'
                    owner 'jhartley'
                    watchers 'lwells', 'ajohnston'
                  }
                  manual('Create XL Impact business cases') {
                    description 'Template available at https://xebialabs.atlassian.net/wiki/spaces/XLDEP/pages/91979783/Business+Case+Template\n' +
                                '\n' +
                                'Be sure to link to appropriate release on roadmap: https://xebialabs.atlassian.net/wiki/spaces/XLDEP/pages/59015190/Roadmap\n' +
                                '\n' +
                                'Tag Lauren in business case if user research is requested'
                    owner 'asahu'
                    watchers 'lwells', 'ajohnston'
                  }
                  manual('Create Integrations business cases') {
                    description 'Template available at https://xebialabs.atlassian.net/wiki/spaces/XLDEP/pages/91979783/Business+Case+Template\n' +
                                '\n' +
                                'Be sure to link to appropriate release on roadmap: https://xebialabs.atlassian.net/wiki/spaces/XLDEP/pages/59015190/Roadmap\n' +
                                '\n' +
                                'Tag Lauren in business case if user research is requested'
                    owner 'kmalhotra'
                    watchers 'ajohnston', 'lwells'
                  }
                }
              }
              manual('Schedule launch plan/kickoff meeting') {
                description '•	Invite marketing, development, product, support, customer success.  Sales is not invited in order to avoid confusing messaging; they will be communicated to during trainings once things are more finalized.\n' +
                            '\n' +
                            '•	This is not the point to debate what the features are anymore, that should be done previously, but to share our plan\n' +
                            '\n' +
                            '•	During the meeting the launch plan will be shared, but most importantly business cases and content from release overview page will be reviewed\n' +
                            '\n' +
                            '•	Jason also owns follow up on ongoing basis to ensure items are completed, as necessary'
                owner 'jlenny'
              }
            }
          }
        }
      }
      phase('During First Sprint') {
        color '#ff9e3b'
        tasks {
          parallelGroup('First Sprint Parallel Tasks') {
            tasks {
              manual('Schedule technical product training') {
                description 'Invite: xl-product@xebialabs.com; xl-sales-all@xebialabs.com; xl-se-all@xebialabs.com; xl-support@xebialabs.com; xl-customer-success-team@xebialabs.com; xl-marketing@xebialabs.com\n' +
                            '\n' +
                            '1.5 hrs\n' +
                            '\n' +
                            '- Schedule to take place during final sprint\n' +
                            '\n' +
                            '- During this session, Product Managers describe and demo the main features of the release and cover any important details that technical people (SE’s/Support) should know when they demo features (such as technical limitations), and cover how these should be part of the SE demo. They also make themselves available for Q&A.\n' +
                            '\n' +
                            '- The SEs have a standing meeting every Monday at 17:30 CET (11:30 ET), which can potentially be used for training sessions. Amit Mohleji is the contact person for that meeting.  Tip: If the training session will happen during the SEs’ standing meeting, ask Amit to update the meeting invitation so people know that it will be a special session.  If the SEs’ standing meeting can’t be used for training, then Product Management must find a different timeslot and send the meeting invitation. TJ Randall is another contact person who can help with finding a timeslot.\n' +
                            '\n' +
                            '- Ensure that the training session is recorded. If BlueJeans is used, then the meeting organizer must start the recording. After the session, put the recording on Box.'
                owner 'jlenny'
              }
              manual('Schedule non-technical product training') {
                description 'Invite: xl-product@xebialabs.com; xl-sales-all@xebialabs.com; xl-se-all@xebialabs.com; xl-support@xebialabs.com; xl-customer-success-team@xebialabs.com; xl-marketing@xebialabs.com\n' +
                            '\n' +
                            '1 hr\n' +
                            '\n' +
                            '- Schedule to take place during final sprint\n' +
                            '\n' +
                            '- Product Management holds a 1 hr training session for non-technical teams. This is a high-level explanation of the main features of the features in the release and their business value. In most cases, a full feature demo is not needed. Q&A is a core part of this training.\n' +
                            '\n' +
                            '- Ensure that the training session is recorded. If BlueJeans is used, then the meeting organizer must start the recording. After the session, put the recording on Box.'
                owner 'jlenny'
              }
            }
          }
        }
      }
      phase('Before Final Sprint') {
        color '#ff9e3b'
        tasks {
          parallelGroup('Write blog posts') {
            tasks {
              manual('Write overview blog post') {
                description '- A blog post is initially drafted by a Product Manager, using the business case as a source. The Product Manager is responsible for arranging any examples and/or screenshots that are needed (if the standard set of release screenshots can’t be used).\n' +
                            '\n' +
                            '- When complete, submit to marketing for final editing/scheduling.'
                owner 'jlenny'
                watchers 'lwells', 'ajohnston'
              }
              manual('Write XL Release blog post(s) if needed') {
                description '- When complete, submit to marketing for final editing/scheduling.'
                owner 'mvarshney'
                watchers 'lwells', 'ajohnston'
              }
              manual('Write XL Deploy blog post(s) if needed') {
                description '- When complete, submit to marketing for final editing/scheduling.'
                owner 'jhartley'
                watchers 'ajohnston', 'lwells'
              }
              manual('Write XL Impact blog post(s) if needed') {
                description '- When complete, submit to marketing for final editing/scheduling.'
                owner 'asahu'
                watchers 'ajohnston', 'lwells'
              }
              manual('Write Integrations blog post(s) if needed') {
                description '- When complete, submit to marketing for final editing/scheduling.'
                owner 'kmalhotra'
                watchers 'lwells', 'ajohnston'
              }
            }
          }
          manual('Add overview blog post to release overview page') {
            owner 'jlenny'
          }
          manual('Write single forum announcement for all products') {
            owner 'jlenny'
          }
        }
      }
      phase('During Final Sprint') {
        color '#ff9e3b'
        tasks {
          parallelGroup('Create final LT/sales deck for release') {
            tasks {
              manual('Create final release deck for Release') {
                owner 'mvarshney'
              }
              manual('Create final release deck for Deploy') {
                owner 'jhartley'
              }
              manual('Create final release deck for Impact') {
                owner 'asahu'
              }
              manual('Create final release deck for Integrations') {
                owner 'kmalhotra'
              }
              manual('Present final deck to Rob') {
                owner 'jlenny'
              }
              manual('Deliver final deck to sales/marketing department heads') {
                
              }
            }
          }
          parallelGroup('Final Sprint Parallel Tasks') {
            tasks {
              parallelGroup('Screenshots/doc/video updates') {
                tasks {
                  manual('XL Impact screenshots/doc/video updates') {
                    description '- Sometimes a release includes known issues or other things that it’s useful for the Support Team to know. The Product Managers are responsible for communicating this information to the Support Team (xl-support@xebialabs.com).\n' +
                                '\n' +
                                '- For each release, we take a small collection of screenshots that show interesting new features or changes in the product GUI. For releases with major GUI changes, we take a complete set of screenshots so we have them available as needed.  These are placed in Box: https://xebialabs.app.box.com/folder/18826892981\n' +
                                '\n' +
                                '- Screenshots may also be relevant for plugins – for example, it can make sense to take a screenshot of a deployment plan that shows the functionality of a particular plugin – but this is pretty rare.\n' +
                                '\n' +
                                '- Screenshots can be used in blog posts, social media posts, presentations, web pages, and any other place where someone needs to visually represent a feature. They’re particularly useful for people in Marketing and Sales who might not have a local setup where they can take their own screenshots.\n' +
                                '\n' +
                                '- Note: It’s important for screenshots to use high-quality sample data; text fields that say “asdfasdfasdf” or “test 123” are obviously unprofessional, but other types of data can be confusing, too. For example, an image of an XL Release template called “Release XL Release” is confusing for people who aren’t familiar with the product (and even those who are).\n' +
                                '\n' +
                                '- A release might include features that would benefit from a video. Product Management and Product Marketing work together to determine if a video is needed and collaborate on writing the script.'
                    owner 'asahu'
                    watchers 'ajohnston', 'lwells'
                  }
                  manual('XL Release screenshots/doc/video updates') {
                    description '- Sometimes a release includes known issues or other things that it’s useful for the Support Team to know. The Product Managers are responsible for communicating this information to the Support Team (xl-support@xebialabs.com).\n' +
                                '\n' +
                                '- For each release, we take a small collection of screenshots that show interesting new features or changes in the product GUI. For releases with major GUI changes, we take a complete set of screenshots so we have them available as needed.  These are placed in Box: https://xebialabs.app.box.com/folder/18826892981\n' +
                                '\n' +
                                '- Screenshots may also be relevant for plugins – for example, it can make sense to take a screenshot of a deployment plan that shows the functionality of a particular plugin – but this is pretty rare.\n' +
                                '\n' +
                                '- Screenshots can be used in blog posts, social media posts, presentations, web pages, and any other place where someone needs to visually represent a feature. They’re particularly useful for people in Marketing and Sales who might not have a local setup where they can take their own screenshots.\n' +
                                '\n' +
                                '- Note: It’s important for screenshots to use high-quality sample data; text fields that say “asdfasdfasdf” or “test 123” are obviously unprofessional, but other types of data can be confusing, too. For example, an image of an XL Release template called “Release XL Release” is confusing for people who aren’t familiar with the product (and even those who are).\n' +
                                '\n' +
                                '- A release might include features that would benefit from a video. Product Management and Product Marketing work together to determine if a video is needed and collaborate on writing the script.'
                    owner 'mvarshney'
                    watchers 'ajohnston', 'lwells'
                  }
                  manual('XL Deploy screenshots/doc/video updates') {
                    description '- Sometimes a release includes known issues or other things that it’s useful for the Support Team to know. The Product Managers are responsible for communicating this information to the Support Team (xl-support@xebialabs.com).\n' +
                                '\n' +
                                '- For each release, we take a small collection of screenshots that show interesting new features or changes in the product GUI. For releases with major GUI changes, we take a complete set of screenshots so we have them available as needed.  These are placed in Box: https://xebialabs.app.box.com/folder/18826892981\n' +
                                '\n' +
                                '- Screenshots may also be relevant for plugins – for example, it can make sense to take a screenshot of a deployment plan that shows the functionality of a particular plugin – but this is pretty rare.\n' +
                                '\n' +
                                '- Screenshots can be used in blog posts, social media posts, presentations, web pages, and any other place where someone needs to visually represent a feature. They’re particularly useful for people in Marketing and Sales who might not have a local setup where they can take their own screenshots.\n' +
                                '\n' +
                                '- Note: It’s important for screenshots to use high-quality sample data; text fields that say “asdfasdfasdf” or “test 123” are obviously unprofessional, but other types of data can be confusing, too. For example, an image of an XL Release template called “Release XL Release” is confusing for people who aren’t familiar with the product (and even those who are).\n' +
                                '\n' +
                                '- A release might include features that would benefit from a video. Product Management and Product Marketing work together to determine if a video is needed and collaborate on writing the script.'
                    owner 'jhartley'
                    watchers 'ajohnston', 'lwells'
                  }
                  manual('Integrations screenshots/doc/video updates') {
                    description '- Sometimes a release includes known issues or other things that it’s useful for the Support Team to know. The Product Managers are responsible for communicating this information to the Support Team (xl-support@xebialabs.com).\n' +
                                '\n' +
                                '- For each release, we take a small collection of screenshots that show interesting new features or changes in the product GUI. For releases with major GUI changes, we take a complete set of screenshots so we have them available as needed.  These are placed in Box: https://xebialabs.app.box.com/folder/18826892981\n' +
                                '\n' +
                                '- Screenshots may also be relevant for plugins – for example, it can make sense to take a screenshot of a deployment plan that shows the functionality of a particular plugin – but this is pretty rare.\n' +
                                '\n' +
                                '- Screenshots can be used in blog posts, social media posts, presentations, web pages, and any other place where someone needs to visually represent a feature. They’re particularly useful for people in Marketing and Sales who might not have a local setup where they can take their own screenshots.\n' +
                                '\n' +
                                '- Note: It’s important for screenshots to use high-quality sample data; text fields that say “asdfasdfasdf” or “test 123” are obviously unprofessional, but other types of data can be confusing, too. For example, an image of an XL Release template called “Release XL Release” is confusing for people who aren’t familiar with the product (and even those who are).\n' +
                                '\n' +
                                '- A release might include features that would benefit from a video. Product Management and Product Marketing work together to determine if a video is needed and collaborate on writing the script.'
                    owner 'kmalhotra'
                    watchers 'ajohnston', 'lwells'
                  }
                }
              }
              manual('Adding new plugins to gallery') {
                description 
                owner 'kmalhotra'
              }
            }
          }
        }
      }
      phase('After Release') {
        color '#68b749'
        tasks {
          manual('Ensure forum announcements/docs are live') {
            description 'Can be checked here: https://support.xebialabs.com/hc/en-us/sections/200854045-Announcements'
            owner 'jlenny'
          }
          manual('Internal Announcement Email') {
            description '- To share the news internally, Product Management announces the release by sending an email to xl-all. The announcement includes:\n' +
                        '\n' +
                        '- The products and all plugins that were released\n' +
                        '\n' +
                        '- A brief summary of the major features in the release (can be taken from the Overview pages in Confluence)\n' +
                        '\n' +
                        '- Links to support forum announcements, release manuals, and any other relevant materials that are available when the post goes up (such as recordings of training sessions)'
            owner 'jlenny'
          }
          parallelGroup('Ensure that release overview page(s) and business cases reflect final status') {
            tasks {
              manual('Final check XL Release overview page & Business Cases') {
                description 'Check that the product specific landing page (underneath the main release landing page) is accurate with final features that made it in to the product and any other small items that were included worth calling out.'
                owner 'mvarshney'
              }
              manual('Final check XL Impact overview page & Business Cases') {
                description 'Check that the product specific landing page (underneath the main release landing page) is accurate with final features that made it in to the product and any other small items that were included worth calling out.'
                owner 'asahu'
              }
              manual('Final check XL Deploy overview page & Business Cases') {
                description 'Check that the product specific landing page (underneath the main release landing page) is accurate with final features that made it in to the product and any other small items that were included worth calling out.'
                owner 'jhartley'
              }
              manual('Final check Integrations overview page & Business Cases') {
                description 'Check that the product specific landing page (underneath the main release landing page) is accurate with final features that made it in to the product and any other small items that were included worth calling out.'
                owner 'kmalhotra'
              }
            }
          }
          manual('Team review old items >1.5 years') {
            description 'JIRA filter to use:\n' +
                        '\n' +
                        'https://xebialabs.atlassian.net/secure/Dashboard.jspa?selectPageId=12802'
            owner 'jlenny'
          }
        }
      }
    }
    extensions {
      dashboard('Dashboard') {
        tiles {
          releaseProgressTile('Release progress') {
            supportedScopes 'release'
          }
          releaseHealthTile('Release health') {
            supportedScopes 'release'
          }
          releaseSummaryTile('Release summary') {
            supportedScopes 'release'
          }
          resourceUsageTile('Resource usage') {
            width 1
            col 2
            supportedScopes 'release'
          }
          timelineTile('Release timeline') {
            supportedScopes 'release'
          }
          jiraQueryTile('JIRA issues Work in Progress') {
            row 2
            col 1
            query 'fixversion = 8.1 AND Status in ("In Progress", "In review", Testing, Test, "Action Needed")'
          }
          jiraQueryTile('JIRA issues, all Issues Release 8.1') {
            row 2
            col 0
            query 'fixversion = 8.1'
          }
        }
      }
    }
    
  }
}