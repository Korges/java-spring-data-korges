# Spring Data Rest Application

System for storing football matches results. OneToMany Relationship. Database : PostgreSQL.
The application supports the scenarios below:

- **path = "/match/{id}" method GET** - returns match by id
- **path = "/match/all" method GET** - returns all matches
- **path = "/match/best" method GET** - returns best match (most goals)
- **path = "/match/add" method POST** - adds new match
- **path = "/match/remove/{id}" method DELETE** - delete match by id
- **path = "/match/remove" method DELETE** - delete all matches
-----------------------------------------------------------------------------------
- **path = "/team/all" method GET** - returns all teams
- **path = "/team/{id}" method GET** - returns team by id
- **path = "/team/find?name=X" method GET** - returns team with given substring name X name in URL
- **path = "/team/appearance" method GET** - returns team with more than one match
- **path = "/team/add" method POST** - adds new team
