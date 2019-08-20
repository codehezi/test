<html>
   <head>
       <title>freemarker</title>
       <meta charset="utf-8"/>
  </head>
    <body>
         <table border="1px" align="center" width="50%">
         <tr>
            <th>姓名</th>
            <th>年龄</th>
         </tr>
        <#list list as user>
           <tr>
              <td>${user.name}</td>
              <td>${user.age}</td>
           </tr>
        </#list>
      </table>
    </body>
</html>