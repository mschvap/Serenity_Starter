Feature: Verificar productos de compra

  Scenario: Verificar todos los productos disponibles para la compra
    Given Juan ingresa a la pagina de compra
    When Juan agrega los items al carrito de compra
      | Sauce Labs Backpack               |
      | Sauce Labs Bike Light             |
      | Sauce Labs Bolt T-Shirt           |
      | Sauce Labs Fleece Jacket          |
      | Sauce Labs Onesie                 |
      | Test.allTheThings() T-Shirt (Red) |
    Then verifica todos los items agregados

  Scenario: Verificar todos los productos disponibles para la compra y precio
    Given Juan ingresa a la pagina de compra
    Then verificas catalogo con nombre y precio de producto
      | Nombre                            | Precio |
      | Sauce Labs Backpack               | 29.99  |
      | Sauce Labs Bike Light             | 9.99   |
      | Sauce Labs Bolt T-Shirt           | 15.99  |
      | Sauce Labs Fleece Jacket          | 49.99  |
      | Sauce Labs Onesie                 | 7.99   |
      | Test.allTheThings() T-Shirt (Red) | 15.99  |

