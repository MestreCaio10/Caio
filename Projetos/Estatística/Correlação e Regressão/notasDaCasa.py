import pandas as pd
from sklearn.linear_model import LinearRegression
import statsmodels.api as sm

df = pd.read_excel("Projetos/Estatística/Correlação e Regressão/Regressão_exercícios.xls", sheet_name="Notas das Casas")
df.head()

# Definir X e y
X = df[['NotaDistancia', 'NotaRecursos']]
y = df['NotaFinal']

# Criar o modelo
modelo = LinearRegression()
modelo.fit(X, y)


# Adicionar constante para o intercepto
X_const = sm.add_constant(X)

# Ajustar o modelo
modelo_stats = sm.OLS(y, X_const).fit()

# Mostrar o resumo
print(modelo_stats.summary())

#Equação: y(Nota Final) = 33.4848 + 1.8998 * NotaDistancia + 2.6108 * NotaRecursos