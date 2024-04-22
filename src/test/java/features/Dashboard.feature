Feature: Dashboard and plugin validation

  @dashboardplugincheck
  Scenario: I want to check WP Dark plugin activate for my site
    Then I click on plugins menu from the settings and navigate to the plugin details screen
    When I am on plugin screen search the wp dark mode plugin
    Then I check the plugin is exist for the site with validate a text

    @swtichsettings
    Scenario: I want to select menu switch options
      When I am on the settings screen click on customization menu
      Then I found switch settings option click on it and select menu switch options

      @swtichcustomscale
      Scenario: I want to set custom floating swtich size into 220
        When I am  on the swtich settings screen and scroll down to swtich customization
        Then I click on custom button and enter the scale size
        And I click save changes button

