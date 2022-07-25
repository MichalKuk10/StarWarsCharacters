Description: 

This project uses the data fetched from GET https://swapi.dev/api/people/{id}/ which by specific ID provides data about StarWars Characters. 

Tech Stack:

*Java
*Spring Boot
*Swagger
*Database: PostgreSQL

TODO: 
*tests

1. Sending request to fetch data from SWAPI:

![alt text](https://user-images.githubusercontent.com/57062670/180788892-e5e97677-eac5-4788-b7f4-a0e4691b02c6.png)

2. In the same time object is being saved to localDB, PostgresSQL:

![alt text](https://user-images.githubusercontent.com/57062670/180789478-c3162425-bd2e-46fc-a8e9-1b31bff464b2.png)

3. Now we can get Character object from database using REST API call either by ID:
![alt text](https://user-images.githubusercontent.com/57062670/180794007-4265d248-a5fa-4d38-a57b-f3a07e92616d.png)

4. Or it's name, this searching is case insentive - which means, we can type only first few letters:

![alt text](https://user-images.githubusercontent.com/57062670/180789880-15ea0d18-563a-4100-be28-fce54343d6f3.png)

5. Hight validation has been added, it returns only results above given value, which is stored in the application.properties file:

Min Value set to 170:

![alt text](https://user-images.githubusercontent.com/57062670/180791351-7a13fd4c-9f04-4ea3-948e-a79974a3bd6a.png)

Min Value set to 185:

![alt text](https://user-images.githubusercontent.com/57062670/180791886-20afe2fe-0532-4e2c-9b95-abf4aa54dd79.png)



When data no-fund API returns 404: 


![alt text](https://user-images.githubusercontent.com/57062670/180791964-1121596d-25fb-48a8-8642-598cb066f621.png)





