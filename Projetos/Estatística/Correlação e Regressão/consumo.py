import pandas as pd
from sklearn.linear_model import LinearRegression
import statsmodels.api as sm

df = pd.read_excel("Projetos/Estatística/Correlação e Regressão/Regressão_exercícios.xls", sheet_name="Consumo")
df.head()

# Definir X e y
X = df[['Renda', 'Tamanho Familia']]
y = df['Imposto']

# Criar o modelo
modelo = LinearRegression()
modelo.fit(X, y)


# Adicionar constante para o intercepto
X_const = sm.add_constant(X)

# Ajustar o modelo
modelo_stats = sm.OLS(y, X_const).fit()

# Mostrar o resumo
print(modelo_stats.summary())

# Equação: y(Imposto) = 1304.9048 + 33.1330 * Renda + 356.2959 * Tamanho Familia