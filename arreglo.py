class Ventas:
    def __init__(self):
      
        self.ventas = [
            [500, 300, 150],  
            [400, 250, 200],  
            [350, 450, 300],  
            [600, 350, 250],  
            [700, 300, 350],  
            [550, 400, 450],  
            [600, 500, 400],  
            [650, 550, 300],  
            [620, 350, 250],  
            [590, 300, 300],  
            [560, 270, 200],  
            [700, 350, 150]   
        ]
       
        self.meses = [
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        ]
        
        self.departamentos = ["Ropa", "Deportes", "Juguetería"]

    def buscar_ventas(self, mes, departamento):
      
        if 0 <= mes < 12 and 0 <= departamento < 3:
            return self.ventas[mes][departamento]
        else:
            print("Mes o departamento fuera de rango.")
            return None

    def eliminar_ventas(self,mes, departamento):
      
      if 0 <= mes < 12 and 0 <= departamento < 3:
            self.ventas[mes][departamento] = 0
      else:
            print("Mes o departamento fuera de rango.")

    def imprimir_ventas(self):
        
        print(f"{'Mes':<12} {'Ropa':<10} {'Deportes':<10} {'Juguetería':<10}")
        for i in range(12):
            print(f"{self.meses[i]:<12} {self.ventas[i][0]:<10} {self.ventas[i][1]:<10} {self.ventas[i][2]:<10}")


ventas = Ventas()


print("Ventas iniciales:")
ventas.imprimir_ventas()


print("Buscar ventas:")
mes_buscar = int(input("Ingrese el mes (0-11): "))
dep_buscar = int(input("Ingrese el departamento (0: Ropa, 1: Deportes, 2: Juguetería): "))
resultado = ventas.buscar_ventas(mes_buscar, dep_buscar)
if resultado is not None:
    print("Ventas:", resultado)

print("Eliminar ventas:")
mes_eliminar = int(input("Ingrese el mes (0-11): "))
dep_eliminar = int(input("Ingrese el departamento a eliminar (0: Ropa, 1: Deportes, 2: Juguetería): "))
ventas.eliminar_ventas(mes_eliminar,dep_eliminar)
print("Ventas después de eliminar:")
ventas.imprimir_ventas()

