<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<!DOCTYPE html>
		<html>

		<head>
			<meta charset="UTF-8">
			<title>Fruit Store</title>
		</head>

		<body>
			<h1>Fruity Loop</h1>
			<table>
				<thead>
					<tr>
						<th> Name </th>
						<th> Price </th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="eachFruit" items="${fruitList}">
						<tr>
							<td>${eachFruit.name}</td>
							<td>${eachFruit.price}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</body>

		</html>