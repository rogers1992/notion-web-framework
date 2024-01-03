## Getting Started

This is basic web automation framework focused to test the Trello aplication.

### Prerequisites

you will need to have installed the following technologies.

- java 17.0.8
- Gradle 8.4
- Trello Account 

### Execute Test
* run Gradle command using your {trello_username} and {trello_pass} and browser supported e.g CHROME or FIREFOX
  ```sh
  gradle clean trello-web-automation:executeFeature -DenvironmentName=QA -DcucumberTags="@regression" -DuserName="{trello_username}" -DuserPassword="{trello_pass}" -Dbrowser=FIREFOX
  ```
