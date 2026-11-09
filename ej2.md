# Ejercicio 2: CargaNotasExamen

## Explicación Lógica
1. **Captura Múltiple:** Se implementan bloques `catch` específicos para capturar `NumberFormatException` (conversión fallida de String a double) y `ArrayIndexOutOfBoundsException` (posición de arreglo inexistente).
2. **Garantía de Cierre con `finally`:** La cláusula `finally` asegura la ejecución del mensaje de auditoría sin importar si la operación finalizó de manera exitosa o si ocurrió una excepción.