# Compass - API State

### Desenvolvido por 🍀:
- [José Maurício](https://github.com/JMAURICIORLIMA)

### API :gear:
- Foi utilizado spring boot com as seguintes depêndencias: Spring Data JPA, Spring Web, Swagger e hibernate-validator.
- Utilizei o banco de dados **H2**.

### Swagger
[Swagger doc](http://localhost:8080/swagger-ui.html)
                                   
            

`-----------------------------------------------------------------`

## Visão Geral
API	                                      | Descrição                        |	Corpo da solicitação     |	Corpo da resposta                                             |
:-------:                                 |:-------:                         |:-------:                  | :-------:                                                      |
POST /api/states                          |	Salvar estado                    |                           | State successfully created                                     |
GET /api/states         	                | Buscar todos os estados          |      	                   | Lista dos estados cadastrados                                  |
GET /api/states/{id}                      |	Buscar estado por id             |                           | Retorna o estado de acordo com id                              |
PUT /api/states/{id}                      |	Atualiza por id                  |                           | Update successfully performed                                  |
DELETE /api/states/{id}                   | Deleta estado por id             |                           | successfully deleted                                           |
GET /api/states/findregion/{region}       | Realiza a busca por região       |                           | Retorna todas a região de acordo com o filtro                  |
GET /api/states/population                | Estado(s) com maior população    |                           | Retorna o estado com maior população                           |
GET /api/states/maxarea                   | Retorna as 5 maiores áreas       |                           | Retorna as maiores áreas de acordo com os estados cadastrados  |
