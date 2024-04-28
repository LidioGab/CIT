import sys

print('insira o nome do projeto:')
nomeProjeto = input()
if(nomeProjeto == ''):
    print("DADOS INVALIDOS!")
    exit()

print('Insira a quantidade de doações recebidas:')
qtdDoacoes = int(input())

if(qtdDoacoes <= 0):
    print("DADOS INVALIDOS!")
    exit()


print('insira a meta do prejeto:')
metaProjeto = int(input())

if(metaProjeto <= 0):
    print("DADOS INVALIDOS!")
    exit()

valorDoacoes = []

for cont in range(qtdDoacoes):
    print(f'Insira o valor da {cont + 1}° doação')
    doacao = float(input())
    valorDoacoes.append(doacao)
    if(doacao < 0):
        print("DADOS INVALIDOS!")
        exit()

totalArrecadado = 0
for cont in range(qtdDoacoes):
    totalArrecadado += valorDoacoes[cont]

maiorDoacao = 0
for cont in range(0,qtdDoacoes):
    if(valorDoacoes[cont] >= maiorDoacao):
        maiorDoacao = valorDoacoes[cont]

print(f'O projeto {nomeProjeto} recebeu {qtdDoacoes} doções, totalizando {totalArrecadado}.')
print('as doações recebidas foram:')

for cont in range(qtdDoacoes):
    sys.stdout.write(f'{round(valorDoacoes[cont], 2)}')
    if(cont + 1 < qtdDoacoes):
        sys.stdout.write(' - ')
        
print()


print(f'a maior doação foi {maiorDoacao}')

if(maiorDoacao >= metaProjeto):
    print('a meta foi atingida!')

elif(maiorDoacao < metaProjeto):
    print('infelizmente a meta nao foi atingiga')