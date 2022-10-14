from datetime import datetime

Historico =[]
Saldo = 1000
Contraseña = "1235"
i=0
now = datetime.now()
subopcion = "4"

def menu():
    print("\n \t Bienvenido: \n Jesus Israel Santiago Osorio \n")
    print(" 1. Consultar saldo \n 2. Retirar saldo\n 3. Histórico de Movimientos")

def subMenu():
    print(" 4. Menu \n 5. Salir")
    subopcion = input("Introduzca opción seleccionada")
    return subopcion

while i<3:
    contraseña = input("Introducir contraseña")
    if Contraseña == contraseña:
        while subopcion == "4":
            menu()
            opcion = int(input("Introduzca opción seleccionada"))
            if opcion == 1:
                print(f"Su saldo es: {Saldo}")
                subopcion = subMenu()
            elif opcion == 2:
                cantidad = float(input("Saldo a retirar"))
                if cantidad <= Saldo:
                    Saldo = Saldo - cantidad
                    print(f"Su nuevo saldo es: {Saldo}")
                    Historico.append(f"\nFECHA MOV: {now.date()} \nHORA MOV: {now.time()} \nMONTO RETIRADO: {cantidad} "
                    f"\n SALDO ANTERIOR: {Saldo}\n")
                    subMenu()
                else:
                    print("Saldo insuficiente")
                    subMenu()
            elif opcion == 3:
                for i in range(len(Historico)):
                    print(Historico[i])
                subMenu()
        else:
            break
    else:
     print("Contraseña equivocada")
     i+1
