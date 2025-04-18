from scipy.stats import binom

prob = 0
n = int(input("Coloque o tamanho da amostra: "))
k = int(input("Coloque a quantidade de eventos: "))
p = float(input("Coloque a probabilidade de sucesso (entre 0 e 1): "))

for i in range(k+1):  # i = 0, 1, 2
    prob += binom.pmf(i, n, p)

prob = prob * 100
print(f"A probabilidade de obter 0, 1 ou 2 sucessos é: {prob:.3f}%")