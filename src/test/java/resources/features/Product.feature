Feature: Store Products
  @Return_all_products
  Scenario: Get all products in my store
    Given I have more than 5 products in my store
    And One of these products is a CellPhone
    Then All product should be returned successfully

  @User_adding_a_product
  Scenario: Adding a product in store
    Given The store already has registered products
    And The store has fewer than 3 products
    And The product does not exist in the store
    When The user is going to add a product to the store
    Then The product must be added successfully