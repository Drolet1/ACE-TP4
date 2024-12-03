
<p>  
    Création d'un projet SOAP pour tester des différentes méthodes exposées
    <img src="Screens/SOAP1.jpeg"/>
</p>

<p>  
    Execution d'une requête pour tester la fonction "patientById"
    <img src="Screens/SOAP2.jpeg"/>
</p>

<p>  
    Test des méthodes "Query" :
    <img src="Screens/GraphQL1.jpeg"/>
    <img src="Screens/GraphQL2.jpeg"/>
</p>

<p>  
    Test de la méthode "patientById" de type « Query » en utilisant des variables à l’entrée :
    <img src="Screens/GraphQL3.jpeg"/>
</p>

<p>  
    Test des méthodes de type "Mutation"
    <img src="Screens/GraphQL4.jpeg"/>
</p>

<p>  
    La raison pour laquelle le message prévu ne s’affiche pas au niveau de la réponse est liée à la manière dont GraphQL et Spring Boot gèrent les exceptions. Par défaut, une exception non gérée, comme la RuntimeException, est interceptée par le mécanisme global de gestion des erreurs de GraphQL, qui masque le message réel de l'erreur pour des raisons de sécurité ou de standardisation. <br><br>
    On avait besoin de créer une classe PatientNotFoundException pour gérer l'exception puis l'utiliser dans notre GraphQLController au cas où d'erreur, et pour l'appliquer on a bien créer une classe CustomGraphQLExceptionHandler qui prend comme instance le message d'erreur personnalisé et non le message par défaut.
    <img src="Screens/GraphQL5.jpeg"/>
</p>

<p>  
    Utilisation de l'outil client "Postman" après accéder à l'API via Swagger
    <img src="Screens/PostMan.jpeg"/>
</p>

