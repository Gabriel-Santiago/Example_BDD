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

  Scenario: Deleting a product from the store
    Given The store already has registered many products
    And The product "Power Bank" is registered in the store
    When The user deletes the product "Power Bank" from the store
    Then The product "Power Bank" should be removed from the store
    And The store should have one less product

  Scenario: Updating a product in the store
    Given The store already has registered any products
    And The product "Mouse" was registered in the store
    When The user updates the product "Mouse" to "Wireless Mouse" in the store
    Then The product "Wireless Mouse" should be in the store
    And The product "Mouse" should no longer be in the store