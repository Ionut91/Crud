Java Spring Boot

CRUD
write a Spring Boot application with the necessary dependencies that:
has an entity called Car with the following columns:
an id
a modelName
a type
has a dedicated repository for the Car
has a dedicated controller for the Car that:
is mapped on cars
executes the following CRUD operations:
create a new Car
return a list of all the Cars
return a single Car - if the id is not in the db (use existsById()), returns an empty Car
updates the type of a specific Car, identified by id and passing a query param - if not present in the db, returns an empty Car
deletes a specific Car - if absent, the response will have a Conflict HTTP status
deletes all the Cars in the db
test the endpoints using Postman for:
creating 2 different cars
retrieving all the cars
retrieving a car by the id
trying to retrieve an absent car
updates the type of a specific Car
trying to update an absent car
deleting a specific Car
trying to delete an absent Car
deleting all the db

