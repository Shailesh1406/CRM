<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
    <link href="/css/styles.css" rel="stylesheet">
</head>
<body>
	<div class="container">
	   Error Page !!!!
	   <%=request.getAttribute("errorMessage") %>
	</div>
</body>
</html>