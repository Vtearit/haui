<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Output.aspx.cs" Inherits="CDIO_Section3.Output" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <h2>Bạn vừa gửi lên</h2>
            <%
                Response.Write("<br/>" + Request.Form["hoten"]);
                Response.Write("<br/>" + Request.Form["tuoi"]);
                Response.Write("<br/>" + Request.Form["dienthoai"]);
                Response.Write("<br/>" + Request.Form["email"]);
                Response.Write("<br/>" + Request.Form["username"]);
                Response.Write("<br/>" + Request.Form["password"]);
                Response.Write("<br/>" + Request.Form["password2"]);
                %>
        </div>
    </form>
</body>
</html>
