<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>Student Information</h2>
      <form:form method = "POST" action = "/HelloWeb/addMarks">
         <table>
            <tr>
               <td><form:label path = "sceince">Sceince</form:label></td>
               <td><form:input path = "sceince" /></td>
            </tr>
            <tr>
               <td><form:label path = "maths">Maths</form:label></td>
               <td><form:input path = "maths" /></td>
            </tr>
            <tr>
               <td><form:label path = "english">English</form:label></td>
               <td><form:input path = "english" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
   
</html>