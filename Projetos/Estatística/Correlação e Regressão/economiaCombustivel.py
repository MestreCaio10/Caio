import pandas as pd
from sklearn.linear_model import LinearRegression
import statsmodels.api as sm

# Leitura do Excel
df = pd.read_excel("Projetos/Estatística/Correlação e Regressão/Regressão_exercícios.xls", sheet_name="Economia de Combustível")

# Corrigir nomes das colunas
df.columns = df.columns.str.strip()

# Separar X e y
X = df[['Drive', 'Deslocamento', 'Cilindrada', 'Transmission']]
y = df['Economia']

# Converter variáveis categóricas em dummies e forçar tipo numérico
X = pd.get_dummies(X, drop_first=True).astype(float)

# sklearn
modelo = LinearRegression()
modelo.fit(X, y)

# statsmodels
X_const = sm.add_constant(X)
modelo_stats = sm.OLS(y, X_const).fit()
print(modelo_stats.summary())

# Equação: y(Economia) = 27.6918 - 4.3485 * Deslocamento + 1.1125 * Cilindrada - 1.2470 * Drive_4WD
