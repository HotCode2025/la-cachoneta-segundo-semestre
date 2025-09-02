# 5.7 Ejercicio 8: Menu interactivo - Cajero automatico
# Hacer un programa que simule un cajero automatico con un saldo
# inicial de 1000$ y tendra el siguiente menu de opciones: 
#   1.Ingresar dinero en la cuenta
#   2.Retirar dinero en la cuenta
#   3.Mostrar dinero disponible
#   4.Salir

saldo = 1000

while True:
    print("\n--- Cajero Automático ---")
    print("1. Ingresar dinero en la cuenta")
    print("2. Retirar dinero de la cuenta")
    print("3. Mostrar dinero disponible")
    print("4. Salir")
    
    opcion = input("Seleccione una opción: ")
    
    if opcion == "1":
        ingreso = float(input("¿Cuánto dinero desea ingresar?: "))
        saldo += ingreso
        print(f"Ingresaste ${ingreso}. Saldo actual: ${saldo}")
        
    elif opcion == "2":
        retiro = float(input("¿Cuánto dinero desea retirar?: "))
        if retiro > saldo:
            print("Fondos insuficientes")
        else:
            saldo -= retiro
            print(f"Retiraste ${retiro}. Saldo actual: ${saldo}")
            
    elif opcion == "3":
        print(f"Saldo disponible: ${saldo}")
        
    elif opcion == "4":
        print("Gracias por usar el cajero. ¡Hasta luego!")
        break
    
    else:
        print("Opción no válida. Intente de nuevo.")
      
