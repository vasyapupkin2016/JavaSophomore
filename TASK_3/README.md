Task3
===================

StudentViewer.java
-------------------
File contains empty lines, so fill them to output corresponding results

----------

CalculateSalary.java
-------------
We have two types of staff: **Pedagogical**, **Technical**.
Create class **Staff**, which has fields *name,surname,birth_year,startedWork*
Class **Staff** also must have abstract salary method
Class **Pedagogical** and **Technical** that extends from Staff class.
Pedagogical has:

 - **degree** field, which is enum with values: MSc, BSc, PhD, none, Prof; 
 - **papers** - number of published papers

Technical has :

- **department** field, which has type String; 
- **managerial** field, which is boolean and defines, if this staff manager or not

Staff salary calculation:

> **Basic Salary:**
MSc - 300
BSc - 200
PhD - 500
none - 150
Prof - 1000
Technical staff - 700
Manager staff - 1500



> **People who work:** 
>   - more than 10 years: extra 30% on basic salary
>   - more than 5 years: extra 20% on basic salary
>   - more than 3 years: extra 10% on basic salary
> 

> **Papers:**
>  - If there are more than 5 papers: extra 500
>  - if there is more than 1 paper: extra 100
>  - (BONUS) Staff that has most of papers got: extra 1000







Read from file "staff.txt" information about staff, first value defines what is the type of staff, so P means pedagogical, and T means technical.
Create one ArrayList of staff, and save all of Pedagogical and Technical objects into this ArrayList. (Use polymorhpism)
Then find:
> - Find the biggest salary of all staff.
> - Find 5 people that get most of others.
> - Find if there are staff that gets more than Professors' average.
> - (Bonus) Try to find amount of years worked by using DateTime class
 

