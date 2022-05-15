# Catalogo de produtos genéricos

## criação de produto
Request Body (Json):\
{\
    "name" : "caneta",\
    "price" : 10\
}\
URL: localhost:8080/RestApi/product/save

## edição de produto
Request Body (Json): \
{\
    "name" : "caneta",\
    "price" : 10\
}\
URL: localhost:8080/RestApi/product/edit/{id}

## exclusão de produto
Request Body (Json):\
{\
    "name" : "caneta",\
    "price" : 10\
}\
URL: localhost:8080/RestApi/product/delete/{id}

## edição de nome de produto
Request Body (Json): \
{\
    "name" : "caneta",\
    "price" : 10\
}\
URL: localhost:8080/RestApi/product/editName/{id}/{name}

## filtrar produtos
Request Body (Json): \
{\
    "name" : "caneta",\
    "price" : 10\
}\
URL: localhost:8080/RestApi/productsDefault/
