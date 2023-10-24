
print("Calculadora de IMC")

weight = float(input("Peso: "))
height = float(input("Altura: "))

IMC = weight / (height * height)


if(IMC <= 18.5):
    print("Abaixo do peso")

elif(IMC >= 18.6)and(IMC <= 24.9):
    print("Peso ideal (parabéns)")

elif(IMC >= 25)and(IMC <= 29.9):
    print("Levemente acima do peso")

elif(IMC >= 30 and IMC <= 34.5):
    print("Obesidade Leve (grau I) ")

elif(IMC >= 35)and(IMC <= 39.9):
    print("Obesidade Severa (grau II) ")

else:
    print("Obesidade Mórbida (grau III) ")

