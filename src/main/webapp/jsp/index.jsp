<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html ng-app="testApp">
<head>
  <meta charset="utf-8">
  <title>Comments app</title>
  <link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.css'/>">
</head>
<body ng-controller="CommentsCtrl">
    <h2>Hello World!</h2>
    <ul>
        <li ng-repeat="comment in comments">
            <h3>{{comment.text}}<h3>
            <h4>{{comment.author}}<h4>
        </li>
    </ul>


  <script src="<c:url value='/resources/js/jquery-2.1.1.js'/>"></script>
  <script src="<c:url value='/resources/js/bootstrap.js'/>"></script>
  <script src="<c:url value='/resources/js/angular.js'/>"></script>
  <script src="<c:url value='/resources/js/controllers.js'/>"></script>
</body>
</html>
