<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<ol>
    <g:each in="${listOfAnimal}" var="animal">
        <li>${animal}</li>
    </g:each>
</ol>
</body>
</html>