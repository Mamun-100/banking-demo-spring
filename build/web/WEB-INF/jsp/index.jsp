<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <title> Spring project</title>

    </head>

    <body>
        <div class="container">
            <h4>List of Accounts ${size}</h4>
            
            <table class="table table-hover table-straped">
                <tr>
                    <th>ACCOUNT_ID</th>
                    <th>NAME</th>
                    <th>BALANCE</th>
                    
                </tr>
                <c:forEach items="${accounts}" var="a">
                    <tr>
                        <td>${a.account_id}</td>
                        <td>${a.name}</td>
                        <td>${a.balance}</td>
              
                    </tr>
                </c:forEach>
            </table>
            <form class=" form-group" method="GET" action="add.htm" >


                <table class="table table-hover table-straped">
                    <tr>
                        <td>Name:</td>
                        <td><input class="form-control" name="name" /></td>
                    </tr>

                    <tr>
                        <td>Balance:</td>
                        <td><input class="form-control" name="balance"  /></td>
                    </tr>              
                    <tr >
                        <td colspan="2"> 

                            <button type="submit" class="btn btn-success">Save</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>

