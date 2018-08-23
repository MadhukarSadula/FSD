<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>Total Marks Information</h2>
      <table>
         <tr>
            <td>Total marks</td>
            <td>${Results}</td>
         </tr>
      </table>  
   </body>
   
</html>