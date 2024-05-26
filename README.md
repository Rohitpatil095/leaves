Employee microservice is part of main project Company Portal 

When new employee get onboarded in company, to create employee profile in companies database we are using this service.


Service Contains api's:- 
1) /applyleave
 - accepts payload contains leave details 
for payload specific details refer postman_collection.json file

2) /applyleave/fetchPendingRecords
 - Used to retrive all leaves applied with status as provided 
