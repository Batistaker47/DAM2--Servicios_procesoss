# IMPORTO LA CLASE DATETIME Y TIME PARA USARLAS MÁS ADELANTE

from datetime import datetime

# CREAMOS LA CLASE BCOLORS PARA DAR FORMATO DE COLOR Y FONDO A LOS HILOS

class bcolors:
    HEADER = '\033[95m'
    OKBLUE = '\033[94m'
    OKCYAN = '\033[96m'
    OKGREEN = '\033[92m'
    WARNING = '\033[93m'
    FAIL = '\033[91m'
    ENDC = '\033[0m'
    BOLD = '\033[1m'
    UNDERLINE = '\033[4m'

# GUARDAMOS EN VARIABLES LOS COLORES DE LA CLASE BCOLORS

verde = bcolors.OKGREEN
red = bcolors.FAIL
azul = bcolors.OKBLUE
amarillo = bcolors.WARNING

# CREAMOS UNA FUNCIÓN PARA MOSTRAR LA HORA DE PROCESO DE CADA HILO, EN LA QUE REALIZAMOS UN BUCLE, DENTRO DEL CUAL MOSTRAMOS LA HORA Y EL COLOR IMPRESO EN CONSOLA.
def mostrar_hora(color):
    for n in range (100):
        hora = datetime.now().strftime ("%H:%M:%S.%f")
        print(f"{color}#{n}:{hora}")

# SI EL PROCESO SE EJECUTA EN LA CLASE CON NOMBRE MAIN, LLAMA A LA FUNCIÓN CON EL COLOR CORRESPONDIENTE
if __name__ == "__main__":
    inicio = datetime.now()
    mostrar_hora(verde)
    mostrar_hora(red)
    mostrar_hora(azul)
    mostrar_hora(amarillo)

# UNA VEZ FINALIZADO, MUESTRA EL TIEMPO DE EJECUCIÓN

    print()
    print(f"Finalizado en {(datetime.now()-inicio).total_seconds()} segundos")