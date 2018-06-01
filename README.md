# Spring Data Rest Application

System for storing football matches results. OneToMany Relationship. Database : PostgreSQL.
The application supports the scenarios below:

- **patch = "/match/{id}" method GET** - returns match by id
- **patch = "/match/all" method GET** - returns all matches
- **patch = "/match/best" method GET** - returns best match (most goals)
- **patch = "/match/add" method POST** - adds new match
- **patch = "/match/remove/{id}" method DELETE** - delete match by id
- **patch = "/match/remove" method DELETE** - delete all matches

- **patch = "/team/all" method GET** - returns all teams
- **patch = "/team/{id}" method GET** - returns team by id
- **patch = "/team/find?name=X" method GET** - returns team with given substring name X name in URL
- **patch = "/team/appearance" method GET** - returns team with more than one match
- **patch = "/team/add" method POST** - adds new team
