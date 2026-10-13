# DOCUMENTACION

## 1. Descripción del problema

Este programa simula una parte de una tienda en línea.

Permite calcular el subtotal de una compra, verificar si una compra es válida, aplicar descuentos y obtener el precio final que debe pagar el cliente.

Es importante comprobar estos cálculos porque un error podría generar cobros incorrectos.

## 2. Reglas de negocio

### Subtotal

El subtotal se obtiene multiplicando el precio por la cantidad.

Ejemplo:

- Precio: $100
- Cantidad: 3
- Subtotal: $300

### Compra válida

Una compra es válida cuando:

- El precio es mayor que 0.
- La cantidad es mayor que 0.

### Descuento

Si el subtotal es igual o mayor a $1000, se aplica un descuento del 10%.

Si el subtotal es menor a $1000, no se aplica descuento.

### Precio final

El precio final se obtiene restando el descuento al subtotal.

## 3. Casos de prueba

### calculateSubtotal

- Entrada: precio = 100, cantidad = 3
    - Resultado esperado: 300
    - Resultado obtenido: 300
    - Propósito: verificar la multiplicación.

- Entrada: precio = 250, cantidad = 1
    - Resultado esperado: 250
    - Resultado obtenido: 250
    - Propósito: verificar una compra simple.

- Entrada: precio = 0, cantidad = 5
    - Resultado esperado: 0
    - Resultado obtenido: 0
    - Propósito: verificar el cálculo con precio cero.

### isValidPurchase

- Entrada: precio = 100, cantidad = 2
    - Resultado esperado: true
    - Resultado obtenido: true
    - Propósito: verificar una compra válida.

- Entrada: precio = 0, cantidad = 2
    - Resultado esperado: false
    - Resultado obtenido: false
    - Propósito: verificar precio inválido.

- Entrada: precio = 100, cantidad = 0
    - Resultado esperado: false
    - Resultado obtenido: false
    - Propósito: verificar cantidad inválida.

- Entrada: precio = -50, cantidad = 2
    - Resultado esperado: false
    - Resultado obtenido: false
    - Propósito: verificar precio negativo.

### calculateDiscount

- Entrada: subtotal = 999
    - Resultado esperado: 0
    - Resultado obtenido: 0
    - Propósito: verificar que no aplica descuento.

- Entrada: subtotal = 1000
    - Resultado esperado: 100
    - Resultado obtenido: 100
    - Propósito: verificar el límite del descuento.

- Entrada: subtotal = 1500
    - Resultado esperado: 150
    - Resultado obtenido: 150
    - Propósito: verificar el descuento aplicado.

### calculateFinalPrice

- Entrada: subtotal = 800
    - Resultado esperado: 800
    - Resultado obtenido: 800
    - Propósito: verificar una compra sin descuento.

- Entrada: subtotal = 1500
    - Resultado esperado: 1350
    - Resultado obtenido: 1350
    - Propósito: verificar una compra con descuento.

- Entrada: subtotal = 1000
    - Resultado esperado: 900
    - Resultado obtenido: 900
    - Propósito: verificar el límite exacto para aplicar descuento.

## 4. Resultados de ejecución

- Pruebas ejecutadas: 13
- Pruebas aprobadas: 13
- Pruebas fallidas: 0

Todas las pruebas se ejecutaron correctamente.

## 5. Errores que se pueden prevenir

- No aplicar el descuento cuando el subtotal es exactamente $1000.
- Calcular incorrectamente el porcentaje de descuento.
- Permitir compras con precio o cantidad igual a cero.

## 6. Conclusión

Las pruebas unitarias ayudan a verificar que las reglas de negocio funcionan correctamente.

Gracias a estas pruebas es posible detectar errores antes de que el sistema sea utilizado por los clientes y aumentar la confiabilidad de la aplicación.