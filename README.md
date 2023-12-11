# condominio
Esse projeto tem funcionalidades para a gestão de sessões de votaçãoes.

## Tecnologias usadas
O projeto usa o java JDK 17 e o banco de dados mysql como persistence data.

## Considerações
O projeto foi implementado basado em microserviçõs com as camdas MVC, pode ser melhorado usando kafka para
o procesamento da votação mediante um broker e usando spring cloud

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

Body: 
{
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

### Salvar uma votação

Method POST localhost:8080/votacoes

Body: 
{
"sessaoVotacao":{
"id":1
},
"cpf":"09467954109",
"voto":"S"
}

Caso el votação é Não

Body:
{
 "sessaoVotacao":{
 "id":1
 },
 "cpf":"09467954107",
 "voto":"N"
}

Caso se envie no body mais de 1 votação com mesmo CPF ele vai retornar 400

### Obter resultado de uma pauta

Method GET localhost:8080/pauta/{id}/resultado

id: é o id da pauta

