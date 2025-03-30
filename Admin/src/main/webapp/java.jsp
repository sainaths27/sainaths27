<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Java Programming Course - Sai Service</title>
    <style>
        body { font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 20px; }
        .course-container { max-width: 800px; margin: auto; background: #ffffffcc; padding: 20px; border-radius: 10px; box-shadow: 0px 0px 10px #ccc; }
        h1 { color: #4CAF50; }
        .course-details { margin-bottom: 20px; }
        .course-details ul { list-style: none; padding-left: 0; }
        .course-details li { margin-bottom: 10px; }
        .payment-button { background-color: #4CAF50; color: white; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer; font-size: 16px; }
        .payment-button:hover { background-color: #45a049; }
    </style>
</head>
<body>
    <div class="course-container">
        <h1>Java Programming Course - 4 Weeks</h1>
        <div class="course-details">
            <p>This course provides a comprehensive understanding of Java programming, focusing on application development and OOP concepts.</p>
            <h3>Course Outline:</h3>
            <ul>
                <li>✅ Week 1: Java Basics & Syntax</li>
                <li>✅ Week 2: Object-Oriented Programming (OOP)</li>
                <li>✅ Week 3: Exception Handling & File Handling</li>
                <li>✅ Week 4: Advanced Java & Final Project</li>
            </ul>
        </div>
         <form action="submit.jsp" method="post">
        <button type="submit" class="button">submit</button>
    </div>
</body>
</html>
