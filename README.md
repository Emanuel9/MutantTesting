### Cerinta

Sa se scrie un program Java, precum si cerintele (specificatia) acestuia.
1. Pe baza cerintelor programului, sa se genereze date de test folosind metode functionale: equivalence partitioning, 
(b) boundary value analysis, (c) category-partition. Sa se implementeze cele 3 seturi de test obtinute folosind JUnit. 
2. Sa se transforme programul intr-un graf orientat si, pe baza acestuia, sa se genereze date de test 
care realizeaza acoperire la nivel de a) instructiune, b) decizie, c) conditie. Sa se implementeze cele 3 seturi de test folosind JUnit. 
3. Sa se calculeze complexitatea programului folosind formula lui McCabe, precum  si numarul de circuite independente. 
4. Sa se propuna un set de teste care sa realizeze o acoperire la nivel de cale si sa se implementeze setul de test rezultat in JUnit. 
5. Sa se foloseasca un generator de mutanti (e.g. MuJava/Muclipse, PIT sau alt utilitar) pentru a crea mutanti pentru programul dat.
6. Sa se ruleze seturile de test de la punctele 2), 3) si 5) contra mutantilor generati si sa se explice rezultatele. 
7. Sa se creeze teste suplimentare pentru a omora 2 dintre mutantii neechivalenti ramasi in viata.


### Enunt

Se testeaza un program care verifica daca un numar se afla 
intr-un vector de cel mult 10 numere. Pentru un intreg n
aflat intre 1 si 10 se introduc numere, iar apoi un numar nr 
care este apoi cautat printre cele n numere introduse in vector.
Programul va produce o iesire care va indica prima pozitie din
vector unde a fost gasit numarul sau un mesaj indicand ca acesta
nu a fost gasit. Utilizatorul are optiunea sa caute un alt 
numar in vector tastand y(yes) sau sa termine procesul tastand 
n(no).