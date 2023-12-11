# condominio
Esse projeto tem funcionalidades para a gestão de sessões de votaçãoes.

## Tecnologias usadas
O projeto usa o java JDK 17 e o banco de dados mysql como persistence data.

## Rodamento projeto
1. Clonar el projeto do repositorio github mediante o comando: git clone https://github.com/dario-ccanto/condominio.git
2. Ubicarse en el banch development mediante o comando: git checkout development
3. Tem que executar o arquivo script.sql esse arquivo se encontrar na pasta resources.

## Serviços

### Obter a lista de todas al pautas
Method GET localhost:8080/pautas

### Salvar uma pauta

Method POST localhost:8080/pautas

Body: {
"descricao":"pauta01"
}

### Obter uma pauta

Method POST localhost:8080/pautas/{id_pauta}

### Salvar uma sessão

Method POST localhost:8080/sessoes

Body: {
 "pauta":{
  "id":1
 },
 "tempo":5
}

caso nao enviar o tempo no body, ele vai ser 1 minuto por default

{
 "pauta":{
  "id":1
 }
}
