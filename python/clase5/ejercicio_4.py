# Ejercicio 4: Calculadora de impuestos
# Crear una función para calcular el total de un pago incluyendo
# un impuesto aplicado. (IVA)
# Fórmula: pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto / 100)
# Proporcione el pago sin impuesto: 1000
# Proporcione el monto del impuesto: 21%
# Pago con impuesto: xxxxx
pago_sin_impuesto = 1000
impuesto = 21

pago_con_impuesto = pago_sin_impuesto * (1 + impuesto / 100)

print("Pago con impuesto:", pago_con_impuesto)