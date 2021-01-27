<%@ Page Language="C#" AutoEventWireup="true" CodeFile="CookieDemo2.aspx.cs" Inherits="CookieDemo2" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <%
            if (Request.Cookies["username"] != null)
            {
                string user = Request.Cookies["username"].Value;
                Response.Write("username= " + user);
            }

            string sv = Request.Cookies["sinhvien"]["khoahoc"];
            Response.Write("khoa hoc= " + sv);



            %>
    
    </div>
    </form>
</body>
</html>
