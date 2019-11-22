
Feature: Alex buy without adding feature
 
  Scenario: The one where user moves to cart without adding any item in it
    Given Alex has register in test me app
    When Alex search a particular product like headphones
   And try to procced to payment without adding any item in the cart
     Then TestmeApp doesnot display the cart item
     