Feature: Search for the product via different available criteria

### Please use endpoint GET https://waarkoop-server.herokuapp.com/api/v1/search/demo/{product} for getting the products.
### Available products: "orange", "apple", "pasta", "cola"
### Prepare Positive and negative scenarios

  Scenario Outline:Verify request that is searching 'orange' returns correct status code and correct data
    When he calls endpoint "https://waarkoop-server.herokuapp.com/api/v1/search/demo/<expectedUrl>"
    Then he sees status code that equals '200'
    And he verifies that result is not empty
    And he verifies that title contains text "<expectedMessageInTitle>"

    Examples:
      | expectedUrl | expectedMessageInTitle |
      | orange      | orange                 |
      | apple       | apple                  |
      | pasta       | pasta                  |
      | cola        | cola                   |


  Scenario:Verify request that is searching 'cars' returns error message inside
    When he calls endpoint "https://waarkoop-server.herokuapp.com/api/v1/search/demo/cars"
    Then he sees status code that equals '404'
    And he verifies that response contains error section
