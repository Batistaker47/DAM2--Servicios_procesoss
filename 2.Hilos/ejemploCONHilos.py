# IMPORTO LA CLASE THREADING, DATETIME Y TIME PARA USARLAS MÁS ADELANTE
import threading
from datetime import datetime
import time

# CREAMOS LA CLASE BCOLORS PARA DAR FORMATO DE COLOR Y FONDO A LOS HILOS
class bcolors:
    Black='\033[30m'
    Red='\033[31m'
    Green='\033[32m'
    Yellow='\033[33m'
    Blue='\033[34m'
    Purple='\033[35m'
    Cyan='\033[36m'
    LightGray='\033[37m'
    DarkGray='\033[30m'
    LightRed='\033[31m'
    LightGreen='\033[32m'
    LightYellow='\033[93m'
    LightBlue='\033[34m'
    LightPurple='\033[35m'
    LightCyan='\033[36m'
    White='\033[97m'
    BckgrDefault='\033[49m'
    BckgrBlack='\033[40m'
    BckgrRed='\033[41m'
    BckgrGreen='\033[42m'
    BckgrYellow='\033[43m'
    BckgrBlue='\033[44m'
    BckgrPurple='\033[45m'
    BckgrCyan='\033[46m'
    BckgrLightGray='\033[47m'
    BckgrDarkGray='\033[100m'
    BckgrLightRed='\033[101m'
    BckgrLightGreen='\033[102m'
    BckgrLightYellow='\033[103m'
    BckgrLightBlue='\033[104m'
    BckgrLightPurple='\033[105m'
    BckgrLightCyan='\033[106m'
    BckgrWhite='\033[107m'

# GUARDAMOS EN VARIABLES LOS COLORES DE LA CLASE BCOLORS
verde = bcolors.Green
red = bcolors.Red
azul = bcolors.Blue
amarillo = bcolors.Yellow

negro = bcolors.Black
morado = bcolors.   Purple
cyan = bcolors.Cyan
gris = bcolors.LightGray

blanco = bcolors.White
LightGray = bcolors.LightGray
LightYellow = bcolors.LightYellow
LightBlue = bcolors.LightBlue

BckgrDarkGray = bcolors.BckgrDarkGray
BckgrLightYellow = bcolors.BckgrLightYellow
BckgrLightBlue = bcolors.BckgrLightBlue
BckgrLightPurple = bcolors.BckgrLightPurple

BckgrWhite = bcolors.BckgrWhite
BckgrLightCyan = bcolors.BckgrLightCyan
BckgrRed = bcolors.BckgrRed
BckgrGreen = bcolors.BckgrGreen

# CREAMOS UNA FUNCIÓN PARA MOSTRAR LA HORA DE PROCESO DE CADA HILO, EN LA QUE REALIZAMOS UN BUCLE, DENTRO DEL CUAL MOSTRAMOS LA HORA Y EL COLOR IMPRESO EN CONSOLA.
# AÑADIMOS UN SLEEP PARA QUE ESPERE 3 SEGUNDOS ENTRE VUELTA Y VUELTA DEL BUCLE
def mostrar_hora(color):
    for n in range (100):
        hora = datetime.now().strftime ("%H:%M:%S.%f")
        print(f"{color}#{n}:{hora}")
        time.sleep(3)

# GUARDAMOS EN UNA VARIABLE LA FECHA Y HORA ACTUAL

inicio = datetime.now()

# GUARDAMOS EN VARIABLES LOS DISTINTOS HILOS, A LOS QUE LE PASAMOS EL NOMBRE DEL HILO, LA FUNCION A REALIZAR EN DICHO HILO Y EL COLOR QUE METEREMOS EN LA TUPLA DE COLORES DE CADA HILO
h1 = threading.Thread(name="Hilo verde",target= mostrar_hora, args= (verde,))
h2 = threading.Thread(name="Hilo rojo",target= mostrar_hora, args= (red,))
h3 = threading.Thread(name="Hilo azul",target= mostrar_hora, args= (azul,))
h4 = threading.Thread(name="Hilo amarillo",target= mostrar_hora, args= (amarillo,))

h5 = threading.Thread(name="Hilo A",target= mostrar_hora, args= (negro,))
h6 = threading.Thread(name="Hilo B",target= mostrar_hora, args= (morado,))
h7 = threading.Thread(name="Hilo C",target= mostrar_hora, args= (cyan,))
h8 = threading.Thread(name="Hilo D",target= mostrar_hora, args= (gris,))

h9 = threading.Thread(name="Hilo E",target= mostrar_hora, args= (blanco,))
h10 = threading.Thread(name="Hilo F",target= mostrar_hora, args= (LightGray,))
h11 = threading.Thread(name="Hilo G",target= mostrar_hora, args= (LightYellow,))
h12 = threading.Thread(name="Hilo H",target= mostrar_hora, args= (LightBlue,))

h13 = threading.Thread(name="Hilo I",target= mostrar_hora, args= (BckgrDarkGray,))
h14 = threading.Thread(name="Hilo J",target= mostrar_hora, args= (BckgrLightYellow,))
h15 = threading.Thread(name="Hilo K",target= mostrar_hora, args= (BckgrLightBlue,))
h16 = threading.Thread(name="Hilo L",target= mostrar_hora, args= (BckgrLightPurple,))

h17 = threading.Thread(name="Hilo M",target= mostrar_hora, args= (BckgrWhite,))
h18 = threading.Thread(name="Hilo N",target= mostrar_hora, args= (BckgrLightCyan,))
h19 = threading.Thread(name="Hilo O",target= mostrar_hora, args= (BckgrRed,))
h20 = threading.Thread(name="Hilo P",target= mostrar_hora, args= (BckgrGreen,))

# INICIALIZAMOS LOS PROCESOS DE CADA HILO CON EL START
h1.start()
h2.start()
h3.start()
h4.start()
h5.start()
h6.start()
h7.start()
h8.start()
h9.start()
h10.start()
h11.start()
h12.start()
h13.start()
h14.start()
h15.start()
h16.start()
h17.start()
h18.start()
h19.start()
h20.start()

# OBLIGAMOS A LOS HILOS CON EL JOIN A REALIZARSE DE MANERA CONJUNTA 
h1.join()
h2.join()
h3.join()
h4.join()
h5.join()
h6.join()
h7.join()
h8.join()
h9.join()
h10.join()
h11.join()
h12.join()
h13.join()
h14.join()
h15.join()
h16.join()
h17.join()
h18.join()
h19.join()
h20.join()

# UNA VEZ TERMINADA LA IMPRESÓN POR CONSOLA, REGISTRAMOS EL TIEMPO DE EJECUCIÓN
print()
print(f"Finalizado en {(datetime.now()-inicio).total_seconds()} segundos")