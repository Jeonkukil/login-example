<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
            <link rel="stylesheet" href="/css/login.css">
            <nav>
                <div class="menu">
                    <ul>
                        <li><a href="/joinForm"><strong>회원가입</strong></a> </li>
                    </ul>
                </div>
            </nav>
        </head>

        <body>
 <div class="top">
        <div class="box">

            <form action="/login" method="post">
                <h1>로그인</h1>
                <input type="text" name="username" placeholder="Enter username" required><br />
                <input type="password" name="password" placeholder="Enter password" required><br />
                <input type="email" name="email" placeholder="Enter email" required><br />
                <button>로그인</button>
            </form>
        </div>
    </div>
        </body>

        </html>