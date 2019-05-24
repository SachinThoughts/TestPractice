Feature: Click on FileDownload Link

@FileDownload
Scenario: Browse Url & download file
    Given I navigate to given URL
    When I click on 'FileDownloadLink'
    And select any file
    Then file is downloaded