Feature: Login Admin
#  Scenario: Admin logout dari web
#    Given Admin membuka browser dan url
#    When Admin sudah login dan berada di home
#    And Admin menekan button logout
#    Then Admin diarahkan ke halaman url
#
#  Scenario: Input username null dan password null
#    When Admin input username null
#    And Admin input password null
#    And Admin menekan button login
#    Then Admin mendapatkan message Please fill the fields di username
#
#  Scenario: Input username valid dan password null
#    When Admin input username yang terdaftar
#    And Admin input password null
#    And Admin menekan button login
#    Then Admin mendapatkan message Please fill the fields di password
#
#  Scenario: Input username null dan password valid
#    When Admin input username null
#    And Admin input password yang terdaftar
#    And Admin menekan button login
#    Then Admin mendapatkan message Please fill the fields di username
#
#  Scenario: Input invalid username(case sensitive) dan password valid
#    When Admin input username yang invalid
#    And Admin input password yang terdaftar
#    And Admin menekan button login
#    Then Admin mendapatkan message Wrong username or password
#
#  Scenario: Input username valid dan password invalid case sensitive
#    When Admin logout dari web
#    And Admin input username yang terdaftar
#    And Admin input password yang invalid case sensitive
#    And Admin menekan button login
#    Then Admin mendapatkan message Wrong username or password
#
#  Scenario: Input invalid username dan password valid
#    When Admin input username yang invalid Admin
#    And Admin input password yang terdaftar
#    And Admin menekan button login
#    Then Admin mendapatkan message Wrong username or password
#
#  Scenario: Input invalid username dan password valid
#    When Admin input username yang terdaftar
#    And Admin input password yang invalid admin123
#    And Admin menekan button login
#    Then Admin mendapatkan message Wrong username or password
#
#  Scenario: Input username kurang dari 8 atau lebih dari 16 digit dan password valid
#    When Admin input username kurang dari 8 atau lebih dari 16 digit
#    And Admin input password yang terdaftar
#    And Admin menekan button login
#    Then Admin mendapatkan message Wrong username or password
#
#  Scenario: Input username valid dan password kurang dari 8 atau lebih dari 16 digit
#    When Admin input username yang terdaftar
#    And Admin input password yang kurang dari 8 atau lebih dari 16 digit
#    And Admin menekan button login
#    Then Admin mendapatkan message Wrong username or password
#
#  Scenario: Input username dan password valid
#    When Admin input username yang terdaftar
#    And Admin input password yang terdaftar
#    And Admin menekan button login
#    Then Admin diarahkan ke halaman home
#    And Admin logout dari web