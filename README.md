# Spring Data Rest Application

System for storing football matches results. OneToMany Relationship. Database : PostgreSQL.
The application supports the scenarios below:

- **patch = "/match/all" method GET** - returns all matches
- **patch = "/match/best" method GET** - returns nest match (most goals)
- **patch = "/team/all" method GET** - returns all teams
- **patch = "/team/find?name=X" method GET** - returns team with given X name in URL
- **patch = "/appearance" method GET** - returns team with more than one match
