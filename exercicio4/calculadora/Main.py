
print("Calculadora")

value1 = float(input("Primeiro valor: "))

operador = (input("Operador (+, -, /, *): "))

while(not operador in ('+', '-', '/', '*')):
    operador = input("Operador inválido. Por favor, insira +, -, / ou * : ")

value2 = float(input("Segundo valor: "))

if(operador == "+"):
    sum = value1 + value2
    print("Resultado: {} + {} = {}".format(value1,value2,sum))
elif(operador == "-"):
    sum = value1 - value2
    print("Resultado: {} - {} = {}".format(value1,value2,sum))
elif(operador == "/"):
    sum = value1 / value2
    print("Resultado: {} / {} = {}".format(value1,value2,sum))
elif(operador == "*"):
    sum = value1 * value2
    print(f"Resultado: {value1} * {value2} = {sum:.2f}")

