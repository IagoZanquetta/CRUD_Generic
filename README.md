# CRUD Generic

## Criação de Produto
Request Body (Json):\
{\
    "name" : "caneta",\
    "price" : "10"\
}\
URL: localhost:8080/RestApi/product/save

## Edição de Produto
Request Body (Json): \
{\
    "name" : "caneta"\
    "price" : "10"\
}\
URL: localhost:8080/RestApi/product/edit/{id}

## Exclusão de Produto
Request Body (Json):\
{\
    "name" : "caneta"\
    "price" : "10"\
    "id" : "1"\
}\
URL: localhost:8080/RestApi/product/delete/{id}

## Edição de Nome de Produto
Request Body (Json): \
{\
    "name" : "caneta"\
}\
URL: localhost:8080/RestApi/product/editName/{id}/{name}

## Filtrar Produto
Request Body (Json): \
{\
    "id" : "1"\
}\
URL: localhost:8080/RestApi/productsDefault/
