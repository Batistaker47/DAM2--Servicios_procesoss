import threading

def print_function():

    print("El hilo está corriendo")

t = threading.Thread(target=print_function)

t.start()

t.join() # Espera que el hilo termine